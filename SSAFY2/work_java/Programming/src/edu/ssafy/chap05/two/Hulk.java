package edu.ssafy.chap05.two;

public class Hulk extends Hero {
	String name = "헐크";
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public void superPower() {
		// TODO Auto-generated method stub
		System.out.println("헐크 슈퍼파월~");
	}
	
	public void angry()
	{
		System.out.println("헐크 성질부리기!");
	}
}
