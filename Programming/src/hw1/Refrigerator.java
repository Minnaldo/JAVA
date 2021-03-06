package hw1;

public class Refrigerator extends Product{
	private int guarntee;
	private int liter;
	
	public int getGuarntee() {
		return guarntee;
	}

	public void setGuarntee(int guarntee) {
		this.guarntee = guarntee;
	}

	public int getLiter(){
		return liter;
	}

	public void setLiter(int liter){
		this.liter=liter;
	}

	public Refrigerator(String productNum, String name, int price, int quantity, int guarntee, int liter) {
		super(productNum, name, price, quantity);
		this.guarntee = guarntee;
		this.liter = liter;
	}

	public Refrigerator() {
	}

	@Override
	public String toString() {
		return "Refrigerator [guarntee=" + guarntee + ", ProductNum=" + getProductNum() + ", Name="
				+ getName() + ", Price=" + getPrice() + ", Quantity=" + getQuantity() + ", Liter=" + getLiter() + "]";
	}
	
	
}
