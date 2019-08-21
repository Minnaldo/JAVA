package chap02;

import java.sql.DriverManager;

public class ConnectionProxy {

	public static Connection getConnection() throws SQLException
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
}
