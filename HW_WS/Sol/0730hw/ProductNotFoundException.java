package week3.hw;

public class ProductNotFoundException extends Exception {
	String errmsg = "��ǰ�� �������� �ʽ��ϴ�.";
	public ProductNotFoundException() {}
	
	public String showErr() {
		return errmsg;
	}
}
