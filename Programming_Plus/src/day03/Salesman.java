package day03;

public class Salesman extends Employee{
	
	public Salesman(int num)
	{
		super(num);
		this.num = num;
		this.addtime = 5;
		this.worktime = super.worktime + this.addtime;
	}
	
	@Override
	public String whoami() {
		
		return "신입사원";
	}
	
	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "영업사원이 " + this.worktime + " 일을 합니다.";
	}
	
}
