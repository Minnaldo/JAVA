package Book_WS_Java_08;

public class Magazine extends Book{
	private int year;
	private int month;
	
	public Magazine() {}
	
	public Magazine(String isbn, String title, int price, int quantity, int month) {
		super(isbn, title, price, quantity);
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
		return "Magazine [year=" + year + ", month=" + month + ", getIsbn()=" + getIsbn() + ", getTitle()=" + getTitle()
				+ ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + "]";
	}
}
