package edu.ssafy.chap05.two;

public class Spiderman extends Hero {
	String name = "스파이더맨";
	
	public String getName()
	{
		return name;
	}
	
	//오버라이드 되고있다고 명시적 표현.
	//그러니 바꾸지 말아라.
	@Override
	public void superPower() {
		// TODO Auto-generated method stub
		System.out.println("스파이더맨 슈퍼파워~");
	}
	
	public void 착하다()
	{
		System.out.println("스파이더맨 착하다");
	}
}
