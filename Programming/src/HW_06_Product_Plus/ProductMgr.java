package HW_06_Product_Plus;


public class ProductMgr {
	private Product[] products = new Product[100];
	private int index = 0;
		
	public void addProduct(Product add_product) {
		products[index] = add_product;
		index++;
	}
	public void deleteProduct(String delete_product) {
		int i;
		for(i=0; i<index; i++) {
			if(products[i].getProductNum().equals(delete_product)) {
				break;
			}
		}
		products[i] = products[index-1];
		index--;
	}
	public void printBook() {
		for(int i = 0; i< index; i++) {
			
		}
	}
	public Product[] search() {
		Product[] copy_book = new Product[index];
		System.arraycopy(products, 0, copy_book, 0, index);
		return copy_book;
	}

	public Product[] search_TV() {
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
		
	
	public Product[] search_Refrigerator() {
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
	
	public Product search_productNum(String productNum) {
		int i;
		for(i=0; i<index; i++) {
			if(products[i].getProductNum().equals(productNum)) {
				break;
			}
		}
		return products[i];
	}
	

	public Product search_name(String name) {
		int i;
		for(i=0; i<index; i++) {
			if(products[i].getName().contains(name)) {
				break;
			}
		}
		return products[i];
	}

	public int sum_price() {
		int sum = 0;
		for(int i=0; i<index; i++) {
			sum += products[i].getPrice();
		}
		return sum;
	}
	
	
	public int product_price(int choice)
	{
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
	
	public int product_Qty(int choice) {
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
	
	
	public Product[] search_name_price(String name, int price) {
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
