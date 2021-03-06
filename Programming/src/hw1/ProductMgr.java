package hw1;

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
	
	public Product[] search_product_price() {
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
	
	public String[] search_product_num(String s) {
		int cnt = 0;
		System.out.println(s);
		if(s.equals("TV")){
			for(int i=0; i< index; i++) {
				if(products[i] instanceof TV) {
					cnt++;
				}
			}
			String[] str = new String[cnt];
			int j=0;
			for(int i=0; i< index; i++) {
				if(products[i] instanceof TV) {
					str[j] = products[i].getName() + " " + products[i].getPrice()*products[i].getQuantity();
					j++;
				}
			}	
			for(int i=0; i< str.length;i++) {
	
					System.out.println(str[i]);
					
			}	
		}else if (s.contains("ref")){
			for(int i=0; i< index; i++) {
				if(products[i] instanceof Refrigerator) {
					cnt++;
				}
			}
			String[] str = new String[cnt];
			int j=0;
			for(int i=0; i< index; i++) {
				if(products[i] instanceof Refrigerator) {
					str[j] = products[i].getName() + " " + products[i].getPrice()*products[i].getQuantity();
					j++;
				}
			}	
		}
		return str;
	}
	public String[] search_product_quantity(String s ) {
		int cnt = 0;
		for(int i=0; i< index; i++) {
			if(products[i] instanceof Refrigerator) {
				cnt++;
			}
		}
		String[] str = new String[cnt];
		int j=0;
		for(int i=0; i< index; i++) {
			if(products[i] instanceof Refrigerator) {
				str[j] = products[i].getName() + " " + products[i].getQuantity();
				j++;
			}
		}
		
		return str;
	}

	public int search_product_avgInch() {
		int sum=0;
		int cnt = 0;
		for(int i=0; i< index; i++) {
			if(products[i] instanceof Refrigerator) {
				sum +=products[i].getInch();
				cnt++;
			}
		}
		sum = sum/cnt;
		return sum;
	}
	public int search_product_liter() {
		int sum=0;
		int cnt = 0;
		for(int i=0; i< index; i++) {
			if(products[i] instanceof Refrigerator) {
				sum +=products[i].getLiter();
			}
		}
		
		return sum;
	}
	
	public Product[] search_product_quantity(String name, int price ) {
		int cnt = 0;
		int j=0;
		for(int i=0; i< index; i++) {
			if(products[i].getName().contains(name) && products[i].getPrice()<=price) {
				cnt++;
			}
		}
		Product[] name_Products = new Product[cnt];

		for(int i=0; i< index; i++) {
			if(products[i].getName().contains(name) && products[i].getPrice()<=price) {
				name_Products[j] = products[i];
				j++;
			}
		}
		return name_Products;
	}
}