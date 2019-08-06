package chap08;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ImanagerImpl implements IManager {

	private ArrayList<Book> list;
	private static ImanagerImpl man = new ImanagerImpl();
	
	public static ImanagerImpl getInstance()
	{
		return man;
	}
	
	private ImanagerImpl() {
		 list = new ArrayList<Book>();
	}
	
	@Override
	public void add(Book b) throws MyException {
		// TODO Auto-generated method stub
		for(Book books : list)
		{
			if(books.getIsbn().equals(b.getIsbn()))
			{
				throw new MyException();
			}
		}
		list.add(b);
	}

	@Override
	public void update(Book b) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getIsbn().equals(b.getIsbn()))
			{
				list.set(i, b);
			}
		}
	}

	@Override
	public void delete(String isbn) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getIsbn().equals(isbn))
			{
				list.remove(i);
			}
		}
	}

	@Override
	public List<Book> search() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Book search(String isbn) throws MyException{
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getIsbn().equals(isbn))
			{
				return list.get(i);
			}
		}
		throw new MyException();
	}

	@Override
	public void send() throws UnknownHostException, IOException  {
		// TODO Auto-generated method stub
//		Socket s = new Socket("localhost", 7000);
//		Socket s = new Socket("192.168.24.127", 7000);	//민
//		Socket s = new Socket("192.168.24.126", 9000);	//현정
//		Socket s = new Socket("192.168.24.115", 7000);	//태호
//		Socket s = new Socket("192.168.24.114", 7000);	//민혜
//		Socket s = new Socket("192.168.24.113", 7000);	//희수
//		Socket s = new Socket("192.168.24.118", 7000);	//찬영
		Socket s = new Socket("192.168.24.119", 7000);	//한빛누나
//		Socket s = new Socket("192.168.24.234", 7000);	//강사님
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(s.getOutputStream()));
		oos.writeObject(list);
		oos.flush();
		
		
	}


}
