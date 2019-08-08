package a.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Object{
	
	class ServerThread extends Thread {
		Socket s;

		public ServerThread(Socket s) {
			this.s = s;
		}

		public void run() {
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			try {
				while (true) {
					ois = new ObjectInputStream(this.s.getInputStream());
					oos = new ObjectOutputStream(this.s.getOutputStream());
					Object object = ois.readObject();
					oos.writeObject(object);
					oos.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					oos.close();
					this.s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	ServerSocket ss;
	private void go() {
		try {
			while (true) {
				ss = new ServerSocket(9000);
				Socket accept = ss.accept();
				new ServerThread(accept).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MyServer().go();
	}
}
