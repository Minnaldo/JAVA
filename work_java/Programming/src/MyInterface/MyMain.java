package MyInterface;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		인터페이스니까 에러다.
//		MyInter m = new MyInter();	
		
		
		MySub m = new MySub();
		m.show();
		MyInter2 m1 = new MySub();
		Object m2 = new MySub();
	}

}
