
public class Programmer extends Employee {
	public Programmer(int num) {
		super(num);
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
		return "개발자가 " + worktime + " 시간동안 일을 합니다";
	}
	public void goodIdea() {
		this.worktime--;
	}
}
