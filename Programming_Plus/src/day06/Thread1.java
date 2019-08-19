package day06;

public class Thread1 extends Thread{

	public void run() {
		System.out.println("runrunrun!!!");
		go();
	}

	static void go2() {
		while(true)
		{
			try {
				Thread.sleep(1*1000);
				System.out.println("go2@@@" + Thread.currentThread());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	static void go() {
		System.out.println("go!!!");
		go2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start!!!");
		//		go();
		Thread1 th = new Thread1();
		th.start();

		//쓰레드를 이용하면
		//Main end가 먼저 출력됨..
		System.out.println("Main end!!!");
	}

}
