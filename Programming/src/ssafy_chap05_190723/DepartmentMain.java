package ssafy_chap05_190723;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Customer cc = new VipCustomer();
		
//		Customer[] cArr = new Customer[3];
		Customer[] cArr = new Customer[9];
		
		cArr[0] = new Customer("111", "둘리", 8);
		
		cArr[1] = new Customer("222", "또치", 9);
		cArr[2] = new Customer("333", "도우너", 10);
		
//		for(int i = 0; i < cArr.length; i++)
//		{
//			System.out.println(cArr[i].toString());
//		}
		
		
		System.out.println("========================================================");
		
		//upcasting, override,,
		
		cArr[3] = new VipCustomer("211", "고길동", 40, "둘리혼내기");
		cArr[4] = new VipCustomer("212", "박길동", 30, "발렛파킹");
		cArr[5] = new VipCustomer("213", "홍길동", 20, "호형호제");
		
		cArr[6] = new 진상();
		cArr[7] = new 진상();
		cArr[8] = new 진상();
		
		toArray(cArr);
		
//		VipCustomer[] vArr = new VipCustomer[3];
		
//		vArr[0] = new VipCustomer("211", "고길동", 40, "둘리혼내기");
//		vArr[1] = new VipCustomer("212", "박길동", 30, "발렛파킹");
//		vArr[2] = new VipCustomer("213", "홍길동", 20, "호형호제");

		
		
//		for(int i = 0; i < vArr.length; i++)
//		{
//			System.out.println(vArr[i].toString());
//		}
	}	
	
	public static void toArray(Customer[] arr)
	{
		/* 다운캐스팅은 위험하기 때문에 
		 * 다운캐스팅을 할 때에는
		 * 그게 맞는지 아닌지 확인부터 해야한다.	
		 */
				
		for(int i = 0; i < arr.length; i++)
		{
//			System.out.println(arr[i].toString());
			if(arr[i] instanceof 진상)
			{
				진상 c = (진상)arr[6];
				System.out.println(c.진상부리기());
			}
		}
	}
	
}
