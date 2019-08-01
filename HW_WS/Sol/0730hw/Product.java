package week3.hw;

import java.io.Serializable;

public class Product implements Serializable{
    private String proNum;
    private String name;
    private int price;
    private int stock;
     
    public Product() {  }
 
    public Product(String proNum, String name, int price, int stock) {
        this.proNum = proNum;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
 
    public String getProNum() {
        return proNum;
    }
 
    public void setProNum(String proNum) {
        this.proNum = proNum;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
 
    public int getStock() {
        return stock;
    }
 
    public void setStock(int stock) {
        this.stock = stock;
    }
 
    @Override
    public String toString() {
        return "Product [proNum=" + proNum + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }
     
     
}