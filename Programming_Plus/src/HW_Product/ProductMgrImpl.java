package HW_Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductMgrImpl implements IProductMgr {

	ArrayList<Product> list = new ArrayList<>();
	private static ProductMgrImpl pmgr = new ProductMgrImpl();
	 
	private ProductMgrImpl() {
		// TODO Auto-generated constructor stub
//		open();
	}
	
	public static ProductMgrImpl getInstance() {
		return pmgr; 
	}
	 
	@Override
	public void addProduct(Product add_product) {
		// TODO Auto-generated method stub
		boolean add = list.add(add_product);
	}

	@Override
	public ArrayList<Product> printProduct() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public ArrayList<Product> searchNum(String product_num) {
		// TODO Auto-generated method stub
		ArrayList<Product> temp = new ArrayList<>();
		for(Product p : list)
		{
			if(p.getProductNum().equals(product_num))
				temp.add(p);
		}
		return temp;
	}

	@Override
	public ArrayList<Product> searchName(String product_name) {
		// TODO Auto-generated method stub
		ArrayList<Product> temp = new ArrayList<>();
		for(Product p : list)
		{
			if(p.getName().equals(product_name))
				temp.add(p);
		}
		return temp;
	}

	@Override
	public ArrayList<Product> searchTV() {
		// TODO Auto-generated method stub
		ArrayList<Product> temp = new ArrayList();
		for(Product p : list)
		{
			if(p instanceof TV)
			{
				temp.add(p);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Product> searchRefrigerator() {
		// TODO Auto-generated method stub
		ArrayList<Product> temp = new ArrayList();
		for(Product p : list)
			if(p instanceof Refrigerator)
			{
				temp.add(p);
			}
		return temp;
	}

	@Override
	public void delete_num(String Product_num) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getProductNum().equals(Product_num))
			{
				list.remove(i);
			}
		}
	}


	@Override
	public ArrayList<Product> searchRefrigerator(int Guarantee) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Product> temp = new ArrayList<>();
        for (Product product : list) {
            if(product instanceof Refrigerator && ((Refrigerator) product).getGuarantee() >= Guarantee){
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
        for (Product product : list) {
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
		for (Product product : list) {
            if(product.getProductNum().equals(proNum))
                product.setPrice(price);
        }
	}

	@Override
	public int sumPrice() {
		// TODO Auto-generated method stub
		int sum = 0;
        for (Product product : list) {
            sum += product.getPrice() * product.getQuantity();
        }
        return sum;
	}
	

	@Override
	public void open() {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text.dat"));
			
			ArrayList<Product> list = (ArrayList<Product>)ois.readObject();
			
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text.dat"));
			
			oos.writeObject(list);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
