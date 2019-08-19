package Parser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			// 1. Driver Loading
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connection 연결
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");
			// 3. Query 작성
			//createStatement() 말고 문자열 사용하기 편한 방법이 있다.
			String sql = "select * from emp where sal > ? and deptno = ? and ename = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, 2000);
			pst.setInt(2, 10);
			pst.setString(3, "king");
			// 4. Query 실행
			//select면 executeQuery.
			rs = pst.executeQuery();
			// 5. 결과값 가져오기.
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. close();
			try {
				if(rs != null)
					rs.close();
				if(pst != null)
					pst.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("close error!!!");
			}
		}



	}

}
