package week3.hw;

public class DuplicateException extends Exception {
	String errmsg = "��ǰ�� �̹� ��ϵǾ� �ֽ��ϴ�.";
	public DuplicateException() {}
	public String showErr() {
		return errmsg;
	}

}
