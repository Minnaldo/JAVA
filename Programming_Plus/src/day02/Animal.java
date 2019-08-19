package day02;

public class Animal {
	private String type = "동물";
	private String food = "개껌";
	
	public Animal() {
		
	}

	public Animal(String food) {
		this.food = food;
		
	}


	public void eat()
	{
		System.out.println(type + " 이 " + food + " 를 먹습니다.");
	}

//	@Override	//재정의
//	public String toString() {
//		return this.food;
//	}
//	
	
}
