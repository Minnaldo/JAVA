package week3.hw;

public class CodeNotFoundException extends Exception {
	
	String errmsg = "�ش� ��ǰ ��ȣ�� �������� �ʽ��ϴ�.";
	public CodeNotFoundException() {}
	public String showErr() {
		return errmsg;
	}
	
}

