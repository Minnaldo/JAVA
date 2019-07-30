package day03;

public class Employee {
	protected int num;
	protected int worktime;
	protected int addtime;
	
	public Employee(int num)
	{
		this.num = num;
		worktime = 8;
	}
	
	public String whoami()
	{
		return "근로자";
	}
	
	public String work()
	{
		return "근로자가 " + worktime + "시간동안 일을 합니다.";
	}
	
	
}
