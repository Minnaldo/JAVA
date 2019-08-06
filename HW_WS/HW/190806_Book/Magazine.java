package edu.ssafy.chap08.two;

public class Magazine extends Book {
	private int month;

	public Magazine(String isbn, String title, int price, int month) {
		super(isbn, title, price);
		this.month = month;
	}

	public Magazine() {
		super();
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Magazine [month=" + month + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
}
