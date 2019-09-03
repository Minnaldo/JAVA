package com.ssafy.ws.adjava04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
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

	public void insertAuthor(Author author) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			String sql = "insert into Author(authorno, name, phone) values(?,?,?)";
			st = conn.prepareStatement(sql);
			st.setInt(1, author.getAuthorno());
			st.setString(2, author.getName());
			st.setString(3, author.getName());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(st);
			close(conn);
		}
	}

	public void updateBook(Author author) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			String sql = "update author set name = ?, phone = ? where authorno = ?";
			st = conn.prepareStatement(sql);
			st.setString(1, author.getName());
			st.setString(2, author.getPhone());
			st.setInt(3, author.getAuthorno());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(st);
			close(conn);
		}
	}

	public void deleteAuthor(int authorno) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			String sql = "delete from author where authorno = ?";
			st = conn.prepareStatement(sql);
			st.setInt(1, authorno);
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(st);
			close(conn);
		}
	}

	public Author findAuthor(int authorno) {
		Author a = null;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select authorno, name, phone from author where authorno = ?";
			st = conn.prepareStatement(sql);
			st.setInt(1, authorno);
			rs = st.executeQuery();
			while (rs.next()) {
				a = new Author();
				a.setAuthorno(rs.getInt("authorno"));
				a.setName(rs.getString("name"));
				a.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(st);
			close(conn);
		}
		return a;
	}

	public List<Author> listAuthor() {
		List<Author> list = null;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select authorno, name, phone from author";
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				Author a = new Author();
				a.setAuthorno(rs.getInt("authorno"));
				a.setName(rs.getString("name"));
				a.setPhone(rs.getString("phone"));
				list.add(a);
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
		return listAuthor().size();
	}
}