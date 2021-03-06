package ssafy_chap05_190723;

/* static이 붙을 수 있는 위치
 * : 멤버변수, 멤버함수, 내부클래스, 
 * 
 * static variable은 클래스 변수라 부르기도 한다.
 * 
 * static 변수는 객체를 만들어서도 만들지 않더라도 사용가능하다.
 * st.si  or  st2.si  or  StaticTest.si
 *  st.si에서 값을 바꾼후 st2.si로 값을 바꿔도
 *  한 곳을 가리키기 때문에, static 값은 같은 값으로 바뀐다.
 */
public class StaticTest {
	int i;
	static int si;
	
	// 스태틱 함수로 만들면, 편하게 클래스명.print();
	// 이런식으로 사용 가능하나
	// 일반 객체 변수들은 바로 사용 못한다.
//	public static void print()
//	{
//		
//	}
	
	
	/*main 함수가 static인 이유
	 * : static 멤버 함수/변수는 클래스 로딩시 메모리에 올라가는데,
	 * 일반 함수/변수는 메모리에 올라가 있지 않은 상태이므로..
	 */
						//String은 형변환 하기가 쉽다.
	public static void main(String[] args) {

		//String은 형변환 하기가 쉽다.
		//String으로 받아!! 그럼 정수든 실수든 뭐든 다 바꿔줄게!
		int parseInt = Integer.parseInt("1");
		double parseDouble = Double.parseDouble("1.1");
		float parseFloat = Float.parseFloat("1.f");
		String s = new String();
		char charAt = s.charAt(0);

		// 일반 객체 변수는 그냥 사용 불가.
//		i = 100;
		// 스태틱 변수는 가능.
//		si = 10;
		
		// 함수 또한 객체 생성 후 써야 한다.
//		StaticTest st7 = new StaticTest();
//		st7.print();
		
		//static 멤버라 객체생성을 하지 않고도, 접근 가능!!!
		StaticTest.si = 100;
		
		StaticTest st = new StaticTest();
		st.i = 7;
		
		
		//객체 생성해서 static 변수 si에 접근해도
		//StaticTest.si 로 값을 바꾼 것과 같다.
		//이유는 static 변수는 static 영역에만 존재하기 때문에.
		st.si = 200;
		
		StaticTest st2 = new StaticTest();
		st2.i = 20;
		
		System.out.println(st2.si);
//		System.out.println(StaticTest.si);
		
		
		
		
		
	}

}
