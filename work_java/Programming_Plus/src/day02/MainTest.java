package day02;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		
		System.out.println(a);
		System.out.println("=============:");
		System.out.println(a.toString());
		
		//*인스턴스와 new로 생성하는 객체의 차이.
		
//		Dog d = new Dog();
		Dog dd = new Dog("뼈다구");
		Dog dd2 = new Dog("개껌");
		
		if(dd == dd2)
		{
			System.out.println("같은 강아지");
			
		}
		else
			System.out.println("다른 강아지");
		
		
		
		
		Dog d = Dog.getInstance();
		Dog d1 = Dog.getInstance();
		
		if(d == d1)
		{
			System.out.println("같냐? 응 같아");
		}
		else
			System.out.println("아니, 너희 달라");
		
		System.out.println(d.toString());
		
		Shark s = new Shark();
		System.out.println(s.toString());
	}

}
