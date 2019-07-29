package framework;

import day06_2.Lion;

public class LionKing extends Lion {

	@Override
	public String whoamI()
	{
		return "심바";
	}
	
	@Override
	public void roar() {
		// TODO Auto-generated method stub
		System.out.println("심바가 어흥합니다!");
	}
}
