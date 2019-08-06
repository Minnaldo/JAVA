package chap09;

//람다의 표현식은 메소드가 하나일때만 쓴다.
interface Printer
{
	void print(String str);
}


//class MyPrinter implements Printer
//{
//	@Override
//	public void print(String str) {
//		// TODO Auto-generated method stub
//		System.out.println(str);
//	}
//}

public class RamdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Legacy expression
		//interface를 상속 받지않고 그냥 바로 하는법
		Printer p = new Printer() {
			@Override
			public void print(String str) {
				// TODO Auto-generated method stub
				System.out.println(str);
			}
		};
		p.print("Hello, Legacy");


		//Legacy 방식과 Ramda 방식 하고 같다.
		//람다의 표현식은 메소드가 하나일때만 쓴다.
		//Ramda expression
		Printer p2 = (String s)->{System.out.println(s);};
		p2.print("Ramda2");
		
		Printer p3 = (String s)->System.out.println(s);
		p3.print("Ramda3");
		
		Printer p4 = (s)->System.out.println(s);
		p4.print("Ramda4");
		
		Printer p5 = s->System.out.println(s);
		p4.print("Ramda5");
		
		//run method에 인자가 없을때,  () 이렇게만 사용
		Runnable r = ()->System.out.println("Runnable");
		r.run();
		
		//Legacy expression.
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Ramda expression.  1.8버전인 8.0부터 추가가 됐다.
		Thread th1 = new Thread(()->System.out.println("Hello, Runnable"));
		th1.start();
		
		
		
	}
}