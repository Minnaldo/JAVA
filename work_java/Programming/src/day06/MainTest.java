package day06;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.name = "kim";
		c.age = 10;
		
		Customer c2 = new Customer();
		c2.name = "kim";
		c.age = 10;
		

//		if(c == c2)
//		주소를 비교하니까 거짓을 나타낼거임.
		
		/**equals 로는      */
		if(c.equals(c2))
		{
			System.out.println("같아요");
		}
		else
			System.out.println("달라요");
	}

}
