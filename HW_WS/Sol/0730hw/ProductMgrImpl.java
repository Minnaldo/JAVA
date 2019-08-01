package week3.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ProductMgrImpl implements IProductMgr {
     
    ArrayList<Product> products = new ArrayList<>();
     
	public ProductMgrImpl() {
		
	        open();
	}
    
    @Override
    public void addProduct(Product p) throws DuplicateException {
        // TODO Auto-generated method stub
    	for (Product product : products) {
			if(product.getName().equals(p.getName()) && product.getProNum().equals(p.getProNum())) {
				throw new DuplicateException();
			}
		}
        products.add(p);
         
    }
 
    @Override
    public ArrayList<Product> printProduct() {
        // TODO Auto-generated method stub
        return products;
    }
 
    @Override
    public ArrayList<Product> searchNum(String proNum) throws CodeNotFoundException {
        // TODO Auto-generated method stub
        ArrayList<Product> temp = new ArrayList<>();
        for (Product product : products) {
            if(product.getProNum().equals(proNum)){
                temp.add(product);
            }
        }
        if(temp.size() == 0) throw new CodeNotFoundException();
        return temp;
    }
 
    @Override
    public ArrayList<Product> searchName(String name) {
        // TODO Auto-generated method stub
        ArrayList<Product> temp = new ArrayList<>();
        for (Product product : products) {
            if(product.getName().contains(name)){
                temp.add(product);
            }
        }
        return temp;
    }
 
    @Override
    public ArrayList<Product> searchTv() {
        // TODO Auto-generated method stub
        ArrayList<Product> temp = new ArrayList<>();
        for (Product product : products) {
            if(product instanceof TV){
                temp.add(product);
            }
        }
        return temp;
    }
 
    @Override
    public ArrayList<Product> searchRefrigerator() {
        // TODO Auto-generated method stub
        ArrayList<Product> temp = new ArrayList<>();
        for (Product product : products) {
            if(product instanceof Refrigerator){
                temp.add(product);
            }
        }
        return temp;
    }
 
    @Override
    public ArrayList<Product> searchRefrigerator(int capacity) throws ProductNotFoundException { // 400L이하의 냉장고
        // TODO Auto-generated method stub
        ArrayList<Product> temp = new ArrayList<>();
        for (Product product : products) {
            if(product instanceof Refrigerator && ((Refrigerator) product).getCapacity() >= capacity){
                temp.add(product);
            }
        }
        if(temp.size() == 0) throw new ProductNotFoundException();
        return temp;
    }
 
    @Override
    public ArrayList<Product> searchTv(int inch) throws ProductNotFoundException {
        // TODO Auto-generated method stub
        ArrayList<Product> temp = new ArrayList<>();
        for (Product product : products) {
            if(product instanceof TV && ((TV) product).getInch() >= inch){
                temp.add(product);
            }
        }
        if(temp.size() == 0) throw new ProductNotFoundException();
        return temp;
    }
 
    @Override
    public void updatePrice(String proNum, int price) {
        // TODO Auto-generated method stub
        for (Product product : products) {
            if(product.getProNum().equals(proNum))
                product.setPrice(price);
        }
         
    }
 
    @Override
    public int sumPrice() {
        // TODO Auto-generated method stub
        int sum = 0;
        for (Product product : products) {
            sum += product.getPrice() * product.getStock();
        }
        return sum;
    }
 
    @Override
    public void delProduct(String proNum) {

        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProNum().equals(proNum)){
                products.remove(i);
            }
        }
         
    }
    
    @Override
    public void open() {
        // TODO Auto-generated method stub
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("product.dat"));
            Product p;
            while((p = (Product)ois.readObject()) != null) {
            	products.add(p);
            }
        } catch (FileNotFoundException e) {
        	
        } catch (IOException e) {
        	
        } catch (ClassNotFoundException e) {
        	
        } finally {
            try {
            	if(ois != null)
            		ois.close();
            } catch (IOException e) {
 
            }
        }
         
    }
 
    @Override
    public void close() {
        // TODO Auto-generated method stub
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("product.dat");
            oos = new ObjectOutputStream(fos);
            for (Product product : products) {
                oos.writeObject(product);
            }
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
        } catch (IOException e) {
        	
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
        }
    }
 
 
 
}