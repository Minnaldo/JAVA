package Thread;

class MyRunnable implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++)
		{
			try {
				Thread.sleep(1*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}

public class ThreadTest5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start!!!");
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		System.out.println("main end  !!!");
	}

}
