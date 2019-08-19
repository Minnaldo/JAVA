package Parser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//insert 해보자!
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");

		//primary key가 int일때 auto_increment가  자동으로 값을 증가시킨다.
//		String str = "create table customer(num int primary key auto_increment, name varchar(20), addr varchar(1000))";
		
		//num은 자동증가라 생략해도 에러가 아니다.
		String str = "insert into customer (name, addr) values(?, ?)";
		PreparedStatement st = con.prepareStatement(str);	//preparestatement는 statement 상속받은 애다.
		st.setString(1, "홍길동");
		st.setString(2, "광산구");
				
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
