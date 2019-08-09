package Friday_Project_Hong_Solution;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("해야될일...");
	}
	
}
public class ThreadTest {
	
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}
