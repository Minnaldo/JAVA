package day03;

import java.util.Scanner;

public class Dispatcher {
	private Manager man;
	private Scanner scan;
	private boolean flag = true;
	private int menu = 0;
	int num = 0;
	
	public Dispatcher()
	{
		man = Manager.getInstance();
		scan = new Scanner(System.in);
	}
	
	public void go()
	{
		while(flag)
		{
			System.out.println("하시려는 작업번호를 선택해주세요.");
			System.out.println("1.모든조회 2.추가  3.수정  4.삭제  5.조회 6.종료  99.모두가 일을 합니다.");
			menu = scan.nextInt();
			
			if(menu == 1)
			{
				Employee[] searchAll = man.search_all();
				for(Employee emp : searchAll)
				{
					System.out.println(emp.whoami());
				}
//				break;
			}
			if(menu == 2)
			{
				System.out.println("추가하려는 근로자를 선택하세요.");
				System.out.println("1.근로자  2.세일즈  3.개발자");
				int submenu = scan.nextInt();
				
				System.out.println("근로자 번호를 선택하세요");
				num = scan.nextInt();
				
				if(submenu == 1)
				{
					man.add(new Employee(num));
				}
				if(submenu == 2)
				{
					man.add(new Salesman(num));
				}
				if(submenu == 3)
				{
					man.add(new Programmar(num));	
				}
			}
			if(menu == 3)
			{
				System.out.println("수정하려고 하는 근로자의 번호를 입력하세요.");
				num = scan.nextInt();
				man.modify(new Employee(num));
			}
			if(menu == 4)
			{
				System.out.println("삭제하려고 하는 근로자의 번호를 입력하세요.");
				num = scan.nextInt();
				man.delete(new Employee(num));
			}
			if(menu == 5)
			{
				System.out.println("조회하려고 하는 근로자의 번호를 입력하세요.");
				num = scan.nextInt();
				Employee search = man.search(num);
				System.out.println(search.whoami());
			}
			if(menu == 6)
			{
				flag = false;
			}
			
			if(menu == 99)
			{
				man.allWork();
			}

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Dispatcher().go();
		
	}
}
