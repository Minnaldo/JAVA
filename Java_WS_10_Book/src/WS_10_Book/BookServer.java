package WS_10_Book;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class BookServer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7000);
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
	
		try {
			while(true)
			{
				System.out.println("서버는 기다린다");
				Socket cli = ss.accept();
				cli.getInputStream();
				cli.getOutputStream();
				
				ois = new ObjectInputStream(new BufferedInputStream(cli.getInputStream()));
				
				ArrayList<Book> cus = (ArrayList<Book>) ois.readObject();
				
				for(Book b : cus)
				{
					System.out.println(b);
				}
				
				oos = new ObjectOutputStream(new BufferedOutputStream(cli.getOutputStream()));
				
				oos.writeObject(cus);
				oos.flush();
			}
		} catch(IOException e)
		{
			ois.close();
			oos.close();
		}
	}

}
