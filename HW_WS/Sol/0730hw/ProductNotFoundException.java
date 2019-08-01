package week3.hw;

public class ProductNotFoundException extends Exception {
	String errmsg = "상품이 존재하지 않습니다.";
	public ProductNotFoundException() {}
	
	public String showErr() {
		return errmsg;
	}
}
