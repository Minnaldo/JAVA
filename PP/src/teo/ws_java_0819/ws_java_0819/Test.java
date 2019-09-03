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
			System.out.println("0.���� 1.�Է� 2.���� 3.���� 4.��ȸ 5.�˻� 6.ī��Ʈ 7.����");
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
		System.out.println("�˻��� isbn �Է��ϼ���");
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
		System.out.println("������ isbn�� �Է��ϼ���");
		String isbn = s.next();
		book.deleteBook(isbn);
	}

	private void update() {
		System.out.println("������Ʈ�� ISBN�� �Է��ϼ���");
		String isbn = s.next();
		System.out.println("������Ʈ�� title�� �Է��ϼ���");
		String title = s.next();
		System.out.println("������Ʈ�� Author�� �Է��ϼ���");
		String author = s.next();
		System.out.println("������Ʈ�� publisher�� �Է��ϼ���");
		String publisher = s.next();
		System.out.println("������Ʈ�� ������ �Է��ϼ���");
		int price = s.nextInt();
		System.out.println("������Ʈ�� description�� �Է��ϼ���");
		String description = s.next();
		Book b = new Book(isbn, title, author, publisher, price, description);
		book.updateBook(b);
	}

	private void insert() {
		System.out.println("�߰��� ISBN�� �Է��ϼ���");
		String isbn = s.next();
		System.out.println("�߰��� title�� �Է��ϼ���");
		String title = s.next();
		System.out.println("�߰��� Author�� �Է��ϼ���");
		String author = s.next();
		System.out.println("�߰��� publisher�� �Է��ϼ���");
		String publisher = s.next();
		System.out.println("�߰��� ������ �Է��ϼ���");
		int price = s.nextInt();
		System.out.println("�߰��� description�� �Է��ϼ���");
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
