package framework;

import day06_2.Animal;
import day06_2.Lion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal l = new Lion();
		Base b = new Base();
		b.toAnimal(l);
//		b.toRoar(l);
		b.toWalk(l);
		LionKing lk = new LionKing();
		b.toAnimal(lk);
		b.toRoar(lk);
	}

}

