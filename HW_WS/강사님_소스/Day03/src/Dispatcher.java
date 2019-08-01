import java.util.ArrayList;
import java.util.Scanner;

public class Dispatcher {
	private IManager man;
	private Scanner scan;
	private boolean flag = true;
	private int menu;

	public Dispatcher() {
		man = ListManager.getInstance();
		man.restore();
		scan = new Scanner(System.in);
	}

	public void go() {
		while (flag) {
			System.out.println("하시려는 작업번호를 선택해주세요");
			System.out.println("1.모든조회 2.추가 3.수정 4.삭제 5.조회 6.종료 99.모두가 일을 합니다");
			menu = scan.nextInt();
			int num =0;
			switch (menu) {
			case 1:
				ArrayList<Employee> searchAll = man.searchAll();
				for (Employee emp : searchAll) {
					System.out.println(emp.whoami());
				}
				break;
			case 2:
				System.out.println("추가려는 근로자를 선택해주세요 1.근로자 2.영업 3.개발자");
				int submenu = scan.nextInt();
				System.out.println("추가려는 근로자 번호를 입력해주세요");
				num = scan.nextInt();
				switch (submenu) {
				case 1:
					man.add(new Employee(num));
					break;
				case 2:
					man.add(new Salesman(num));
					break;
				case 3:
					man.add(new Programmer(num));
					break;
				default:
					break;
				}

				break;
			case 3:
				System.out.println("수정하려고 하는 근로자의 번호를 입력하세요");
				num = scan.nextInt();
				man.modify(new Employee(num));
				break;
			case 4:
				System.out.println("삭제하려고 하는 근로자의 번호를 입력하세요");
				num = scan.nextInt();
				man.delete(new Employee(num));
				break;
			case 5:
				System.out.println("조회하려고 하는 근로자의 번호를 입력하세요");
				num = scan.nextInt();
				Employee search;
				try {
					search = man.search(num);
					System.out.println(search.whoami());
				} catch (MyDataNotFoundException e) {
					// TODO Auto-generated catch block
					//e.print();
					e.printStackTrace();
				}
				
				break;
			case 6:
				man.save();
				flag = false;
				break;
			case 99:
				man.allWork();
				break;
			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dispatcher().go();
	}
}
