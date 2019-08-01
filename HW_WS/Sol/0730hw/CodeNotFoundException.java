package week3.hw;

public class CodeNotFoundException extends Exception {
	
	String errmsg = "해당 상품 번호가 존재하지 않습니다.";
	public CodeNotFoundException() {}
	public String showErr() {
		return errmsg;
	}
	
}

