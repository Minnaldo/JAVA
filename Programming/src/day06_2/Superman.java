package day06_2;


/** 이게바로 라이브러리다. 여러가지 상속받고 해서  라이브러리를 만듦.*/
public class Superman extends Human implements IFly{

	public void fly()
	{
		System.out.println("슈퍼맨이 날아요~");
	}
	
}
