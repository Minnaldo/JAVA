package chap02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		//insert 해보자!
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");
		Statement st = con.createStatement();

		//primary key가 int일때 auto_increment가  자동으로 값을 증가시킨다.
		String str = "create table customer(num int primary key auto_increment, name varchar(20), age int, addr varchar(1000))";
		boolean execute = st.execute(str);
		System.out.println("테이블 생성");
		st.close();
		con.close();
	}

}
