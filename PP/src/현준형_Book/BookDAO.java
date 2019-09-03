package com.ssafy.ws.adjava04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ws_0822?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8",
					"ssafy", "ssafy");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("닫기 실패");
		}
	}

	public void close(PreparedStatement st) {
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("닫기 실패");
		}
	}

	public void close(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("닫기 실패");
		}
	}

	public void insertBook(Book book) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			String sql = "insert into Book(isbn, title, publisher, price, description, authorno) values(?,?,?,?,?,?)";
			st = conn.prepareStatement(sql);
			st.setString(1, book.getIsbn());
			st.setString(2, book.getTitle());
			st.setString(3, book.getPublisher());
			st.setInt(4, book.getPrice());
			st.setString(5, book.getDescription());
			st.setInt(6, book.getAuthorno());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(st);
			close(conn);
		}
	}
	
	public void updateBook(Book book) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			String sql = "update book set title = ?, publisher = ?, price = ?, description = ?, authorno = ? where isbn = ?";
			st = conn.prepareStatement(sql);
			st.setString(1, book.getTitle());
			st.setString(2, book.getPublisher());
			st.setInt(3, book.getPrice());
			st.setString(4, book.getDescription());
			st.setInt(5, book.getAuthorno());
			st.setString(6, book.getIsbn());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(st);
			close(conn);
		}
	}
	
	public void deleteBook(String isbn) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			String sql = "delete from book where isbn = ?";
			st = conn.prepareStatement(sql);
			st.setString(1, isbn);
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(st);
			close(conn);
		}
	}
	
	public Book findBook(String isbn) {
		Book b = null;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select b.isbn, b.title, b.publisher, b.price, b.description, b.authorno, a.name from book b, author a where b.authorno = a.authorno and b.isbn = ?";
			st = conn.prepareStatement(sql);
			st.setString(1, isbn);
			rs = st.executeQuery();
			while (rs.next()) {
				b = new Book();
				b.setIsbn(rs.getString("b.isbn"));
				b.setTitle(rs.getString("b.title"));
				b.setPublisher(rs.getString("b.publisher"));
				b.setPrice(rs.getInt("b.price"));
				b.setDescription(rs.getString("b.description"));
				b.setAuthorno(rs.getInt("b.authorno"));
				b.setName(rs.getString("a.name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(st);
			close(conn);
		}
		return b;
	}
	
	public List<Book> listBook() {
		List<Book> list = null;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select b.isbn, b.title, b.publisher, b.price, b.description, b.authorno, a.name from book b, author a where b.authorno = a.authorno";
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				Book b = new Book();
				b.setIsbn(rs.getString("b.isbn"));
				b.setTitle(rs.getString("b.title"));
				b.setPublisher(rs.getString("b.publisher"));
				b.setPrice(rs.getInt("b.price"));
				b.setDescription(rs.getString("b.description"));
				b.setAuthorno(rs.getInt("b.authorno"));
				b.setName(rs.getString("a.name"));
				list.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(st);
			close(conn);
		}
		return list;
	}
	
	public int count() {
		return listBook().size();
	}
}