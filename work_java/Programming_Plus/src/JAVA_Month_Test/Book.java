package JAVA_Month_Test;

import java.io.Serializable;

public class Book implements Serializable, Comparable<Book>{
	private String isbn;
	private String title;
	private String author;
	private int price;
	
	
	public Book() {
		super();
	}
	
	public Book(String isbn, String title, String author, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.isbn.compareTo(o.getIsbn());
		
//		return Integer.parseInt(isbn) - Integer.parseInt(o.getIsbn());		//오름차순
//		return Integer.parseInt(isbn) - Integer.parseInt(o.getIsbn()) * -1;	//내림차순

	}
	
	
	
}
