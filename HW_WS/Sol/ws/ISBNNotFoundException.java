package week3.ws;
 
public class ISBNNotFoundException extends Exception{
    String errmsg = "해당 ISBN의 도서가 없습니다.";
    public ISBNNotFoundException() {}
    public String showError() {
        return errmsg;
    }
}