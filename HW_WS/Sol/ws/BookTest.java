package week3.ws;

import java.util.Scanner;

public class BookTest {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
         
        //BookManager bm = new BookManager();
        IBookMgr bm = new BookMgrImpl();
         
        while(true) {
	        System.out.println("0.종료  1.도서 추가  2.모든 도서 검색 3.모든 도서 가격 합계 4.도서 판매 5.도서 구매 ");
	         
	        int c = sc.nextInt();
	        if(c == 0) { bm.close(); break;}
	        if(c == 1) {
	            Book b = new Book();
	            System.out.println("1.도서 추가 2.잡지 추가");
	            int type = sc.nextInt();
	             
	            if(type != 1 && type != 2) {
	                System.out.println("잘못된 입력입니다.");
	            }
	            else {
	                System.out.print("isbn을 입력하시오 : ");
	                String isbn = sc.next();
	                System.out.print("제목을 입력하시오 : ");
	                String title = sc2.nextLine();
	                System.out.print("가격을 입력하시오 : ");
	                int price = sc.nextInt();
	                System.out.print("수량을 입력하시오 : ");
	                int quantity = sc.nextInt();
	                 
	                if(type == 2) {
	                    System.out.print("발간년도를 입력하시오 : ");
	                    int year = sc.nextInt();
	                    System.out.print("발간월을 입력하시오 : ");
	                    int month = sc.nextInt();
	                    b = new Magazine(isbn, title, price, quantity, year, month);
	 
	                }
	                if(type == 1) {
	                    b = new Book(isbn, title, price, quantity);
	                } 
	                 
	                bm.addBook(b);
	            }
	            System.out.println("도서 입력이 완료되었습니다.");
	             
	        } else if(c == 2) {
	            for (Book b : bm.printBook()) {
	                System.out.println(b);
	            }
	        } else if(c == 3) {
	             System.out.println("모든 도서 가격 합계 : " + bm.getTotalAmount());
	        } else if(c == 4) {
	             System.out.println("isbn을 입력해주세요");
	             String isbn = sc.next();
	             System.out.println("수량을 입력해주세요");
	             int quantity = sc.nextInt();
	             
	             try {
					bm.sell(isbn, quantity);
				} catch (QuantityException e) {
					// TODO Auto-generated catch block
					System.out.println(e.showError());
					
				} catch (ISBNNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.showError());
				}  
	        } else if(c == 5) {
	        	System.out.println("isbn을 입력해주세요");
	             String isbn = sc.next();
	             System.out.println("수량을 입력해주세요");
	             int quantity = sc.nextInt();
	             try {
						bm.buy(isbn, quantity);
					} catch (ISBNNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.showError());
					}  
	        } 
	        else {
	            System.out.println("잘못된 입력입니다.");
	        }
        }
    }
}