package JAVA_Month_Test;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

public interface IBookMgr {
	
	public void load();
	
	public void save();
	
	public void add(Book b) throws DuplicateException;
	
	public List<Book> search();
	
	public Book search(String isbn) throws RecordNotFoundException;
	
	public void update(String isbn, int price) throws RecordNotFoundException;
	
	public void delete(String isbn) throws RecordNotFoundException;
	
	public List<Book> searchTitle(String title);
	
	public List<Book> sortIsbn();
	
	public String countWord();
	
	public void send() throws UnknownHostException, IOException;
}
