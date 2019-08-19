package SSAFY_TEST_BEFORE;

public class Car {
	private String num;
	private String model;
	private int price;
	
	//기본 생성자
	public Car()
	{
		
	}
	
	//매개변수가 있는 생성자
	public Car(String num, String model, int price) {
		super();
		this.num = num;
		this.model = model;
		this.price = price;
	}

	//Getter & Setter
	/*멤버변수가 public으로 선언되어 있을때는, 모든 객체에서 접근이 가능하다.
	 * 하나의 모듈이 변경되면, 다른 클래스에서도 수정해야함.
	 * 따라서, 외부에서 필요한 기능만을 제외하고 은닉화.
	 * [중요한 데이터를 보호하기 위해]
	 * private 으로 선언했기 때문에 멤버변수를 조작이 불가능.
	 * this로 접근이 불가능하다.  (은닉화[캡슐화] 되어 있기 때문에)
	 * 따라서, 메소드를 이용해 간접적으로 접근한다!!!
	 */
	
	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "[num=" + num + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
}
