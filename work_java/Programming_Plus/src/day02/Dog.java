package day02;

public class Dog extends Animal {
	private String type = "강아지";
	private String food;
	private static Dog d = new Dog();
	
	
	//static 메소드에서는 this나 super를 쓸 수 없다.
	//객체가 없기 때문에, 불가하다!!!
	
	public static Dog getInstance()
	{
		return d;
	}
	
	
	
	private Dog()
	{
		
	}
	
	public Dog(String food) {
		this.food = food;
//		super();  //객체가 생성되고 난 후, 이면 에러가 뜸.
					//(무적권 맨 앞에!!!)  무조건 무조건이야~
	}
	
	
	public void eat()
	{
		System.out.println(type + " 이 " + food + " 를 먹습니다.");
	}
	
	public void bark()
	{
		System.out.println(this.type + "가 짖습니다.");
	}

	@Override
	public String toString() {
		return "깡쥐~";
	}
	
	
}
