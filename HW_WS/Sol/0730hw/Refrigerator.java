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
        return "Refrigerator [��ǰ��ȣ=" + super.getProNum() + ", �̸�=" + super.getName() + ", ����=" + super.getPrice() + ", ���=" + super.getStock() + ", �뷮=" + capacity + "]";
    }
     
     
}