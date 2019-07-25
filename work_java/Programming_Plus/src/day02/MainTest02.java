package day02;

public class MainTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 하위에서 상위인 업캐스팅은 생략가능하다.
		Animal a = (Animal) new Animal("사료");
		Animal d = /* (Animal) */Dog.getInstance();
		Animal s = /* (Animal) */new Shark();

		Dog d1 = Dog.getInstance();
		Shark s1 = new Shark();

		/*
		 * 배열을 만드는것은 객체이 들어가는 주머니를 만드는거지 객체를 생성하는것은 아니다.
		 */
		Animal[] ans = new Animal[10];
		ans[0] = a;
		ans[1] = d;
		ans[2] = s;
		
		for (int i = 0; i < ans.length; i++) {
//			System.out.println(ans[i].toString());
//			ans[i].eat();
			
			//ans[i]가 Animal 이니?
			
			/*하위 타입이 위에 있어야 함.
			 *상위 타입이 먼저하면 상위타입으로만 비교함.
			 */
			if(ans[i] instanceof Shark)
			{
				Shark sh = (Shark)ans[i];
				sh.swimming();
				
			}
			else if(ans[i] instanceof Dog)
			{
				Dog dog = (Dog)ans[i];
				dog.bark();
			}
			else if(ans[i] instanceof Animal)
			{
				Animal ani = ans[i];
				ani.eat();
			}
		}

	}

}
