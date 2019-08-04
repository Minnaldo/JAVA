package week3.ws;
 
import java.util.ArrayList;
 
public interface IBookMgr {
     
    public void addBook(Book b);
    public ArrayList<Book> printBook();// ��� å �˻�
    public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;
    public void buy(String isbn, int quantity) throws ISBNNotFoundException;
    public int getTotalAmount();
    public void open();
    public void close();
 
     
}