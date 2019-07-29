package Product_Interface_HW_07;

public class ProductMgrImpl implements IProductMgr{
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
		int i;
		for(i=0; i<index; i++) {
			if(products[i].getProductNum().equals(delete_product)) {
				break;
			}
		}
		products[i] = products[index-1];
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
		for(int i=0; i< index; i++) {
			if(products[i] instanceof TV) {
				cnt++;
			}
		}
		
		Product[] copy_product = new Product[cnt];
		int j=0;
		for(int i=0; i< index; i++) {
			if(products[i] instanceof TV) {
				copy_product[j] = products[i];
				j++;
				
			}
		}
		return copy_product;
	}

	@Override
	public Product[] search_Refrigerator() {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i=0; i< index; i++) {
			if(products[i] instanceof Refrigerator) {
				cnt++;
			}
		}
		
		Product[] copy_product = new Product[cnt];
		int j=0;
		for(int i=0; i< index; i++) {
			if(products[i] instanceof Refrigerator) {
				copy_product[j] = products[i];
				j++;
			}
		}
		return copy_product;
	}

	@Override
	public Product search_productNum(String productNum) {
		// TODO Auto-generated method stub
		int i;
		for(i=0; i<index; i++) {
			if(products[i].getProductNum().equals(productNum)) {
				break;
			}
		}
		return products[i];
	}

	@Override
	public Product search_name(String name) {
		// TODO Auto-generated method stub
		int i;
		for(i=0; i<index; i++) {
			if(products[i].getName().contains(name)) {
				break;
			}
		}
		return products[i];
	}

	@Override
	public int sum_price() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<index; i++) {
			sum += products[i].getPrice();
		}
		return sum;
	}

	@Override
	public int product_price(int choice) {
		// TODO Auto-generated method stub
		int sum = 0;
		int cnt = 0;
		if(choice == 1) {
			for(int i=0; i< index; i++) {
				if(products[i] instanceof TV) {
					sum += products[i].getPrice();
					cnt++;
				}
			}
		}
		
		else if(choice == 2) {
			for(int i=0; i< index; i++) {
				if(products[i] instanceof Refrigerator) {
					sum += products[i].getPrice();
					cnt++;
				}
			}
		}
		return sum;
	}

	@Override
	public int product_Qty(int choice) {
		// TODO Auto-generated method stub
		int sum = 0;
		int cnt = 0;
		if(choice == 1) {
			for(int i=0; i< index; i++) {
				if(products[i] instanceof TV) {
					sum += products[i].getQuantity();
					cnt++;
				}
			}
		}
		else if(choice == 2) {
			for(int i=0; i< index; i++) {
				if(products[i] instanceof Refrigerator) {
					sum += products[i].getQuantity();
					cnt++;
				}
			}
		}
		return sum;
	}

	@Override
	public Product[] search_name_price(String name, int price) {
		// TODO Auto-generated method stub
		int j=0, cnt=0;
		for(int i=0; i<index; i++) {
			if(products[i].getName().contains(name)) {
				cnt++;
			}
		}
		Product[] copy_product = new Product[cnt];
		for(int i=0; i<index; i++) {
			if((products[i].getName().contains(name))&&(products[i].getPrice() <= price)) {
				copy_product[j] = products[i];
				j++;
			}
		}
		return copy_product;
	}

}
