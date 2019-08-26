package com.ssafy.chap02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBManager {
	private Connection conn; // 멤버변수는 기본적으로 초기화가 되어있음 -> 초기화 필요 x
	private PreparedStatement pst;
	private ResultSet rs;
	static {
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public DBManager() throws SQLException {
		// 2. 커넥션 연결
		conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy",
				"ssafy");
	}

	public boolean insertCustomer(String name, int age, String addr) {
		String str = "insert into customer(name, age, addr) values(?, ?, ?)";
		boolean res = false;
		try {
			pst = conn.prepareStatement(str);
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, addr);
			res = pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public boolean updateCustomer(int num, String name, int age, String addr) {
		String str = "update customer set name = ?, age = ?, addr = ? where num = ?";
		boolean res = false;
		try {
			pst = conn.prepareStatement(str);
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, addr);
			pst.setInt(4, num);
			res = pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	public boolean deleteCustomer(int num) {
		String str = "delete from customer where num = ?";
		boolean res = false;
		try {
			pst = conn.prepareStatement(str);
			pst.setInt(1, num);
			res = pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public ArrayList<CustomerVO> queryCustomer(){
		String sql = "select * from Customer";
		ArrayList<CustomerVO> list = null;
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				CustomerVO vo = new CustomerVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setAddr(rs.getString("addr"));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public CustomerVO queryCustomerByNum(int num) {
		String sql = "select * from Customer where num = ?";
		CustomerVO vo = null;		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, num);
			rs = pst.executeQuery();
			if(rs.next()) {
			vo = new CustomerVO();
			vo.setNum(rs.getInt("num"));
			vo.setName(rs.getString("name"));
			vo.setAge(rs.getInt("age"));
			vo.setAddr(rs.getString("addr"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pst!= null) pst.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
