package Book_Interface_WS_07;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BookManager[] BM = new BookManager[100];
//		Book[] book_information = new Book[100];

		IBookMgr book_mgr = new BookMgrImpl();
		Book[] book_information = new Book[100];
		Book[] magazine_information = new Magazine[100];
		
		int index = 0;

		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("1. 데이터 입력 기능 ");
			System.out.println("2. 데이터 전체 검색 기능 ");
			System.out.println("3. Isbn으로 정보를 검색하는 기능");
			System.out.println("4. Title로 정보를 검색하는 기능(파라미터로 주어진 제목을 포함하는 모든 정보");
			System.out.println("5. Book만 검색하는 기능");
			System.out.println("6. Magazine만 검색하는 기능");
			System.out.println("7. 출판사로 검색하는 기능 ");
			System.out.println("8. 가격으로 검색 기능 (파라미터로 주어진 가격보다 낮은 도서 정보 검색)");
			System.out.println("9. 저장된 모든 도서의 금액 합계를 구하는 기능");
			System.out.println("10. 저장된 모든 도서의 금액 합계를 구하는 기능");
			System.out.println("11. 저장된 모든 도서의 금액 평균를 구하는 기능");
			System.out.println("0. 탈출하세요.");
			
			int a = sc.nextInt();
			
			
			if(a == 0)
			{
				break;
			}
			else if ( a == 1 )
			{	//Book 정보 입력.
				book_information[index] = new Book(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next());
				book_mgr.addBook(book_information[index]);
				index++;
			}
			else if ( a == 2 )
			{	//북 정보 전체 출력
				Book[] book_search = book_mgr.search();
				for(int i = 0; i < book_search.length; i++)
				{
					System.out.println(book_search[i]);
				}
			}
			else if ( a == 3 )
			{	//Isbn으로 정보 검색 기능.
				System.out.println(book_mgr.book_isbn(sc.next()));
			}
			
			else if ( a == 4 )
			{	//Title 정보를 검색하는 기능
				System.out.println(book_mgr.book_title(sc.next()));
			}
			
			else if ( a == 5 )
			{	//Book만 검색
				Book[] book_search = book_mgr.searchBook();
				for (int i = 0; i < book_search.length; i++)
				{
					System.out.println(book_search[i]);
				}
				
			}
			
			else if ( a == 6 )
			{	//Magazine만 검색
				Book[] book_search = book_mgr.searchMagazine();
				for(int i = 0; i < book_search.length; i++)
				{
					System.out.println(book_search[i]);
				}
			}
			
			else if ( a == 7 )
			{	//출판사로 검색하는 기능
				System.out.println(book_mgr.book_publisher(sc.next()));
			}
			
			else if ( a == 8 )
			{
				Book[] book_underprice = book_mgr.search_price(sc.nextInt()); 
				for(int i = 0; i < book_underprice.length; i++)
				{
					System.out.println(book_mgr.book_price(sc.nextInt()));
				}
			}
			
			else if ( a == 9 )
			{
				System.out.println("sum = " + book_mgr.sumPrice());
			}
			
			else if (a == 10)
			{
				System.out.println(("avg = " + book_mgr.average_price()));
			}
		}
		
	}

}
