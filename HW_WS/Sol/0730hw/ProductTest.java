package week3.hw;

import java.util.ArrayList;
import java.util.Scanner;



public class ProductTest {
 
  
 
    public static void main(String[] args) {
 
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
        
        IProductMgr pm = new ProductMgrImpl();
         
        while(true){
 
            System.out.println("0.종료  1.제품 추가  2.모든 제품 검색  3.제품번호로 검색  4.제품명으로 검색  5.TV만 검색 6.50인치 이상의 TV만 검색  \n7.냉장고만 검색 8.400L이상의 냉장고만 검색 9.제품 정보 수정 10.상품번호로 삭제  11.전체 재고 금액 합계");
            int c = sc.nextInt();
 
            if(c == 0) { pm.close(); break;}
 
            if(c == 1) {
 
                Product p = new Product();
                System.out.print("제품번호 : ");
                String proNum = sc.next();
                System.out.print("제품이름 : ");
                String name = sc.next();
                System.out.print("제품가격 : ");
                int price = sc.nextInt();
                System.out.print("재고 : ");
                int stock = sc.nextInt();
         
                if(proNum.startsWith("TV")){
                    System.out.print("디스플레이 타입 : ");
                    String dpType = sc.next();
                    System.out.print("디스플레이 크기 : ");
                    int inch = sc.nextInt();
                    p = new TV(proNum, name, price, stock, dpType, inch);
                }else if(proNum.startsWith("RF")){
                    System.out.print("용량 : ");
                    int capacity = sc.nextInt();
                    p = new Refrigerator(proNum, name, price, stock, capacity);
                }
 
                try {
					pm.addProduct(p);
					System.out.println("제품 입력이 완료되었습니다.");
				} catch (DuplicateException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.err.println(e.showErr());
				}
 
            } else if(c == 2) {
                for (Product product : pm.printProduct()) {
                    System.out.println(product);
                }
            } else if(c == 3) {
                System.out.println("제품번호를 입력하세요.");
                String proNum = sc.next();
                //System.out.println(pm.searchNum(proNum));
                ArrayList<Product> pr;
				try {
					pr = pm.searchNum(proNum);
					for (Product product :pr) {
						System.out.println(product);
					}
				} catch (CodeNotFoundException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					System.err.println(e.showErr());
				}
            } else if(c == 4) {
                System.out.println("제품이름을 입력하세요.");
                String name = sc.next();
                for (Product product : pm.searchName(name)) {
                    System.out.println(product);
                }
            } else if(c == 5) {
                for (Product product : pm.searchTv()) {
                    System.out.println(product);
                }
            } else if(c == 6) {
            	ArrayList<Product> pr;
				try {
					pr = pm.searchTv(50);
					for (Product product : pr) {
						System.out.println(product);
					}
				} catch (ProductNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println(e.showErr());
				}
            }else if(c == 7) {
                for (Product product : pm.searchRefrigerator()) {
                    System.out.println(product);
                }
            }else if(c == 8) {
            	ArrayList<Product> pr;
				try {
					pr = pm.searchRefrigerator(400);
					for (Product product : pr) {
						System.out.println(product);
					}
				} catch (ProductNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println(e.showErr());
				}
            }else if(c == 9) {
                System.out.println("제품명과 수정할 가격을 입력해주십시오.");
                String proNum = sc.next();
                int price = sc.nextInt();
                pm.updatePrice(proNum, price);
                System.out.println("제품 수정이 완료되었습니다.");
            } else if(c == 10) {
                System.out.println("제품번호를 입력하세요.");
                String proNum = sc.next();
                pm.delProduct(proNum);
                System.out.println("제품 삭제가 완료되었습니다.");
            } else if(c == 11) {
                System.out.println("전체 재고 상품 금액 : " + pm.sumPrice() + "원");
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
 
        }
         
 
    }
 
  
 
}