// 1 Thread 상속받아 run orverring
public class Thread1 extends Thread{
	
	public void run() {
		go();
	}
	
	static void go2() {
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("go : "+Thread.currentThread());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	static void go() {
		System.out.println("go");
		go2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		//go();
		Thread1 th = new Thread1();
		th.start();
		Thread1 th2 = new Thread1();
		th2.start();
		System.out.println("Main End");
	}

}
