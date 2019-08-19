package chap02;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DispatcherConsole {
	int menu;
	Scanner s;
	DBManager man;

	public DispatcherConsole() throws SQLException {
		s = new Scanner(System.in);
		man = new DBManager();
	}

	private void go() {

		while(true)
		{
			System.out.println("1입력 2.수정 3.삭제 4.조회 5.검색 6.종료");
			menu = s.nextInt();
			switch(menu)
			{
			case 1:
				insert();
				list();
				break;
			case 2:
				update();
				list();
				break;
			case 3:
				delete();
				list();
				break;
			case 4:
				list();
				break;
			case 5:
				search();
				break;
			case 6:
				man.close();
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	private void search() {
		System.out.println("검색할 번호를 입력하세요");
		int num = s.nextInt();
		CustomerVD vo = man.queryCustomerByNum(num);
		System.out.println(vo);
	}

	private void list() {
		ArrayList<CustomerVD> list = man.queryCustomer();
		for (CustomerVD vo : list) {
			System.out.println(vo);
		}

	}

	private void delete() {
		System.out.println("삭제할 번호를 입력하세요");
		int num = s.nextInt();
		man.deleteCustomer(num);
	}

	private void update() {
		System.out.println("수정할 번호를 입력하세요");
		int num = s.nextInt();
		System.out.println("수정할 이름을 입력하세요");
		String name = s.next();
		System.out.println("수정할 나이를 입력하세요");
		int age = s.nextInt();
		System.out.println("수정할 주소를 입력하세요");
		String addr = s.next();
		man.updateCustomer(num, name, age, addr);

		//		list();
	}

	private void insert() {
		System.out.println("삽입 할 이름을 입력하세요");
		String name = s.next();
		System.out.println("삽입 할 나이를 입력하세요");
		int age = s.nextInt();
		System.out.println("삽입 할 주소를 입력하세요");
		String addr = s.next();
		man.insertCustomer(name, age, addr);

	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		new DispatcherConsole().go();
	}

}
