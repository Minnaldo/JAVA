package com.ssafy.bms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookMgrImpl implements IBookMgr {

	List<Book> list = new ArrayList<Book>();
	private static BookMgrImpl man = new BookMgrImpl();
	
	public static BookMgrImpl getInstance()
	{
//		man.load();
		return man;
	}
	
	
	private BookMgrImpl() {	
		list = new ArrayList<Book>();
	}
	
	
	@Override //O
	public void add(Book b) throws DuplicateException {
		for (Book book : list) {
			if(book.getIsbn().equals(b.getIsbn()))
			{
				throw new DuplicateException("데이터가 중복되었습니다.");
			}
		}
		list.add(b);
	}
	
	@Override//O
	public void update(String isbn, int price) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getIsbn().equals(isbn))
			{
				list.get(i).setPrice(price);
			}
		}
	}
	
	@Override//O
	public void delete(String isbn) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getIsbn().equals(isbn))
				list.remove(i);
		}
	}
	
	@Override //O
	public List<Book> search() {
		// TODO Auto-generated method stub
		
		return list;
	}
	
	
	@Override
	public List<Book> searchTitle(String title) {
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getTitle().equals(title))
			{
				return (List<Book>) list.get(i);
			}
		}
		return null;
	}

	
	
	
	@Override
	public void load() {
		// TODO Auto-generated method stub
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("data.txt"));
			ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream (new FileOutputStream("data.txt"));
			oos.writeObject(oos);
			
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	

	

	@Override
	public List<Book> sortIsbn() {
		// TODO Auto-generated method stub
		Collections.sort(list);
		return null;
	}

	@Override
	public String countWord() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override	//isbn으로 도서 검색//O
	public Book search(String isbn) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		List<Book> temp = new ArrayList<>();
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getIsbn().equals(isbn))
			{
				return list.get(i);
			}
		}
		return null;
	}


	

	

	

}
