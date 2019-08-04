package HW_Product;

public class ProductNotFoundException extends Exception {
	String errmsg = "ProductNotFoundException errmsg!!!.";
	public ProductNotFoundException() {}
	
	public String showErr() {
		return errmsg;
	}
}
