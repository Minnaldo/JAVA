package Product_Interface_HW_07;

public class TV extends Product{
	private int internet_access;

	public int getInternet_access() {
		return internet_access;
	}

	public void setInternet_access(int internet_access) {
		this.internet_access = internet_access;
	}

	public TV(String productNum, String name, int price, int quantity, int internet_access) {
		super(productNum, name, price, quantity);
		this.internet_access = internet_access;
	}

	public TV() {
	}

	@Override
	public String toString() {
		return "TV [internet_access=" + internet_access + ", ProductNum=" + getProductNum() + ", Name="
				+ getName() + ", Price=" + getPrice() + ", Quantity=" + getQuantity() + "]";
	}
	
	
}
