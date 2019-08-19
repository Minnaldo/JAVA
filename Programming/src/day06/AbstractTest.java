package day06;

/** 추상클래스 */

public abstract class AbstractTest {

	void play()
	{
		
	}
	
	//abstract를 키워드를 붙여,,
	//body가 없는 메소드를 만든다.
	//body가 없는 메소드
	public abstract void show();

}

class Sub extends AbstractTest
{
	
	@Override
	public void show()
	{
		
	}
	
	
}

class Sub2 extends AbstractTest
{
	@Override
	public void show()
	{
		
	}
}