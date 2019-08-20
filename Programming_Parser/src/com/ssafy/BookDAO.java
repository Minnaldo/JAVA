package com.ssafy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
//	Book books = new Book();

	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;
	private int cnt;
	
	//static block���� �ѹ��� ����!
	static {
		try {
			//1. Driver Loading
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BookDAO() throws SQLException {
		//2. Connection ����
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");

	}

	public void insertBook(Book book)
	{
		String str = "insert into Books (isbn, title, publisher, price, description, authorno) values(?, ?, ?, ?, ?, ?)";

		try {
			st = conn.prepareStatement(str);
			st.setString(1, book.getIsbn());
			st.setString(2, book.getTitle());
			st.setString(3, book.getPublisher());
			st.setInt(4, book.getPrice());
			st.setString(5, book.getDescription());
			st.setInt(6, book.getAuthorno());
			st.execute();
			cnt++;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	public void insertAuthor(Author author)
	{
//		String str = "insert into Books (isbn, title, publisher, price, description, authorno) values(?, ?, ?, ?, ?, ?)";
		String str = "insert into Author (authorno, name, phone) values(?, ?, ?)";
		
		try {
			st = conn.prepareStatement(str);
			st.setInt(1, author.getAuthorno());
			st.setString(2, author.getName());
			st.setString(3, author.getPhone());
			st.execute();
			cnt++;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void updateBook(Book book)
	{
		String str = "update Books set title=?, publisher=?, price=?, description=?, authorno=? where isbn=?";

		try {
			st = conn.prepareStatement(str);
			st.setString(2, book.getTitle());
			st.setString(3, book.getPublisher());
			st.setInt(4, book.getPrice());
			st.setString(5, book.getDescription());
			st.setInt(4, book.getAuthorno());
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteBook(String isbn)
	{
		String str = "delete from Books where isbn=?";
		try {
			st = conn.prepareStatement(str);
			st.setString(1, isbn);
			st.execute();
			cnt--;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Book> listBooks()
	{
		String sql = "select * from Books";
		
		List<Book> list = new ArrayList<>();
		try {
			st = conn.prepareStatement(sql);
			
			rs = st.executeQuery();
			
			while(rs.next())
			{
				Book books = new Book();
				books.setIsbn(rs.getString("isbn"));
				books.setTitle(rs.getString("title"));
//				books.setAuthor(rs.getString("author"));
				books.setPublisher(rs.getString("publisher"));
				books.setPrice(rs.getInt("price"));
				books.setDescription(rs.getString("description"));
				books.setAuthorno(rs.getInt("authorno"));
				list.add(books);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	public Book findBook(String Isbn)
	{
		String sql = "select * from Books where Isbn=?";
		
		Book books = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, Isbn);
			
			rs = st.executeQuery();
			
			if(rs.next())
			{
				books = new Book();
				books.setIsbn(rs.getString("isbn"));
				books.setTitle(rs.getString("title"));
//				books.setAuthor(rs.getString("author"));
				books.setPublisher(rs.getString("publisher"));
				books.setPrice(rs.getInt("price"));
				books.setDescription(rs.getString("description"));
				books.setAuthorno(rs.getInt("Authorno"));
			}
			else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return books;
	}
	
	public Book findAuthor(String author)
	{
		String sql = "select title, price, publisher from Books where author=?";
		
		Book books = null;
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, author);
			
			rs = st.executeQuery();
			
			if(rs.next())
			{
				books = new Book();
//				books.setIsbn(rs.getString("isbn"));
				books.setTitle(rs.getString("title"));
//				books.setAuthor(rs.getString("author"));
				books.setPublisher(rs.getString("publisher"));
				books.setPrice(rs.getInt("price"));
//				books.setDescription(rs.getString("description"));
			}
			else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}
	
	
	public int count()
	{
		return cnt;
	}
	
	public void close()
	{
		try {
			if(rs != null)	rs.close();
			if(st != null)	st.close();
			if(conn != null)	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
