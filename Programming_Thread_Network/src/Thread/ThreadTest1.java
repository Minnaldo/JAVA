package Thread;
/* Thread 구현방식
 * 1. Thread 상속 받아서 run을 override 한다.
 * 
 */
public class ThreadTest1 extends Thread{

	@Override
		public void run() {
			test();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start!.....!");
		
//		test();
		ThreadTest1 th = new ThreadTest1();
		th.start();		//run메소드가 실행 됨...!!!
		
		System.out.println("Main End!.....!");
	}

	static void test()
	{
		System.out.println("Test start!.....!");
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test. end");
	}
}
