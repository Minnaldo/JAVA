package week3.ws;

import java.io.Serializable;

public class Magazine extends Book implements Serializable{
    private int year;
    private int month;
     
    public Magazine() {}
    public Magazine(String isbn, String title, int price, int quantity, int year, int month) {
        super(isbn, title, price, quantity);
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
        return "Magazine [isbn=" + super.getIsbn() + ", title=" + super.getTitle() + ", price=" + super.getPrice() + ", quantity=" + super.getQuantity() + ", date=" + year + "." + month +"]";
    }
}