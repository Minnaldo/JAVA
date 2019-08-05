package WS_10_Book;


public class Magazine extends Book {
	private int year;
	private int month;
	public Magazine(){
		
	}

	public Magazine(String isbn, String title, int price, int quantity, int year, int month) {
		super(isbn, title, price, quantity);
		this.year = year;
		this.month = month;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "magazine [isbn=" + getIsbn() + ", title=" + getTitle()
				+ ", price=" + getPrice()+ ", quantity=" + getQuantity()+ ", year=" + year + ", month=" + month + "]" ;
	}
}
