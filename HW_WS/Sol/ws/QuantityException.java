package week3.ws;
 
public class QuantityException extends Exception{
    String errmsg = "수량이 부족합니다.";
    public QuantityException() {}
    public String showError() {
        return errmsg;
    }
}