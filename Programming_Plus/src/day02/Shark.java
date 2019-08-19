package day02;

public class Shark extends Animal {
	private String type = "상어";
	private String food;
	
	public Shark()
	{
		
	}
	
	public Shark(String food) {
		
		this.food = food;
	}
	
	
	public void eat()
	{
		String meal = null;
		//멤버변수는 초기화가 된다.
		System.out.println(type + " 이 " + food + " 를 먹습니다.");
		System.out.println(type + " 이 " + meal + " 를 먹습니다.");
		//지역변수는 초기화 해주지 않으면, 자동으로 초기화가 되지 않기 때문에 에러가 남.
	}
	
	public void swimming()
	{
		System.out.println(this.type + " 이 수영을 합니다.");
	}
	
	
}
