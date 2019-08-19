package chap07_190730;

import SSAFY_TEST_BEFORE.Car;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> g = new Generic();
		g.setI("Hello");

		Object i = g.getI();
		
		Generic<Integer> h = new Generic();
		h.setI(30);
		
		Integer j = h.getI();
		
		
		Generic<Car> f = new Generic();
		f.setI(new Car());
//		f.getI(30);
		
		Car k = f.getI();
		
//		Generic g = new Generic();
//		g.setI(30);
//		g.setI("Hello");
//		g.setI("Hello");	//Generic은 int형이라 문자열 X.
//		int i = g.getI();
		
//		System.out.println(i);
	}

}
