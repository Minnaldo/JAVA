package chap02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		//insert �غ���!
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");
		Statement st = con.createStatement();

		//primary key�� int�϶� auto_increment��  �ڵ����� ���� ������Ų��.
		String str = "create table customer(num int primary key auto_increment, name varchar(20), age int, addr varchar(1000))";
		boolean execute = st.execute(str);
		System.out.println("���̺� ����");
		st.close();
		con.close();
	}

}
