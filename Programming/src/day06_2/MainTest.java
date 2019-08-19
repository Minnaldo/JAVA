package day06_2;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스니까 객체 생성 안된다.
//		Animal a = new Animal();
		
		/** 다 Object, Animal로 업캐스팅 할 수 있다. */
		Bird b = new Bird();
		Frog f = new Frog();
		Human h = new Human();
		Lion l = new Lion();
		Superman s = new Superman();
		
//		/** 이게 다 Animal로 업캐스팅 된다. */
//		toWalk(b);
//		toWalk(f);
//		toWalk(h);
//		toWalk(l);
//		toWalk(s);
		
		toFly(b);
		toFly(s);
		toWalk(b);
		toWalk(s);
//		toFly(f); //Frog는 인터페이스 IFly를 받지 않아서 에러가 난다. 
		
	}

	//타입을 뭘로하면 Bird와 Superman이 날 수 있을까??!!
	//Interface를 이용.
	public static void toFly(IFly f)
	{
		f.fly();
	}
	
	public static void toWalk(Animal a)
	{
		a.walk();
	}
}
