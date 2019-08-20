package chap02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


//DBManager�� Singletone�� ������ �ʿ䰡 ����.
public class DBManager {
	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;

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

	public DBManager() throws SQLException {
		//2. Connection ����
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");

	}

	public Connection getConnection() throws SQLException
	{
		try {
			//1. Driver Loading
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connection ����
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public boolean insertCustomer(String name, int age, String addr)
	{
		String str = "insert into customer (name, age, addr) values(?, ?, ?)";
		boolean res = false;
		try {
			st = conn.prepareStatement(str);
			st.setString(1, name);
			st.setInt(2,  age);
			st.setString(3, addr);
			res = st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//preparestatement�� statement ��ӹ��� �ִ�.

		return res;
	}

	public boolean updateCustomer(int num, String name, int age, String addr)
	{
		String str = "update customer set name=?, age=?, addr=? where num=?";
		boolean res = false;

		try {
			st = conn.prepareStatement(str);
			st.setString(1, name);
			st.setInt(2, age);
			st.setString(3, addr);
			st.setInt(4, num);
			res = st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return res;
	}

	public boolean deleteCustomer(int num)
	{
		boolean res = false;

		String str = "delete from customer where num=?";
		try {
			st = conn.prepareStatement(str);
			st.setInt(1, num);
			res = st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return res;
	}


	//��ü ��ȸ & �˻���ȸ
	public ArrayList<CustomerVD> queryCustomer() {	
		String sql = "select * from Customer";

		ArrayList<CustomerVD> list = null;
		try {
			st = conn.prepareStatement(sql);
			//4. Query ����
			rs = st.executeQuery();

			list = new ArrayList<>();
			while(rs.next()) {
				CustomerVD vo = new CustomerVD();
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


	public CustomerVD queryCustomerByNum(int num) {
		String sql = "select * from Customer where num=?";
		CustomerVD vo = null;
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, num);
			//4. Query ����
			rs = st.executeQuery();
			if(rs.next())
			{
				vo = new CustomerVD();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setAddr(rs.getString("addr"));
			}
			else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return vo;
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
