package Book_WS_Java_08;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMgrImpl bmgr = new BookMgrImpl();
		Book[] books = new Book[100];
		Magazine[] magazines = new Magazine[100];
		Scanner sc = new Scanner(System.in);

		int index = 0;

		while (true) {
			int function = sc.nextInt();
			if (function == 0) {
				bmgr.close();
				break;
			} else if (function == 1) {
				books[index] = new Book(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
				bmgr.addBook(books[index]);
				index++;
			} else if (function == 2) {

				for (Book b : bmgr.search()) {
					System.out.println(b);
				}
			} else if (function == 3) {
				System.out.println(bmgr.getTotalAmount());
			} else if (function == 4) {
				System.out.println("isbn 입력 하세요");
				String isbn = sc.next();
				System.out.println("quantity 입력하세요");
				int quantity = sc.nextInt();

				bmgr.sell(isbn, quantity);

			} else if (function == 5) {
				System.out.println("isbn 입력 하세요");
				String isbn = sc.next();
				System.out.println("quantity 입력하세요");
				int quantity = sc.nextInt();
				bmgr.buy(isbn, quantity);

			}

		}
	}

}
