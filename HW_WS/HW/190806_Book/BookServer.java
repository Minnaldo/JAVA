package edu.ssafy.chap08.two;

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

	void go() throws IOException, ClassNotFoundException, Exception {
		while (true) {
			System.out.println("서버는 대기중");
			Socket accept = ssock.accept();
			clients.add(accept);
			System.out.println(accept.getInetAddress().getHostAddress()+ " 님이 접속하셨습니다");
			System.out.println("현재접속중인 clent 는 "+clients.size()+ "입니다");
			new ClientThread(accept).start();
		}
	}

	private class ClientThread extends Thread {
		private Socket accept;

		public ClientThread(Socket accept) {
			this.accept = accept;
		}

		public void run() {
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			//boolean flag = true;

			try {
				while (true) {
					ois = new ObjectInputStream(new BufferedInputStream(accept.getInputStream()));
					ArrayList<Book> list = (ArrayList<Book>) ois.readObject();
					print(list);
					oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data.ser")));
					oos.writeObject(list);
					oos.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//flag = false;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					oos.close();
					ois.close();
					for (int i = 0; i < clients.size(); i++) {
						if(clients.get(i)==accept) {
							System.out.println(clients.get(i).getInetAddress().getHostAddress() + " 님이 접속을 끈으셨읍니다");
							clients.remove(i);
						}
					} 
					accept.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void print(List<Book> list) {
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		try {
			new BookServer().go();
			System.out.println("서버실행 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
