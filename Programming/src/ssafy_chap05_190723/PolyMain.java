package ssafy_chap05_190723;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
//		System.out.println(c.age);
//		System.out.println(c.toString());
		//VipCustomer는 상속받은 Customer부터 생성자 호출하고 VipCustomer 생성자 호출
		VipCustomer vc = new VipCustomer();
//		System.out.println(vc.age);
//		System.out.println(vc.toString());
		//VipCustomer는 Customer가 될 수 있다. 따라서 에러가 안 남.
		//생략 가능한거는 자동형변환 (auto- )
//		Customer cc = (Customer) new VipCustomer();
		//(Customer)를 생략가능.
		Customer cc = new VipCustomer();
		//Customer는 스택,,  VipCustomer에 있는 Service를 접근은 할 수 없다.
//		System.out.println(cc.age);
//		System.out.println(cc.toString());
		
		/*  만들자마자 컴파일에러.
		 *  Customer는 VipCustomer가 될 수 없다.
		 *  상위타입을 하위타입으로 바꾸려고 하니, 에러가 남.
		 *  VipCustomer vv = (VipCustomer)new Customer();
		 *  이렇게 쓰면, 에러는 사라짐.
		 *  그러나, 컴파일을 하면 형변환 불가능하다고 에러가 뜸.
		 */		
//		VipCustomer vv = new Customer();
		
		
		/*  다형성을 언제 사용하나?
		 *  
		 */
			objectprint(c);
			objectprint(vc);
			objectprint(cc);
		}
	
		public static void objectprint(Customer v)
		{
			System.out.println(v.toString());
		}
	
//		public static void objectprint(VipCustomer v)
//		{
//			System.out.println(v.toString());
//		}
	

}
