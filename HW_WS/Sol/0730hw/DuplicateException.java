package week3.hw;

public class DuplicateException extends Exception {
	String errmsg = "제품이 이미 등록되어 있습니다.";
	public DuplicateException() {}
	public String showErr() {
		return errmsg;
	}

}
