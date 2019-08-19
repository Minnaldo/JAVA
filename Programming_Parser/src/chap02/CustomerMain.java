package chap02;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerMain {

	public static void main(String[] args) {
		
		try {
			DBManager man = new DBManager();
			
//			//insert (»ðÀÔ)
//			man.insertCustomer("¶Ñ", 21, "±¤»ê±¸");
//			man.insertCustomer("¹Ì´Ï", 31, "ºÏ±¸");
//			man.insertCustomer("Áß±×´Ï", 41, "¿ëÀÎ");
//			
//			//update (¼öÁ¤)
//			man.updateCustomer(2, "¶Ñ¶Ñ", 24, "Àå´öµ¿");
//			man.updateCustomer(3, "¹Ì´Ï", 28, "Èæ¼®µ¿");
//			
//			//delete (»èÁ¦)
//			man.deleteCustomer(3);
			
			//°Ë»ö(num)
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

//		//delete (»èÁ¦)
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
