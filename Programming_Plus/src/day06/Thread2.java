//2. Runnable을 override 하여 Thread 에게 전달하는 방법.

package day06;

class My implements Runnable
{
	public void run()
	{
		try {
			while(true)
			{

				Thread.sleep(1*1000);
				System.out.println("run!!! " + Thread.currentThread());
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println(Thread.currentThread() + "Thread 끝났어!");
		}
	}
}


//Thread 실행 방법 = start()
//Thread 종료 방법 = stop()   or   interrupt
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread th = new Thread(new My());
		th.start();

		Thread th2 = new Thread(new My());
		th2.start();

		

	}

}
