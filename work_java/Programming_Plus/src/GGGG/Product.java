package GGGG;
import java.io.Serializable;

public class Product implements Serializable {
	private String productNum;
	private String name;
	private int price;
	private int amount;

	public Product() {
	}
	
	public Product(String productNum, String name, int price, int amount) {
		this.productNum = productNum;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [productNum=" + productNum + ", name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}

	
}
