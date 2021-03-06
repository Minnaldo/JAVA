package HW_10_Product;

import java.io.IOException;
import java.util.ArrayList;

public interface IProductMgr {
	public void add(Product p) throws DuplicateException;
	public ArrayList<Product> print_all();
	public ArrayList<Product> print_all_pronum(String num) throws ProductNotFoundException;
	public ArrayList<Product> print_all_proname(String name);
	public ArrayList<Product> check_TV();
	public ArrayList<Product> check_Ref();
	
	public ArrayList<Product> searchRe400() throws ProductNotFoundException;
	public ArrayList<Product> searchTV50() throws ProductNotFoundException;
	public ArrayList<Product> searchNP(String name,int price);
	
	public void delete(String num);
	
	public void update(String num, int price);
	public int total();
	public void open();
	public void close();
	public void send();
}
