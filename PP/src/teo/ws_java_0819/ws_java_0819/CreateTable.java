package ws_0819;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy",
				"ssafy");
		Statement st = con.createStatement();
		String str="create table Book(isbn char(8) primary key,  title varchar(50), author varchar(10),publisher varchar(15), price int,description varchar(200))";
		
		boolean execute = st.execute(str);
		System.out.println("create table");
		st.close();
		con.close();
	}

}
