package day03;

public class Programmar extends Employee{
	
	public Programmar(int num)
	{
		super(num);
		this.num = num;
		this.addtime = 3;
		this.worktime = super.worktime + this.addtime;
	}
	
	@Override
	public String whoami() {
		// TODO Auto-generated method stub
		return "개발자";
	}
	
	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "개발자가 " + this.worktime + " 시간동안 일을 합니다";
	}
	
	public void goodIdea()
	{
		this.addtime--;
	}
}
