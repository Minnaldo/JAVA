package day06;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		//						앞과   뒤에 str은 다른 주소를 가리킨다.
		str = str + str2;		//str = str + str2에서 
		
		
		
//		str.toString();	//관습적으로 Object class에 정의해놓음.
		
//		System.out.println('a' + str);
//		System.out.println(10 + 'a' + str);		//107Hello
		
		
//		//값을 가지고 비교한다.  equals
//		if (str.equals(str2))
//		{
//			System.out.println("같지롱1~");
//		}
//		
//		if (str2.equals(str3))
//		{
//			System.out.println("같지롱2~");
//		}
//		
//		if (str3.equals(str4))
//		{
//			System.out.println("같지롱3~");
//		}
//		
//		if (str.equals(str4))
//		{
//			System.out.println("같지롱4~");
//		}
		
		
//		/** 주소를 비교하고 있다.   ==   */
//		if(str == str2)
//		{
//			System.out.println("같다");
//		}
//		
//		if(str2 == str3)
//		{
//			System.out.println("같다2");
//		}
//		
//		if(str3 == str4)
//		{
//			System.out.println("같다3");
//		}
//		
//		if(str == str4)
//		{
//			System.out.println("같다4");
//		}
		
	}
}
