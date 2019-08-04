package week3.ws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
 
 
public class BookMgrImpl implements IBookMgr{
     
    ArrayList<Book> books = new ArrayList<Book>();
//  private static BookMgrImpl instance;
//  public static BookMgrImpl getInstance() {
//      if(instance == null) instance = new BookMgrImpl();
//      return instance;
//  }
     
    public BookMgrImpl() {
    	
        open();
    }
     
    @Override
    public void addBook(Book b) {
        // TODO Auto-generated method stub
        books.add(b);
    }
 
    @Override
    public ArrayList<Book> printBook() {
        // TODO Auto-generated method stub
        return books;
    }
 
    @Override
    public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {
        // TODO Auto-generated method stub
        for (Book book : books) {
            if(book.getIsbn().equals(isbn)) {
                if(book.getQuantity() - quantity >= 0) {
                    book.setQuantity(book.getQuantity() - quantity);
                    return;
                }else {
                    throw new QuantityException();
                }
            }
        }
        throw new ISBNNotFoundException();
    }
 
    @Override
    public void buy(String isbn, int quantity) throws ISBNNotFoundException {
        // TODO Auto-generated method stub
        for (Book book : books) {
            if(book.getIsbn().equals(isbn)) {
                book.setQuantity(book.getQuantity() + quantity);
            }
        }
        throw new ISBNNotFoundException();
    }
 
    @Override
    public int getTotalAmount() {
        // TODO Auto-generated method stub
        int sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getPrice() * books.get(i).getQuantity();
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
            while((b = (Book)ois.readObject()) != null) {
                books.add(b);
            }
        } catch (FileNotFoundException e) {
        	
        } catch (IOException e) {
        	
        } catch (ClassNotFoundException e) {
        	
        } finally {
            try {
            	if(ois != null)
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
            for (Book book : books) {
                oos.writeObject(book);
            }
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
        } catch (IOException e) {
        	
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
        }
    }
 
 
 
 
 
}