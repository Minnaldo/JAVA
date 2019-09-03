package ws_0819;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	int menu;
	Scanner s;
	BookDAO book;

	public Test() throws SQLException {
		s = new Scanner(System.in);
		book = new BookDAO();
	}

	private void go() throws SQLException {
		
		while (true) {
			System.out.println("0.연결 1.입력 2.수정 3.삭제 4.조회 5.검색 6.카운트 7.종료");
			menu = s.nextInt();
			switch (menu) {
			case 0:
				connection();
				break;
			case 1:
				insert();
				printAllBooks();
				break;
			case 2:
				update();
				printAllBooks();
				break;
			case 3:
				delete();
				printAllBooks();
				break;
			case 4:
				printAllBooks();
				break;
			case 5:
				search();
				break;
			case 6:
				count_book();
				break;
			default:
				book.close();
				System.exit(0);
				break;
			}
		}
	}

	private void connection() throws SQLException {
		book.getConnection();
	}
	private void search() {
		System.out.println("검색할 isbn 입력하세요");
		String isbn = s.next();
		Book b = book.findBook(isbn);
		System.out.println(b);
	}

	private void printAllBooks() {
		ArrayList<Book> list = (ArrayList<Book>) book.listBooks();
		for(Book b:list) {
			System.out.println(b);
		}
	}

	private void delete() {
		System.out.println("삭제할 isbn를 입력하세요");
		String isbn = s.next();
		book.deleteBook(isbn);
	}

	private void update() {
		System.out.println("업데이트할 ISBN를 입력하세요");
		String isbn = s.next();
		System.out.println("업데이트할 title을 입력하세요");
		String title = s.next();
		System.out.println("업데이트할 Author를 입력하세요");
		String author = s.next();
		System.out.println("업데이트할 publisher를 입력하세요");
		String publisher = s.next();
		System.out.println("업데이트할 가격을 입력하세요");
		int price = s.nextInt();
		System.out.println("업데이트할 description을 입력하세요");
		String description = s.next();
		Book b = new Book(isbn, title, author, publisher, price, description);
		book.updateBook(b);
	}

	private void insert() {
		System.out.println("추가할 ISBN를 입력하세요");
		String isbn = s.next();
		System.out.println("추가할 title을 입력하세요");
		String title = s.next();
		System.out.println("추가할 Author를 입력하세요");
		String author = s.next();
		System.out.println("추가할 publisher를 입력하세요");
		String publisher = s.next();
		System.out.println("추가할 가격을 입력하세요");
		int price = s.nextInt();
		System.out.println("추가할 description을 입력하세요");
		String description = s.next();

		Book b = new Book(isbn, title, author, publisher, price, description);
		book.insertBook(b);
	
	}
	private void count_book() {
		System.out.println(book.count());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Test().go();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
