package edu.ssafy.chap08.two;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ManagerImpl implements IManager {
	private ArrayList<Book> list;
	private static ManagerImpl man = new ManagerImpl();
	
	public static ManagerImpl getInstance() {
		return man;
	}
	private ManagerImpl() {
		list = new ArrayList<Book>();
	}
	
	@Override
	public void add(Book b) throws MyException {
		for(Book book :list) {
			if(book.getIsbn().equals(b.getIsbn())) {
				throw new MyException("중복데이타 입니다");
			}
		}
		list.add(b);
	}

	@Override
	public void update(Book b) {
		for (int i=0,size = list.size();i<size;i++) {
			if(list.get(i).getIsbn().equals(b.getIsbn())) {
				list.set(i, b);
			}
		}
	}

	@Override
	public void delete(String isbn) {
		for (int i=0,size = list.size();i<size;i++) {
			if(list.get(i).getIsbn().equals(isbn)) {
				list.remove(i);
			}
		}
	}

	@Override
	public List<Book> search() {
		return list;
	}

	@Override
	public Book search(String isbn)  throws MyException{
		for (int i=0,size = list.size();i<size;i++) {
			if(list.get(i).getIsbn().equals(isbn)) {
				return list.get(i);
			}
		}
		throw new MyException("데이타 없어요");
	}

	@Override
	public void send() throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",7000);
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(s.getOutputStream()));
		oos.writeObject(list);
		oos.flush();
		//oos.close();
	}

}









