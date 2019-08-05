package Thread;

public class ThreadTest2 extends Thread{

	public ThreadTest2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("" + i + Thread.currentThread());
//			try {
//				Thread.sleep(1*1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start!!!!!!!");
		
		ThreadTest2 th = new ThreadTest2("Threadtest111");
		ThreadTest2 th2 = new ThreadTest2("Threadtest222");
		
		//실행 할때마다 순서가 달라진다.  (*37)
		//쓰레드는 동기화가 어렵다. 실행 할 때마다 다르다.
		th.start();
		th2.start();
		
		System.out.println("main End@@@@@@@@@");
	}
	
	/*	main start!!!!!!!
		main End@@@@@@@@@
		1Thread[Threadtest111,5,main]
		1Thread[Threadtest222,5,main]
		2Thread[Threadtest111,5,main]
		2Thread[Threadtest222,5,main]
		3Thread[Threadtest111,5,main]
		3Thread[Threadtest222,5,main]
		4Thread[Threadtest111,5,main]
		4Thread[Threadtest222,5,main]
		5Thread[Threadtest111,5,main]
		5Thread[Threadtest222,5,main]
		6Thread[Threadtest111,5,main]
		6Thread[Threadtest222,5,main]
		7Thread[Threadtest111,5,main]
		7Thread[Threadtest222,5,main]
		8Thread[Threadtest111,5,main]
		8Thread[Threadtest222,5,main]
		9Thread[Threadtest111,5,main]
		9Thread[Threadtest222,5,main]
		10Thread[Threadtest111,5,main]
		10Thread[Threadtest222,5,main]
	*/

}
