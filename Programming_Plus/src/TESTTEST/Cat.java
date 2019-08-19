package TESTTEST;

public class Cat extends Animal{
	private int gg_num;

	
	
	public Cat(String name, String num, int gg_num) {
		super(name, num);
		this.gg_num = gg_num;
	}

	public int getGg_num() {
		return gg_num;
	}

	public void setGg_num(int gg_num) {
		this.gg_num = gg_num;
	}

	@Override
	public String toString() {
		return "Cat [gg_num=" + gg_num + ", getName()=" + getName() + ", getNum()=" + getNum() + "]";
	}
	
	
}
