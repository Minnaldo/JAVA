
public class Salesman extends Employee {
	
	public Salesman(int num) {
		super(num);
		this.addtime = 5;
		this.worktime = super.worktime + this.addtime;
	}
	
	@Override
	public String whoami() {
		return "영업사원";
	}
	@Override
	public String work() {
		
		return "영업사원이 : "+ this.worktime + " 시간 동안 일을 합니다";
	}
}
