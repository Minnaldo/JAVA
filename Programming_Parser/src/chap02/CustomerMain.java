package chap02;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerMain {

	public static void main(String[] args) {
		
		try {
			DBManager man = new DBManager();
			
//			//insert (����)
//			man.insertCustomer("��", 21, "���걸");
//			man.insertCustomer("�̴�", 31, "�ϱ�");
//			man.insertCustomer("�߱״�", 41, "����");
//			
//			//update (����)
//			man.updateCustomer(2, "�Ѷ�", 24, "�����");
//			man.updateCustomer(3, "�̴�", 28, "�漮��");
//			
//			//delete (����)
//			man.deleteCustomer(3);
			
			//�˻�(num)
			CustomerVD c = man.queryCustomerByNum(1);
			System.out.println(c.toString());

//			ArrayList<CustomerVD> list = man.queryCustomer();
//			for (CustomerVD vo : list) {
//				System.out.println(vo.toString());
//			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		//delete (����)
//		DBManager man;
//		try {
//			man = new DBManager();
//			man.deleteCustomer(7);
//			man.deleteCustomer(8);
//			man.deleteCustomer(9);
//
//			ArrayList<CustomerVD> list = man.queryCustomer();
//			for (CustomerVD vo : list) {
//				System.out.println(vo.toString());
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


	}

}
