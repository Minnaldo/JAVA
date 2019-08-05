package TTTTTTT;

public class Animal {
	private String name;
	private String num;
	
	public Animal(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", num=" + num + "]";
	}
	
	
}
