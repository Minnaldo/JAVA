package HW_Product;


public class TV extends Product{
	private int internet_access;
	private int inch;

	public TV() {
	}
	
	
	

	public int getInternet_access() {
		return internet_access;
	}

	public void setInternet_access(int internet_access) {
		this.internet_access = internet_access;
	}

	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

	
	public TV(String productNum, String name, int price, int quantity, int internet_access, int inch) {
		super(productNum, name, price, quantity);
		this.internet_access = internet_access;
		this.inch = inch;
	}




	@Override
	public String toString() {
		return "TV [internet_access=" + internet_access + ", inch=" + inch + ", getProductNum()=" + getProductNum()
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + "]";
	}

}
