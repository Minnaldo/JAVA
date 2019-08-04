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
	        System.out.println("0.����  1.���� �߰�  2.��� ���� �˻� 3.��� ���� ���� �հ� 4.���� �Ǹ� 5.���� ���� ");
	         
	        int c = sc.nextInt();
	        if(c == 0) { bm.close(); break;}
	        if(c == 1) {
	            Book b = new Book();
	            System.out.println("1.���� �߰� 2.���� �߰�");
	            int type = sc.nextInt();
	             
	            if(type != 1 && type != 2) {
	                System.out.println("�߸��� �Է��Դϴ�.");
	            }
	            else {
	                System.out.print("isbn�� �Է��Ͻÿ� : ");
	                String isbn = sc.next();
	                System.out.print("������ �Է��Ͻÿ� : ");
	                String title = sc2.nextLine();
	                System.out.print("������ �Է��Ͻÿ� : ");
	                int price = sc.nextInt();
	                System.out.print("������ �Է��Ͻÿ� : ");
	                int quantity = sc.nextInt();
	                 
	                if(type == 2) {
	                    System.out.print("�߰��⵵�� �Է��Ͻÿ� : ");
	                    int year = sc.nextInt();
	                    System.out.print("�߰����� �Է��Ͻÿ� : ");
	                    int month = sc.nextInt();
	                    b = new Magazine(isbn, title, price, quantity, year, month);
	 
	                }
	                if(type == 1) {
	                    b = new Book(isbn, title, price, quantity);
	                } 
	                 
	                bm.addBook(b);
	            }
	            System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
	             
	        } else if(c == 2) {
	            for (Book b : bm.printBook()) {
	                System.out.println(b);
	            }
	        } else if(c == 3) {
	             System.out.println("��� ���� ���� �հ� : " + bm.getTotalAmount());
	        } else if(c == 4) {
	             System.out.println("isbn�� �Է����ּ���");
	             String isbn = sc.next();
	             System.out.println("������ �Է����ּ���");
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
	        	System.out.println("isbn�� �Է����ּ���");
	             String isbn = sc.next();
	             System.out.println("������ �Է����ּ���");
	             int quantity = sc.nextInt();
	             try {
						bm.buy(isbn, quantity);
					} catch (ISBNNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.showError());
					}  
	        } 
	        else {
	            System.out.println("�߸��� �Է��Դϴ�.");
	        }
        }
    }
}