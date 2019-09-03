package ws_0819;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;
	static {
		try {
			// 1. Driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BookDAO() {
	}

	public Connection getConnection() throws SQLException {
		conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy",
				"ssafy");
		return conn;
	}

	public void insertBook(Book book) {
		String str = "insert into book(isbn,title,author,publisher,price,description)values(?,?,?,?,?,?)";
		boolean res = false;
		try {
			st = conn.prepareStatement(str);
			st.setString(1, book.getIsbn());
			st.setString(2, book.getTitle());
			st.setString(3, book.getAuthor());
			st.setString(4, book.getPublisher());
			st.setInt(5, book.getPrice());
			st.setString(6, book.getDescription());
			res = st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateBook(Book book) {
		String str = "update book set title=?,author=?,publisher=?,price=?,description=? where isbn=?";
		boolean res = false;
		System.out.println(book.getAuthor());
		System.out.println(book.getIsbn());
		try {
			st = conn.prepareStatement(str);
			st.setString(1, book.getTitle());
			st.setString(2, book.getAuthor());
			st.setString(3, book.getPublisher());
			st.setInt(4, book.getPrice());
			st.setString(5, book.getDescription());
			st.setString(6, book.getIsbn());
			res = st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteBook(String isbn) {
		String str = "delete from book where isbn=?";
		boolean res = false;
		try {
			st = conn.prepareStatement(str);
			st.setString(1, isbn);
			res = st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Book findBook(String isbn) {
		String sql = "select * from book where isbn = ? ";
		Book b = null;
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, isbn);
			rs = st.executeQuery();
			if (rs.next()) {
				b = new Book();
				b.setIsbn(rs.getString("isbn"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPublisher(rs.getString("publisher"));
				b.setPrice(rs.getInt("price"));
				b.setDescription(rs.getString("Description"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public List<Book> listBooks() {
		String sql = "select * from Book";
		ArrayList<Book> list = null;
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				Book b = new Book();
				b.setIsbn(rs.getString("ISBN"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPublisher(rs.getString("publisher"));
				b.setPrice(rs.getInt("price"));
				b.setDescription(rs.getString("Description"));
				list.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	public int count() {
		String sql = "select count(*) as count from book";
		int i = 0;
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				i= rs.getInt("count");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
