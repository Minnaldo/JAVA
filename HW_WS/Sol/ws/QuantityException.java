package week3.ws;
 
public class QuantityException extends Exception{
    String errmsg = "������ �����մϴ�.";
    public QuantityException() {}
    public String showError() {
        return errmsg;
    }
}