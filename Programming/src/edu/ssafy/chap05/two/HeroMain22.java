package edu.ssafy.chap05.two;

public class HeroMain22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroManager man = new HeroManager();
		man.addHero(new Ironman());
		man.addHero(new Hulk());
		man.addHero(new Spiderman());
		man.addHero(new Ironman());
		
		
		man.printHero();
		
		System.out.println("+======================================+");
		
		man.delHero(new Hulk());
		man.printHero();
	}

}
