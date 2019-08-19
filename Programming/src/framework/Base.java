package framework;

import day06_2.Animal;

public class Base {
	public void toWalk(Animal a)
	{
		a.walk();
	}
	public void toRoar(Animal a)
	{
		a.roar();
	}
	public void toAnimal(Animal a)
	{
		System.out.println(a.whoamI());
	}
}
