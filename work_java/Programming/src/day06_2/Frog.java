package day06_2;

public class Frog extends Animal{

	public void swimming()
	{
		System.out.println("개구리가 수영해요");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("개구리가 뛰어요");
	}
	
}
