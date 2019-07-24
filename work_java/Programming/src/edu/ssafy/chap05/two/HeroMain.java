package edu.ssafy.chap05.two;

//위 예제를 이용하여
//상속과 다형성
//Inheritance 와  Polymorphism 을 경험.

public class HeroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero[] h = new Hero[3];
		h[0]=  new Hulk();					//업캐스팅
		h[1] = new Spiderman();
		h[2] = new Ironman();
		
		for(int i = 0; i < h.length; i++)
		{
			h[i].superPower();		
			if(h[i] instanceof Hulk)
			{
				Hulk kl = (Hulk)h[i];		//다운캐스팅
				kl.angry();
			}
			else if(h[i] instanceof Spiderman)
			{
				Spiderman an = (Spiderman)h[i];
				an.착하다();
			}
			else if (h[i] instanceof Ironman)
			{
				Ironman Irn = (Ironman)h[i];
				Irn.Smart();
			}
		}
	}

}
