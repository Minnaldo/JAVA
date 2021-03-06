package HW_10_Product;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ProductMgrImpl implements IProductMgr {
	
	ArrayList<Product> pList = new ArrayList<>();
	private static ProductMgrImpl instance = new ProductMgrImpl();
	
	public static ProductMgrImpl getInstance(){
		return instance;
	}

	@Override
	public void add(Product p) throws DuplicateException {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(Product check : pList) {
			if(check.getProductNum().equals(p.getProductNum())) {
				flag = true;
			}
		}
		if(flag) throw new DuplicateException();
		pList.add(p);
	}
	
	
	@Override
	public ArrayList<Product> print_all() {
		// TODO Auto-generated method stub
		return pList;
	}

	@Override
	public ArrayList<Product> print_all_pronum(String num) throws ProductNotFoundException{
		// TODO Auto-generated method stub
		ArrayList<Product> list_pronum = new ArrayList<Product>();
		for(Product p : pList) {
			if(p.getProductNum().equals(num))
				list_pronum.add(p);
		}
		if(list_pronum.isEmpty()) {
			throw new ProductNotFoundException();
		}
		return list_pronum;
	}
	
	@Override
	public ArrayList<Product> print_all_proname(String name) {
		// TODO Auto-generated method stub
		ArrayList<Product> list_proname = new ArrayList<Product>();
		for(Product p : pList) {
			if(p.getName().equals(name))
				list_proname.add(p);
		}
		return list_proname;
	}
	
	@Override
	public ArrayList<Product> check_TV() {
		// TODO Auto-generated method stub
		ArrayList<Product> list_TV = new ArrayList<Product>();
		for(Product p : pList) {
			if(p instanceof TV) {
				list_TV.add(p);
			}
		}
		return list_TV;
	}

	@Override
	public ArrayList<Product> check_Ref() {
		// TODO Auto-generated method stub
		ArrayList<Product> list_Ref = new ArrayList<Product>();
		for(Product p : pList) {
			if(p instanceof Refrigerator) {
				list_Ref.add(p);
			}
		}
		return list_Ref;
	}

	@Override
	public void delete(String num) {
		// TODO Auto-generated method stub
		for(Product p : pList) {
			if(p.getProductNum().equals(num))
				pList.remove(p);
		}
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("product.dat"));
			pList = (ArrayList<Product>)ois.readObject();
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
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.dat"));
			oos.writeObject(pList);
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


	@Override
	public ArrayList<Product> searchRe400() throws ProductNotFoundException {
		// TODO Auto-generated method stub
		ArrayList <Product> list = new ArrayList<Product>();
		for(int i=0;i<pList.size();i++) {
			if(pList.get(i) instanceof Refrigerator) {
				Refrigerator r = (Refrigerator) pList.get(i);
				if(r.getLiter()>=400){
					list.add(pList.get(i));
				}
			}
		}
		if(list.size()==0) {
			throw new ProductNotFoundException();
		}
		return list;
	}


	@Override
	public ArrayList<Product> searchTV50() throws ProductNotFoundException {
		// TODO Auto-generated method stub
		ArrayList <Product> list = new ArrayList<Product>();
		for(int i=0;i<pList.size();i++) {
			if(pList.get(i) instanceof TV) {
				TV tv = (TV) pList.get(i);
				if(tv.getInch()>=50){
					list.add(pList.get(i));
				}
			}
		}
		if(list.size()==0) {
			throw new ProductNotFoundException();
		}
		return list;
	}


	@Override
	public ArrayList<Product> searchNP(String name, int price) {
		// TODO Auto-generated method stub
		ArrayList <Product> list = new ArrayList<Product>();
		for(int i=0;i<pList.size();i++) {
			if(pList.get(i).getName().contains(name) && pList.get(i).getPrice()<=price){
				list.add(pList.get(i));
			}
		}
		return list;
	}


	@Override
	public int total() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<pList.size();i++){
			sum+=pList.get(i).getAmount()*pList.get(i).getPrice();
		}
		return sum;
	}

	@Override
	public void update(String num, int price) {
		// TODO Auto-generated method stub
		for(int i=0;i<pList.size();i++){
			if(pList.get(i).getProductNum().equals(num)){
				pList.get(i).setPrice(price);
				break;
			}
		}
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos;
		try
		{
			ArrayList<Product> list = new ArrayList<Product>();
			Socket ser = new Socket("localhost", 7000);
			oos = new ObjectOutputStream(new BufferedOutputStream(ser.getOutputStream()));
			
			for(Product p : pList)
			{
				if(p instanceof TV)
				{
					list.add(p);
				}
			}
			for(Product p : pList)
			{
				if(p instanceof Refrigerator)
				{
					list.add(p);
				}
			}
			oos.writeObject(list);
			oos.flush();
			oos.close();
			ser.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
