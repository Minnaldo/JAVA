package chap08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class BookServer {
	private ServerSocket ssock;
	private ArrayList<Socket> clients;

	public BookServer() throws IOException {
		ssock = new ServerSocket(7000);
		clients = new ArrayList<>();
	}

	void go() throws IOException, ClassNotFoundException
	{
		while(true)
		{
			System.out.println("서버는 대기중...!!!");
			Socket accept = ssock.accept();
			clients.add(accept);
//			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(accept.getInputStream()));
//			ArrayList<Book> list = (ArrayList<Book>) ois.readObject();
//			print(list);
			System.out.println(accept.getInetAddress().getHostAddress() + " 님이 접속하셨습니다.");
			System.out.println("현재접속중인 client = " + clients.size() + "입니다.");
			new ClientThread(accept).start();
		}
	}

	private class ClientThread extends Thread
	{
		private Socket accept;
		public ClientThread(Socket accept)
		{
			this.accept = accept;
		}
		
		@Override
		public void run() {
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			try {
				ois = new ObjectInputStream(new BufferedInputStream(accept.getInputStream()));
				ArrayList<Book> list = (ArrayList<Book>) ois.readObject();
				print(list);
				oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")));
				oos.writeObject(list);
				oos.flush();
				oos.close();
				for(int i = 0; i < clients.size(); i++)
				{
					if(clients.get(i) == accept)
					{
						System.out.println(clients.get(i).getInetAddress().getHostAddress() + " 님이 접속을 끊으셨습니다.");
						clients.remove(i);
					}
				}
				accept.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
			}
			
			
			
		}
	}
	
	void print(List<Book> list)
	{
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new BookServer().go();
			System.out.println("서버실행 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
