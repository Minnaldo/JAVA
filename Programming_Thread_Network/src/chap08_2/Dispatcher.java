package chap08_2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Dispatcher {
	private IManager man;
	private Scanner scan;
	private int menu;

	public Dispatcher() {
		man = ManagerImpl.getInstance();
		scan = new Scanner(System.in);
	};

	public void go() {
		while (true) {
			System.out.println("번호를 입력하세요 \n 1.입력,2.조회,3.Send,99.종료");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("isbn title 가격을 입력하세요");
				String isbn = scan.next();
				String title = scan.next();
				int price = scan.nextInt();
				try {
					man.add(new Book(isbn, title, price));
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				List<Book> search = man.search();
				print(search);
				break;
			case 3:
				try {
					man.send();
					System.out.println("서버로 전송성공");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				System.exit(0);
				break;
			}
		}
	};

	private void print(List<Book> list) {
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dispatcher().go();
	}
}
