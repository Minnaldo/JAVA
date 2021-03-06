package HW_Product;

import java.util.Scanner;

public class ProductTest {
	private ProductMgrImpl man;
	
	public ProductTest() {
		// TODO Auto-generated constructor stub
		man = ProductMgrImpl.getInstance();
		man.open();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		IProductMgr manager = ProductMgrImpl.getInstance();
		
		Product product = null;
		
		
		while(true)
		{
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
            
            int function = sc.nextInt();
            
            if(function == 0)
            {
            	manager.close();
            	break;
            }
            else if(function == 1)
            {
            	System.out.println("1. TV 데이터 입력(상품번호, 상품이름, 가격, 수량, 인터넷 연결기기 수, 인치)");
				System.out.println("2. Refrigerator 데이터 입력(상품번호, 상품이름, 가격, 수량, 보장기간)");
				int choice = sc.nextInt();
				if(choice == 1)
				{
					product = new TV(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					manager.addProduct(product);
					for(Product list : manager.printProduct())
						System.out.println(list);
				}
				if(choice == 2)
				{
					product = new Refrigerator(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					manager.addProduct(product);
					for(Product list : manager.printProduct())
						System.out.println(list);
				}
            }
            else if(function == 2)
            {
            	for(Product p : manager.printProduct())
            		System.out.println(p);
            }
            else if(function == 3)
            {
            	System.out.println("찾으려는 상품번호를 입력하세요 ");
            	String proNum = sc.next();
            	for(Product p : manager.searchNum(proNum))
            		System.out.println(p);
            }else if(function == 4)
            {
            	System.out.println("찾으려는 상품명을 입력하세요");
            	String ProName = sc.next();
            	for(Product p : manager.searchName(ProName))
            		System.out.println(p);
            }
            else if(function == 5)
            {
            	for(Product p : manager.searchTV())
            		System.out.println(p);
            }
            else if(function == 6)
            {
            	for(Product p : manager.searchRefrigerator())
            		System.out.println(p);
            }
            else if(function == 7)
            {
            	String del_num = sc.next();
            	manager.delete_num(del_num);
            }
            else if(function == 8) {
				System.out.println("sum = " + manager.sumPrice());
			}
			else if(function == 9) {
				System.out.println("1.TV, 2.냉장고");
				System.out.println(manager.product_price(sc.nextInt()));
			}
		}
	}

}
