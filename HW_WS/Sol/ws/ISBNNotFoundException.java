package week3.ws;
 
public class ISBNNotFoundException extends Exception{
    String errmsg = "�ش� ISBN�� ������ �����ϴ�.";
    public ISBNNotFoundException() {}
    public String showError() {
        return errmsg;
    }
}