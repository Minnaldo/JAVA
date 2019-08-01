
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1);
		System.out.println(emp.whoami());
		System.out.println(emp.work());
		
		Salesman sal = new Salesman(2);
		System.out.println(sal.whoami());
		System.out.println(sal.work());
		
		Programmer pro = new Programmer(3);
		System.out.println(pro.whoami());
		System.out.println(pro.work());
		pro.goodIdea();
		pro.goodIdea();
		pro.goodIdea();
		pro.goodIdea();
		pro.goodIdea();
		System.out.println(pro.work());
	}

}
