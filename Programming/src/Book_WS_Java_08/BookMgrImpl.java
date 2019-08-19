package Book_WS_Java_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookMgrImpl implements IBookMgr{
	private int index = 0;
	ArrayList<Book> book_list = new ArrayList<Book>();

	public BookMgrImpl() {
		// TODO Auto-generated constructor stub
		open();
	}
	
	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		book_list.add(b);
	}

	@Override
	public ArrayList<Book> search() {
		// TODO Auto-generated method stub
		return book_list;
	}


	@Override
	public int getTotalAmount() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < book_list.size(); i++) {
			sum += book_list.get(i).getPrice() * book_list.get(i).getQuantity();
		}
		return sum;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("book.dat"));
			Book b;
			while ((b = (Book) ois.readObject()) != null) {
				book_list.add(b);
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {

			}
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("book.dat");
			oos = new ObjectOutputStream(fos);

			for (Book book : book_list) {
				oos.writeObject(book);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block

		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}
	}

	@Override
	public void sell(String isbn, int quantity) {
		// TODO Auto-generated method stub
		for (Book book : book_list) {
			if (book.getIsbn().equals(isbn)) {
				if (book.getQuantity() - quantity >= 0) {
					book.setQuantity(book.getQuantity() - quantity);
					return;
				}
			}
		}
	}

	@Override
	public void buy(String isbn, int quantity) {
		// TODO Auto-generated method stub
		for (Book book : book_list) {
			if (book.getIsbn().equals(isbn)) {
				book.setQuantity(book.getQuantity() + quantity);
			}
		}
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		
	}
	
	

}
