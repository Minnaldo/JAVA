package com.ssafy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap02.CustomerVD;

public class Test {
	int menu;
	Scanner sc;
	BookDAO dao;
	
	public Test() throws SQLException {
		sc = new Scanner(System.in);
		dao = new BookDAO();
	}
	
	private void go() {
		
		while(true)
		{
			System.out.println("1.삽입� 2.수정 3.삭제4.조회 5.Isbn검색 6.저자검색7.종료");
			menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				Author_insert();
				Book_insert();
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
				searchAuthor();
				break;
			case 7:
				count();
				break;

			default:
				dao.close();
				System.exit(0);
				break;
			}
		}

	}
	
	private void Author_insert()
	{
		Author author = new Author();
		
		System.out.println("삽입 할 authorno을 입력하세요.");
		author.setAuthorno(sc.nextInt());
		System.out.println("삽입 할 name을 입력하세요.");
		author.setName(sc.next());
		System.out.println("삽입 할 phone을 입력하세요.");
		author.setPhone(sc.next());
		dao.insertAuthor(author);
	}
	
	private void Book_insert()
	{
		Book books = new Book();
		
		System.out.println("삽입 할 Isbn을 입력하세요.");
		books.setIsbn(sc.next());
		System.out.println("삽입 할 title을 입력하세요.");
		books.setTitle(sc.next());
//		System.out.println("삽입 할  author�� �Է��ϼ���.");
//		books.setAuthor(sc.next()); 
		System.out.println("삽입 할  publisher을 입력하세요.");
		books.setPublisher(sc.next());
		System.out.println("삽입 할  price을 입력하세요.");
		books.setPrice(sc.nextInt());
		System.out.println("삽입 할  description을 입력하세요.");
		books.setDescription(sc.next());
		System.out.println("삽입 할  authorno을 입력하세요.");
		books.setAuthorno(sc.nextInt()); 
		dao.insertBook(books);
	}
	
	
	private void update()
	{
		Book books = new Book();
		
		System.out.println("삽입 할 title을 입력하세요.");
		books.setTitle(sc.next());
//		System.out.println("삽입 할  author�� �Է��ϼ���.");
//		books.setAuthor(sc.next()); 
		System.out.println("삽입 할  publisher을 입력하세요.");
		books.setPublisher(sc.next());
		System.out.println("삽입 할  price을 입력하세요.");
		books.setPrice(sc.nextInt());
		System.out.println("삽입 할  description을 입력하세요.");
		books.setDescription(sc.next());
		System.out.println("삽입 할  authorno을 입력하세요.");
		books.setAuthorno(sc.nextInt()); 
		dao.updateBook(books);
	}
	
	private void delete()
	{
		System.out.println("삭제할 isbn을 입력하세요.");
		String isbn = sc.next();
		dao.deleteBook(isbn);
	}
	
	private void printAllBooks()
	{
		List<Book> list = dao.listBooks();
		for (Book b : list) {
			System.out.println(b);
		}
	}
	
	private void search() {
		System.out.println("검색할 Isbn을 입력하세요.");
		String Isbn = sc.next();
		Book books = dao.findBook(Isbn);
		System.out.println(books);
	}
	
	private void searchAuthor() {
		System.out.println("검색할 작가를 입력하세요.");
		String Author = sc.next();
		Book books = dao.findAuthor(Author);
		System.out.println(books);
	}
	
	private void count()
	{
		System.out.println("필드 개수 : " + dao.count());
		
	}
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		new Test().go();
	}

}
