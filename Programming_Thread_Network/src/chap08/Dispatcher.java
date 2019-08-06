package chap08;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Dispatcher {

	private IManager man;
	private Scanner scan;
	private int menu;	

	public Dispatcher() {
		man = ImanagerImpl.getInstance();
		scan = new Scanner(System.in);
	}


	void go() throws IOException {
		while(true)
		{
			System.out.println("번호를 입력하세요 \n  1.입력,  2.조회   3.Send  99.종료");

			menu = scan.nextInt();

			if(menu == 1)
			{
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
			}
			else if(menu == 2)
			{
				List<Book> search = man.search();
				print(search);
			}
			else if(menu == 3)
			{
				man.send();
				System.out.println("서버로 전송성공");
			}

			else if(menu == 99)
			{
				System.out.println("종료");
				System.exit(0);
			}
		}
		//화면을 만든다고?!
		//		Frame f = new Frame();
		//		TextField tf = new TextField();
		//		Button b = new Button();
		//		f.add(tf);
		//		
		//		
		//		f.add(b, BorderLayout.SOUTH);
		//		f.addWindowListener(new WindowsAdapter() {
		//			private void windowClosing(WindowEvent e) {
		//				// TODO Auto-generated method stub
		//				super.windowClosing(e);
		//				System.exit(0);
		//			}
		//		});
		//		f.setSize(300, 500);
		//		f.setLocation(500, 500);
		//		f.setVisible(true);

	}

	void print(List<Book> list)
	{
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) throws IOException{
		new Dispatcher().go();
	}
}
