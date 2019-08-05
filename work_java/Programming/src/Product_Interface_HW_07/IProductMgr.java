package Product_Interface_HW_07;

public interface IProductMgr {
	
	public void addProduct(Product add_product);
	public void deleteProduct(String delete_product);
	public Product[] search();
	public Product[] search_TV();
	public Product[] search_Refrigerator();
	public Product search_productNum(String productNum);
	public Product search_name(String name);
	public int sum_price();
	public int product_price(int choice);
	public int product_Qty(int choice);
	public Product[] search_name_price(String name, int price);
	
}