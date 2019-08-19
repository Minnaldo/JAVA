package Parser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert �غ���!
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");
		Statement st = con.createStatement();
		
		//primary key�� int�϶� auto_increment��  �ڵ����� ���� ������Ų��.
		String str = "create table customer(num int primary key auto_increment, name varchar(20), addr varchar(1000))";
		boolean execute = st.execute(str);
		System.out.println("���̺� ����");
		st.close();
		con.close();
	}

}
