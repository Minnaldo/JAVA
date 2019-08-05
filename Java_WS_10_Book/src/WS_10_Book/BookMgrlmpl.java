package WS_10_Book;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMgrlmpl implements IBookMgr {



	public BookMgrlmpl() {
		open();
	}

	ArrayList<Book> book_list = new ArrayList<Book>();
	private static BookMgrlmpl instance = new BookMgrlmpl();
	public static BookMgrlmpl getinstance(){
		return instance;
	}
	public void add(Book add_book) {
		book_list.add(add_book);

		for (int i = 0; i < book_list.size(); i++) {
			System.out.println(book_list.get(i));
		}
	}

	@Override
	public ArrayList<Book> printBook() {
		// TODO Auto-generated method stub
		return book_list;
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
	public void send() throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket ser = new Socket("192.168.24.127", 7000);	//민

		Scanner s = new Scanner(System.in);


		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(ser.getOutputStream()));

		oos.writeObject(book_list);
		oos.flush();
		oos.close();


		ser.close();

	}
}
