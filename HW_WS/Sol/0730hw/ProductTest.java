package week3.hw;

import java.util.ArrayList;
import java.util.Scanner;



public class ProductTest {
 
  
 
    public static void main(String[] args) {
 
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
        
        IProductMgr pm = new ProductMgrImpl();
         
        while(true){
 
            System.out.println("0.����  1.��ǰ �߰�  2.��� ��ǰ �˻�  3.��ǰ��ȣ�� �˻�  4.��ǰ������ �˻�  5.TV�� �˻� 6.50��ġ �̻��� TV�� �˻�  \n7.����� �˻� 8.400L�̻��� ����� �˻� 9.��ǰ ���� ���� 10.��ǰ��ȣ�� ����  11.��ü ��� �ݾ� �հ�");
            int c = sc.nextInt();
 
            if(c == 0) { pm.close(); break;}
 
            if(c == 1) {
 
                Product p = new Product();
                System.out.print("��ǰ��ȣ : ");
                String proNum = sc.next();
                System.out.print("��ǰ�̸� : ");
                String name = sc.next();
                System.out.print("��ǰ���� : ");
                int price = sc.nextInt();
                System.out.print("��� : ");
                int stock = sc.nextInt();
         
                if(proNum.startsWith("TV")){
                    System.out.print("���÷��� Ÿ�� : ");
                    String dpType = sc.next();
                    System.out.print("���÷��� ũ�� : ");
                    int inch = sc.nextInt();
                    p = new TV(proNum, name, price, stock, dpType, inch);
                }else if(proNum.startsWith("RF")){
                    System.out.print("�뷮 : ");
                    int capacity = sc.nextInt();
                    p = new Refrigerator(proNum, name, price, stock, capacity);
                }
 
                try {
					pm.addProduct(p);
					System.out.println("��ǰ �Է��� �Ϸ�Ǿ����ϴ�.");
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
                System.out.println("��ǰ��ȣ�� �Է��ϼ���.");
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
                System.out.println("��ǰ�̸��� �Է��ϼ���.");
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
                System.out.println("��ǰ��� ������ ������ �Է����ֽʽÿ�.");
                String proNum = sc.next();
                int price = sc.nextInt();
                pm.updatePrice(proNum, price);
                System.out.println("��ǰ ������ �Ϸ�Ǿ����ϴ�.");
            } else if(c == 10) {
                System.out.println("��ǰ��ȣ�� �Է��ϼ���.");
                String proNum = sc.next();
                pm.delProduct(proNum);
                System.out.println("��ǰ ������ �Ϸ�Ǿ����ϴ�.");
            } else if(c == 11) {
                System.out.println("��ü ��� ��ǰ �ݾ� : " + pm.sumPrice() + "��");
            }
            else {
                System.out.println("�߸��� �Է��Դϴ�.");
            }
 
        }
         
 
    }
 
  
 
}