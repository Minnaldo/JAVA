package Product_HW_Java_08;


public class TV extends Product{
	private int internet_access;

	public TV() {
	}
	
	public TV(int internet_access) {
		super();
		this.internet_access = internet_access;
	}

	public TV(String productNum, String name, int price, int quantity, int internet_access) {
		super(productNum, name, price, quantity);
		this.internet_access = internet_access;
	}
	
	
	
	
}
