package chap02;

public class CustomerVD {
	private int num;
	private String name;
	private int age;
	private String addr;
	
	public CustomerVD()
	{
		
	}
	
	public CustomerVD(int num, String name, int age, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "CustomerVD [num=" + num + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	
	
}