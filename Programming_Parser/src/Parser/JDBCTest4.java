package Parser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//insert �غ���!
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");

		//primary key�� int�϶� auto_increment��  �ڵ����� ���� ������Ų��.
//		String str = "create table customer(num int primary key auto_increment, name varchar(20), addr varchar(1000))";
		
		//num�� �ڵ������� �����ص� ������ �ƴϴ�.
		String str = "insert into customer (name, addr) values(?, ?)";
		PreparedStatement st = con.prepareStatement(str);	//preparestatement�� statement ��ӹ��� �ִ�.
		st.setString(1, "ȫ�浿");
		st.setString(2, "���걸");
				
		boolean execute = st.execute();
		
		
		String str2 = "select * from customer";
		Statement st2 = con.createStatement();
		ResultSet rs = st2.executeQuery(str2);
		while(rs.next())
		{
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String addr = rs.getString("addr");
			System.out.println(num + ", " + name + ", " + addr);
		}
		
		
		st.close();
		con.close();
	}

}
