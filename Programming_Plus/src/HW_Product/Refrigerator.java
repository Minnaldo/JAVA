package HW_Product;

public class Refrigerator extends Product {
	private int guarantee;

	public Refrigerator() {
		
	}
	
	public int getGuarantee() {
		return guarantee;
	}



	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	public Refrigerator(String productNum, String name, int price, int quantity, int guarantee) {
		super(productNum, name, price, quantity);
		this.guarantee = guarantee;
	}



	@Override
	public String toString() {
		return "Refrigerator [guarantee=" + guarantee + ", getProductNum()=" + getProductNum() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + "]";
	}


	
	
	
}
