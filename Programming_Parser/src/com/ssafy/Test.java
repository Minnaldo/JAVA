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
			System.out.println("1�Է� 2.���� 3.���� 4.��ȸ 5.�˻� 6.����7.����");
			menu = sc.nextInt();
			switch(menu)
			{
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
				count();
				break;

			default:
				dao.close();
				System.exit(0);
				break;
			}
		}

	}
	
	private void insert()
	{
		Book books = new Book();
		
		System.out.println("���� �� Isbn�� �Է��ϼ���.");
		books.setIsbn(sc.next());
		System.out.println("���� �� title�� �Է��ϼ���.");
		books.setTitle(sc.next());
		System.out.println("���� �� author�� �Է��ϼ���.");
		books.setAuthor(sc.next()); 
		System.out.println("���� �� publisher�� �Է��ϼ���.");
		books.setPublisher(sc.next());
		System.out.println("���� �� price�� �Է��ϼ���.");
		books.setPrice(sc.nextInt());
		System.out.println("���� �� description�� �Է��ϼ���.");
		books.setDescription(sc.next());
		dao.insertBook(books);
	}
	
	private void update()
	{
		Book books = new Book();
		
		System.out.println("���� �� title�� �Է��ϼ���.");
		books.setTitle(sc.next());
		System.out.println("���� �� author�� �Է��ϼ���.");
		books.setAuthor(sc.next()); 
		System.out.println("���� �� publisher�� �Է��ϼ���.");
		books.setPublisher(sc.next());
		System.out.println("���� �� price�� �Է��ϼ���.");
		books.setPrice(sc.nextInt());
		System.out.println("���� �� description�� �Է��ϼ���.");
		books.setDescription(sc.next());
		dao.updateBook(books);
	}
	
	private void delete()
	{
		System.out.println("������ ��ȣ�� �Է��ϼ���.");
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
		System.out.println("�˻��� ��ȣ�� �Է��ϼ���");
		String Isbn = sc.next();
		Book books = dao.findBook(Isbn);
		System.out.println(books);
	}
	
	private void count()
	{
		System.out.println("��ü ���� ������ : " + dao.count());
		
	}
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		new Test().go();
	}

}
