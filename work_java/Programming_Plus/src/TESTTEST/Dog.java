package TESTTEST;

public class Dog extends Animal{
	private int tw;

	public Dog(String name, String num, int tw) {
		super(name, num);
		this.tw = tw;
	}

	public int getTw() {
		return tw;
	}

	public void setTw(int tw) {
		this.tw = tw;
	}

	@Override
	public String toString() {
		return "Dog [tw=" + tw + ", getName()=" + getName() + ", getNum()=" + getNum() + "]";
	}
	
	
	
}
