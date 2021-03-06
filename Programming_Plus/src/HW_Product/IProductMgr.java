package HW_Product;

import java.util.ArrayList;

public interface IProductMgr {
	public void addProduct(Product add_product);
	public ArrayList<Product> printProduct();
	
	public ArrayList<Product> searchNum(String product_num);
	public ArrayList<Product> searchName(String product_name);
	
	public ArrayList<Product> searchTV();
	public ArrayList<Product> searchRefrigerator();
	
	public void delete_num(String Product_num);
	
	public ArrayList<Product> searchRefrigerator(int Guarantee) throws ProductNotFoundException;
    public ArrayList<Product> searchTv(int inch) throws ProductNotFoundException;
    public void updatePrice(String proNum, int price);
    public int sumPrice();
	
	
	public void open();
	public void close();
	
}