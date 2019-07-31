package Book_WS_Java_08;

import java.util.ArrayList;

public class BookMgrImpl implements IBookMgr{

	ArrayList<Book> books = new ArrayList<Book>();
	
	public public BookMgrImpl() {
		// TODO Auto-generated constructor stub
		open();
	}
	
	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		books.add(b);
	}

	@Override
	public ArrayList<Book> search() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public void sell(String isbn, int quantity) throws QuantityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy(String isbn, int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTotalAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
