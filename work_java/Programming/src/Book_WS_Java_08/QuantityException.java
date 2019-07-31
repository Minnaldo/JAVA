package Book_WS_Java_08;

public class QuantityException extends Exception {
	String errmsg = "에러메시지 출력.";
	
	public QuantityException()
	{
		
	}
	
	public String showError()
	{
		return errmsg;
	}
}
