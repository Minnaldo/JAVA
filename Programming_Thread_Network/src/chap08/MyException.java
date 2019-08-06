package chap08;

public class MyException extends Exception{
	public MyException() {
		super("MyException");
	}
	public MyException(String errmsg) {
		super(errmsg);
	}
}
