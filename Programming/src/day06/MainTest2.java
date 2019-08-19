package day06;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		/** 추상클래스는 객체화도 못 함 */
		//얘는 그냥 객체화 안 됨.
//		AbstractTest a = new AbstractTest();
//		a.show();
		
		//추상 클래스는 객체화가 안되지만, 아빠클래스 용도로 사용할 수 있다.
		AbstractTest s= new Sub();
		s.show();				//Sub의 show 이다.
		
		AbstractTest s2 = new Sub2();
		
		AbstractTest[] arr = new AbstractTest[2];
		arr[0] = s;
		arr[1] = s2;
		
		toShow(s);
		toShow(s2);
		
	}
	
	static void toSho(AbstractTest at)
	{
		at.show();
	}

}
