package Thread;

public class ThreadTest6 {

	public static void main(String[] args) {

		
		/** Thread 만들기 */
		//1. Thread를 상속받아 run Override
		//2. Runnable을 상속받는 클래스를 만들어 Thread 에게 전달.

		Thread th = new Thread()
		{
			public void run()
			{
//				this	//1번이 가리키는 this는 th
			};
		};
		th.start();

//		//인터페이스도 객체화 된다. 안에 오버라이드 함수를 넣어주면.
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		}

		//Runnable은 Thread가 아니다.
		//다만 Thread에게 실행할 Method를 주는 애일뿐!
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//여기서 this 사용 가능
				//여기서 this 
//				this // Runnable
			}
		});
		th2.start();
		
	}

}
