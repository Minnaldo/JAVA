package com.ssafy.java.hw;

public class Magazine extends Book{
	private int year;
	private int month;
	public Magazine() {}
	
	public Magazine(String isbn, String title, String author, String publisher, int price, int desc,int year, int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Magazine [year=" + year + ", month=" + month + ", Isbn=" + super.getIsbn() + ", Title=" + super.getTitle()
				+ ", Author=" + super.getAuthor() + ", Publisher=" + super.getPublisher() + ", Price=" + super.getPrice()
				+ ", Desc=" + super.getDesc() + "]";
	}
	
	
}
