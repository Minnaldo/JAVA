package com.ssafy.java.hw;

public class BookManager{
	private Book[] books = new Book[100];
	private int max = 10;
	private int index = 0;
		
	public void addBook(Book add_book) {
		books[index] = add_book;
		index++;
	}

	public void printBook() {
		for(int i = 0; i< index; i++) {
			
		}
	}
	public Book[] search() {
		Book[] copy_book = new Book[index];
		System.arraycopy(books, 0, copy_book, 0, index);
		return copy_book;
	}

	public Book[] search_book() {
		int cnt = 0;
		for(int i=0; i< index; i++) {
			if(books[i] instanceof Magazine == false) {
				cnt++;
			}
		}
		
		Book[] copy_book = new Book[cnt];
		int j=0;
		for(int i=0; i< index; i++) {
			if(books[i] instanceof Magazine == false) {
				copy_book[j] = books[i];
				j++;
			}
		}
		return copy_book;
	}
	
	public Book[] search_magazine() {
		int cnt = 0;
		for(int i=0; i< index; i++) {
			if(books[i] instanceof Magazine) {
				cnt++;
			}
		}
		
		Book[] copy_book = new Book[cnt];
		int j=0;
		for(int i=0; i< index; i++) {
			if(books[i] instanceof Magazine) {
				copy_book[j] = books[i];
				j++;
			}
		}
		return copy_book;
	}
	
	public Book search_isbn(String isbn) {
		int i;
		for(i=0; i<index; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				break;
			}
		}
		return books[i];
	}
	
	public Book search_publisher(String publisher) {
		int i;
		for(i=0; i<index; i++) {
			if(books[i].getPublisher().equals(publisher)) {
				break;
			}
		}
		return books[i];
	}
	public Book search_title(String title) {
		int i;
		for(i=0; i<index; i++) {
			if(books[i].getTitle().contains(title)) {
				break;
			}
		}
		return books[i];
	}
	public Book[] search_price(int price) {
		int count=0;
		int sum =0;
		for(int i=0; i<index; i++) {
			if(books[i].getPrice() <= price) {
				count++;
			}
		}
		Book[] underprice_book = new Book[count];
		int j=0;
		for(int i=0; i<index; i++) {
			if(books[i].getPrice() <= price) {
				underprice_book[j]=books[i];
				j++;
			}
		}
		return underprice_book;
	}
	public int sum_price() {
		int sum = 0;
		for(int i=0; i<index; i++) {
			sum += books[i].getPrice();
		}
		return sum;
	}
	public int average_price() {
		int sum = 0, cnt =0;
		for(int i=0; i<index; i++) {
			sum += books[i].getPrice();
			cnt++;
		}
		return sum/cnt;
	}
	
	
	
	
	
}