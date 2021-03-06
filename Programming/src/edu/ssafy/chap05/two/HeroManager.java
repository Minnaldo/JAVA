package edu.ssafy.chap05.two;

public class HeroManager {
	private Hero[] heros;
	private int max = 10;
	private int index = 0;
	
	public HeroManager()
	{
		heros = new Hero[max];
	}
	
	
	public void addHero(Hero h)
	{
		if(index < max)
		{
			heros[index] = h;
			index++;
		}
		else
		{
			Hero[] temp = new Hero[max * 2];
			max *= 2;
			System.arraycopy(heros, 0, temp, 0, heros.length);
			heros = temp;
		}
	}
	
	public void modiHero(Hero h)
	{
		for(int i = 0; i < index; i++)
		{
			if(heros[i].name == h.name) {
				heros[i] = h;
			}
		}
	}
	
	public void delHero(Hero h)
	{
		for(int i = 0; i < index; i++)
		{
			//마지막에 들어있는애를, 중간에 지운곳에 넣어주고
			//index값을 하나 줄여주면, 다음은 자연스레 마지막에 추가되고 이어진다.
			if(heros[i].getName() == h.getName()) {
				heros[i] = heros[index-1];
				index--;
			}
		}
	}
	
	public void printHero()
	{
		for(int i = 0; i < index; i++)
		{
			heros[i].superPower();
		}
	}
}
