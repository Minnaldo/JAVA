package Parser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from emp");
//		boolean execute = st.execute("insert ");
		while(rs.next())
		{
			String ename = rs.getString("ename");
			String sal = rs.getString("sal");
			String deptno = rs.getString("deptno");
			System.out.print("ename : " + ename);
			System.out.print("\tsal : " + sal);
			System.out.print("\tdeptno : " + deptno);
			System.out.println();
		}
		rs.close();
		st.close();
		con.close();
		
	}

}
