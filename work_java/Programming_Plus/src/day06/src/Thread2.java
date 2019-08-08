// 2 runnable 을 overrid 하여 Thread에게 전달하는 방법

class My implements Runnable {
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println("run : " + Thread.currentThread());
			}
		} catch (InterruptedException e) {
		}finally {
			System.out.println(Thread.currentThread()+" 끝났어용");
		}
	}
}
// Thread 실행방법 = start
// thread 종료방법 = stop or interrupt(추천)
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread th = new Thread(new My());
		th.start();
		Thread th2 = new Thread(new My());
		th2.start();
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt();
	}

}
