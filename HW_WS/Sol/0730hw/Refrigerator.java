package week3.hw;

import java.io.Serializable;

public class Refrigerator extends Product implements Serializable{
    private int capacity;
 
    public Refrigerator() { }
 
    public Refrigerator(String proNum, String name, int price, int stock, int capacity) {
        super(proNum, name, price, stock);
        this.capacity = capacity;
    }
 
    public int getCapacity() {
        return capacity;
    }
 
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
 
    @Override
    public String toString() {
        return "Refrigerator [제품번호=" + super.getProNum() + ", 이름=" + super.getName() + ", 가격=" + super.getPrice() + ", 재고=" + super.getStock() + ", 용량=" + capacity + "]";
    }
     
     
}