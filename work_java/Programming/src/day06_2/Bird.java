package day06_2;

public class Bird extends Animal implements IFly {

	public void fly()
	{
		System.out.println("새가 날아다닙니다.");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("새가 뛰어요");
	}


}
