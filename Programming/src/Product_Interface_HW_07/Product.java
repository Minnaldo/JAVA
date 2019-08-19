package Product_Interface_HW_07;

public class Product {
	private String productNum;
	private String name;
	private int price;
	private int quantity;

	public Product() {
	}
	
	public Product(String productNum, String name, int price, int quantity) {
		this.productNum = productNum;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productNum=" + productNum + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
	
}

