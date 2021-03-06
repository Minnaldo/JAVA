package HW_10_Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) throws DuplicateException, ProductNotFoundException {
		
		ProductMgrImpl pm = ProductMgrImpl.getInstance();
//		pm.open();

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> pList;
		Product p = null;
		
		SaveThread saveThread = new SaveThread();
		saveThread.start();
		
		while(true) {
			System.out.println("번호를 입력하세요");
			System.out.println("1. 상품정보 저장");
			System.out.println("2. 상품 전체검색");
			System.out.println("3. 상품번호로 상품을 검색");
			System.out.println("4. 상품명으로 상품을 검색(포함)");
			System.out.println("5. TV정보만 검색");
			System.out.println("6. 냉장고만 검색");
			System.out.println("7. 400L이상의 냉장고검색");
			System.out.println("8. 50인치 이상의 티비 검색");
			System.out.println("9. 상품가격 변경");
			System.out.println("10. 상품 삭제");
			System.out.println("11. 전체 재고금액");
			System.out.println("12. 상품명 포함하는 것들 중에 지정가격 이하 목록");
			System.out.println("13. 상품 정보 데이터 서버로 보내기");
			System.out.println("0. 종료");
			int sel = sc.nextInt();
			
			if(sel ==0) {
				pm.close();
				break;
			}
			else if(sel==1) {
				System.out.println("1.TV 2.냉장고 정보 입력");
				int sel2 = sc.nextInt();
					if(sel2 == 1) {
						System.out.println("상품번호,상품이름,가격,수량,인치,타입을 띄어쓰기로 구분해서 입력하세요");
						p= new TV(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next());
					}
					else if(sel2 == 2) {
						System.out.println("상품번호,상품이름,가격,수량,용량을 띄어쓰기로 구분해서 입력하세요");
						p= new Refrigerator(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
					}
					pm.add(p);
			}
			else if(sel== 2) {
				pList = pm.print_all();
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel ==3) {
				System.out.println("상품번호 입력");
				pList= pm.print_all_pronum(sc.next());
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel ==4) {
				System.out.println("상품 명 검색");
				pList = pm.print_all_proname(sc.next());
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel ==5) {
				pList = pm.check_TV();
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel ==6) {	
				pList = pm.check_Ref();
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel ==7) {
				pList = pm.searchRe400();
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel ==8) {
				pList = pm.searchTV50();
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel ==9) {
				System.out.println("상품 번호와 상품가격은?");
				pm.update(sc.next(), sc.nextInt());
			}
			else if(sel ==10) {
				System.out.println("삭제할 상품 번호?");
				pm.delete(sc.next());
			}
			else if(sel ==11) {
				System.out.println("전체 재고금액은 "+pm.total()+"원 입니다.");
			}
			else if(sel == 12) {
				System.out.println("상품명과 원하는금액은?");
				pList = pm.searchNP(sc.next(), sc.nextInt());
				for(int i=0;i<pList.size();i++){
					System.out.println(pList.get(i));
				}
			}
			else if(sel == 13) {
				System.out.println("서버로 send!!!");
				pm.send();
			}
		}
	}
}

class SaveThread extends Thread {
	@Override
	public void run() {
		ProductMgrImpl pm = ProductMgrImpl.getInstance();
		while(true)
		{
			pm.close();
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

