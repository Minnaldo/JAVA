package Product_HW_Java_08;

public class ProductMgrImpl implements IProductMgr {
	private Product[] products = new Product[100];
	private int index = 0;
	
	@Override
	public void addProduct(Product add_product) {
		// TODO Auto-generated method stub
		products[index] = add_product;
		index++;
	}

	@Override
	public void deleteProduct(String delete_product) {
		// TODO Auto-generated method stub
		int i = 0;
		for(i = 0; i < index; i++)
		{
			if(products[i].getProductNum().equals(delete_product));
			{
				break;
			}
		}
		products[i] = products[index - 1];
		index--;
	}

	@Override
	public Product[] search() {
		// TODO Auto-generated method stub
		Product[] copy_book = new Product[index];
		System.arraycopy(products, 0, copy_book, 0, index);
		return copy_book;
	}

	@Override
	public Product[] search_TV() {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i = 0; i < index; i++)
		{
			if(products[i] instanceof TV)
			{
				cnt++;
			}
		}
		
		Product[] copy_product = new Product[cnt];
		int j = 0;
		for(int i = 0; i < cnt; i++)
		{
			if(products[i] instanceof TV)
			{
				copy_product[j] = products[i];
			}
		}
		
		return copy_product;
	}

	@Override
	public Product[] search_Refrigerator() {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i = 0; i < index; i++)
		{
			if(products[i] instanceof Refrigerator)
			{
				cnt++;
			}
		}
		
		Product[] copy_product = new Product[cnt];
		int j = 0;
		for(int i = 0; i < cnt; i++)
		{
			copy_product[j] = products[i];
			j++;
		}
		
		return copy_product;
	}

	@Override
	public Product search_productNum(String productNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product search_name(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sum_price() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int product_price(int choice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int product_Qty(int choice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product[] search_name_price(String name, int price) {
		// TODO Auto-generated method stub
		return null;
	}

}
