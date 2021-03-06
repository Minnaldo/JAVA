package Product_Interface_HW_07;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProductMgr manager = new ProductMgrImpl();
		
		Product[] products = new Product[100];
		TV[] tv = new TV[100];
		Refrigerator[] refrigerator = new Refrigerator[100];
		
		
		int index=0, index_TV=0, index_Refrigerator=0;
		while(true) {
			System.out.println("1. 데이터 입력 기능 ");
            System.out.println("2. 데이터 전체 검색 기능 ");
            System.out.println("3. 상품번호로 상품을 검색하는 기능");
            System.out.println("4. 상품명으로 정보를 검색하는 기능(상품명 부분 검색 가능)");
            System.out.println("5. TV만 검색하는 기능");
            System.out.println("6. Rdfrigerator만 검색하는 기능");
            System.out.println("7. 상품번호로 상품을 삭제하는 기능 ");
            System.out.println("8. 전체 재고 상품 금액을 구하는 기능");
            System.out.println("9. 파라메터로 TV인지 냉장고인지 전달받아 각 제품의 재고금액을 리턴하는 기능");
            System.out.println("10. 400L 이상의 Refrigerator 검색하는 기능");
            System.out.println("11. 50inch 이상의 TV검색하는 기능");
            System.out.println("12. 상품 번호로 상품을 삭제하는 기능");
            System.out.println("0. 종료");
			
			Scanner sc = new Scanner(System.in);
			
			int function = sc.nextInt();
			if(function == 0) break;
			
			else if(function == 1) {
				System.out.println("1. TV 데이터 입력(상품번호, 상품이름, 가격, 수량, 인터넷 연결기기 수)");
				System.out.println("2. Refrigerator 데이터 입력(상품번호, 상품이름, 가격, 수량, 보장기간)");
				int choice = sc.nextInt();
				if(choice == 1) {
					tv[index_TV] = new TV(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					manager.addProduct(tv[index_TV]);
					index_TV++;
				}
				else if(choice == 2) {
					refrigerator[index_Refrigerator] = new Refrigerator(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					manager.addProduct(refrigerator[index_Refrigerator]);
					index_Refrigerator++;
				}
			}
			else if(function == 2) {
				Product[] product_search = manager.search();
				for(int i=0; i<product_search.length; i++) {
					System.out.println(product_search[i]);
				}
			}
			else if(function == 3) {
				System.out.println(manager.search_productNum(sc.next()));
			}
			else if(function == 4) {
				System.out.println(manager.search_name(sc.next()));
			}
			else if(function == 5) {
				Product[] product_search = manager.search_TV();
				for(int i=0; i<product_search.length; i++) {
					System.out.println(product_search[i]);
				}
			}
			else if(function == 6) {
				Product[] product_search = manager.search_Refrigerator();
				for(int i=0; i<product_search.length; i++) {
					System.out.println(product_search[i]);
				}
			}
			else if(function == 7) {
				String delete = sc.next();
				manager.deleteProduct(delete);
			}
			else if(function == 8) {
				System.out.println("sum = " + manager.sum_price());
			}
			else if(function == 9) {
				System.out.println("1.TV, 2.냉장고");
				System.out.println(manager.product_price(sc.nextInt()));
			}
			else if(function == 10)
			{
				
			}
			
		}
	}

}