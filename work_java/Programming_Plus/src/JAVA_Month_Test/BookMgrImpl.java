package JAVA_Month_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookMgrImpl implements IBookMgr{

	//파일 저장 및 읽기 위해
	private File file = new File("data.txt");

	//ArrayList
	private ArrayList<Book> bs = new ArrayList();

	private static BookMgrImpl instance = new BookMgrImpl();

	public BookMgrImpl()
	{
		load();
	}

	public static BookMgrImpl getIntstance(){
		return instance;
	}


	@Override
	public void load() {
		// TODO Auto-generated method stub
		//객체 생성시 파일의 존재 유무를 판단하여, 파일 존재시 파일을 읽어온다.
		if(!file.exists())		//파일이 존재하지않으면
			return;				//끝

		bs.clear();
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			ArrayList<Book> readObject = (ArrayList<Book>)ois.readObject();
			bs = readObject;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ois != null)
					ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			oos.writeObject(bs);
			System.out.println(bs.size() + " 개가 저장되었습니다.");
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 저장 실패");
		}finally {
			if(oos != null)
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("파일 닫기 실패");
				}
		};
	}

	@Override
	public void add(Book b) throws DuplicateException {
		
		try {
			search(b.getIsbn());
			throw new DuplicateException();
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bs.add(b);
		}
	}

	@Override
	public List<Book> search() {
		
		return bs;
	}

	@Override
	public Book search(String isbn) throws RecordNotFoundException {
		for (Book b : bs) {
			if(isbn.equals(b.getIsbn()))
			{
				return b;
			}
		}
		
		throw new RecordNotFoundException();
	}

	@Override
	public void update(String isbn, int price) throws RecordNotFoundException {
		
		Book b = search(isbn);
		b.setPrice(price);
		
	}

	@Override
	public void delete(String isbn) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		Book b = search(isbn);
		bs.remove(b);
		System.out.println(b.getTitle() + " 도서가 삭제되었습니다.");
	}

	@Override
	public List<Book> searchTitle(String title) {
		// TODO Auto-generated method stub
		ArrayList<Book> temp = new ArrayList<Book>();
		for (Book b : bs) {
			if(b.getTitle().contains(title))
			{
				temp.add(b);
			}
		}
		return temp;
	}

	@Override
	public List<Book> sortIsbn() {
		//Comparable
		Collections.sort(bs);
		
		//Comparator
//		Collections.sort(bs, new BookComparator());
		return null;
	}

	@Override
	public String countWord() {
		Map<String, Integer> m = new HashMap<>();
		
		for (Book b : bs) {
			String[] ts = b.getTitle().split(" ");
			for (String t : ts) {
				if(m.containsKey(t))
				{
					m.put(t,  m.get(t)+1);
				}
				else
				{
					m.put(t,  1);
				}
			}
		}
		int max = 0;
		String posKey="";
		for (String key : m.keySet()) {
			if(max < m.get(key))
			{
				max = m.get(key);
				posKey = key;
			}
		}
		
		return posKey;
	}

	@Override
	public void send() throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost", 7000);
		
	}

}
