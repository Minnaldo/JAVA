package Thread;

public class ThreadTest3 {

	public static void main(String[] args) {

		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		th1.start();
		th2.start();
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		th1.stop();
		th1.interrupt();
		System.out.println("Main ENd.....");

	}

}

class MyThread1 extends Thread {
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 50; i++)
			{
				Thread.sleep(1*100);
				System.out.println("MyThread1 : " + i);

			}
		} catch (InterruptedException e) {
		} finally {

		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 50; i++)
		{
			try {
				Thread.sleep(5*100);
			} catch (InterruptedException e) {
			}
			System.out.println("MyThread2 : " + i);
		}
	}
}