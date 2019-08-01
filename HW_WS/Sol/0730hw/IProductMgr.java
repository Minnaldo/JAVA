package week3.hw;

import java.util.ArrayList;

public interface IProductMgr {
 
    public void addProduct(Product p) throws DuplicateException;
    public ArrayList<Product> printProduct();
    public ArrayList<Product> searchNum(String proNum) throws CodeNotFoundException;
    public ArrayList<Product> searchName(String name);
    public ArrayList<Product> searchTv();
    public ArrayList<Product> searchRefrigerator();
    public ArrayList<Product> searchRefrigerator(int capacity) throws ProductNotFoundException;
    public ArrayList<Product> searchTv(int inch) throws ProductNotFoundException;
    public void updatePrice(String proNum, int price);
    public int sumPrice();
    public void delProduct(String proNum);
    public void open();
    public void close();
     
}