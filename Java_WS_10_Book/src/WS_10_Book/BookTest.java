package WS_10_Book;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		BookMgrlmpl bmgr = BookMgrlmpl.getinstance();
		
		while (true) {		
			System.out.println("0.파일 저장 후 종료");
			System.out.println("1.도서 추가");
			System.out.println("2. 전체 도서 정보 출력");
			System.out.println("3. 전체 도서 금액 확인");
			System.out.println("4. 도서가 판매 되어 재고 수량을 빼는 기능");
			System.out.println("5. 도서가 구매 되어 재고 수량을 더하는 기능");
			System.out.println("6. ");
			
			int function = sc.nextInt();
			if (function == 0) {
				bmgr.close();
				break;
			} else if (function == 1) {
				System.out.println("1.Book 2.Magazine정보입력");
				int sel = sc.nextInt();
				if(sel == 1) {
					System.out.println("isbn title price quqntity를 띄어쓰기로 구분해서 입력하세요");
					bmgr.add(new Book(sc.next(), sc.next(), sc.nextInt(), sc.nextInt()));
				}
				else if(sel == 2) {
					System.out.println("isbn title price quqntity year month를 띄어쓰기로 구분해서 입력하세요");
					bmgr.add(new Magazine(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
				}
			} else if (function == 2) {
				for (Book b : bmgr.printBook()) {
					System.out.println(b);
				}
			} else if (function == 3) {
				System.out.println(bmgr.getTotalAmount());
			} else if (function == 4) {
				System.out.println("Isbn와 quantity를 띄어쓰기로 구분해서 입력하세요");
				bmgr.sell(sc.next(), sc.nextInt());
			} else if (function == 5) {
				System.out.println("Isbn와 quantity를 띄어쓰기로 구분해서 입력하세요");
				bmgr.sell(sc.next(), sc.nextInt());
			} else if( function == 6) {
				System.out.println("서버로부터 book 정보 전송");
				try {
					bmgr.send();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
