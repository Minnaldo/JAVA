package Product_HW_08;

import java.util.ArrayList;

public class ProductMgrImpl implements IProductMgr {

	ArrayList<Product> products = new ArrayList<>();

	@Override
	public void addProduct(Product add_product) {
		// TODO Auto-generated method stub
		boolean add = products.add(add_product);
	}

	@Override
	public ArrayList<Product> printProduct() {
		// TODO Auto-generated method stub
		return products;
	}
	
	

}
