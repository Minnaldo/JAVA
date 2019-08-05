package WS_10_Book;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public interface IBookMgr {
	public void add(Book add_book);
	public ArrayList<Book> printBook();
	public void sell(String isbn, int quantity) ;
	public void buy(String isbn, int quantity) ;
	public int getTotalAmount() ;
	public void open();
	public void close();
	public void send() throws UnknownHostException, IOException;
}
