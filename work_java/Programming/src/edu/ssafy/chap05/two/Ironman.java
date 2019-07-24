package edu.ssafy.chap05.two;

public class Ironman extends Hero {
	String name = "아이언맨";
	
	public String getName()
	{
		return name;
	}
	
	//상속은 : 확장, 재정의
	
	//오버라이드, 재정의
	@Override
	public void superPower() {
		// TODO Auto-generated method stub
		System.out.println("아이언맨 슈퍼파워");
	}
	
	//확장
	public void Smart()
	{
		System.out.println("아이언맨 슈퍼똑똑이!");
	}
	
	public void Fly()
	{
		System.out.println("아이언맨 날아 다닌다!");
	}
}
