package com.ssafy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class ws_java_0820 {
	static List<Book> list = null;
	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "ssafy", "ssafy");

			Statement st = con.createStatement();
			String create="create table Author(authorno int(2) primary key, name varchar(50), phone varchar(30))";



			// 3. Book과 Author 테이블을 join하여 도서명, 가격, 저자명을 검색         
			String str = "select book.title, book.price, author.name from book, Author where book.authorno = author.authorno";
			pst = con.prepareStatement(str);
			rs = pst.executeQuery();
			while (rs.next()) {
				String title = rs.getString("title");
				int price = rs.getInt("price");
				String name = rs.getString("name");
				System.out.println(title+", "+price+", "+name);
			}System.out.println("==========================================");
			pst = null;
			rs = null;

			// 4. 이름이 '김태희'인 저자의 도서명, isbn, 출판사를 출력
			str = "select title, isbn, publisher from book where authorno = (select authorno from author where name = ?)";
			pst = con.prepareStatement(str);
			pst.setString(1, "김태희");
			rs = pst.executeQuery();
			if(rs.next()) {
				String title = rs.getString("title");
				String isbn = rs.getString("isbn");
				String publisher = rs.getString("publisher");
				System.out.println(title+", "+isbn+", "+publisher);
			}System.out.println("==========================================");
			pst = null;
			rs = null;

			// 5. author 테이블에 있는 저자명 별로 출간된 도서들을 도서명, 출판사, 가격, 저자명을 출력하라 / join, group by
			str = "select book.title, book.publisher, book.price, author.name from book, author where book.authorno = author.authorno group by author.name";
			pst = con.prepareStatement(str);
			rs = pst.executeQuery();
			while (rs.next()) {
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				String name = rs.getString("name");
				System.out.println(title+", "+publisher+", "+price+", "+name);
			}System.out.println("==========================================");
			pst = null;
			rs = null;

			// 6. book 테이블에 있는 title과 publisher를 이용하여 서로의 관계를 다음과 같이 출력하도록 쿼리하세요 - IoT 세상은 미래닷컴에서 출판했다. / concat
			str = "select concat(title, '은 ', publisher, '에서 출판했다.') as sentence from book";
			pst = con.prepareStatement(str);
			rs = pst.executeQuery();
			while (rs.next()) {
				String sentence = rs.getString("sentence");
				System.out.println(sentence);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. close
			try {
				if(rs!=null)rs.close();
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("close error");
			}
		}
	}
	public void printAllBooks(List<Book> list) {
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}
}