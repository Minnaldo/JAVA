package a.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;

public class MyServer {
	
	class ServerThread extends Thread {
		
		class ServerThread extends Thread {
			Socket s;
			
			public ServerThread(Socket s)
			{
				this.s = s;
			}
		}
		
		@Override
		public void run() {
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			
			ois = new ObjectInputStream(this.s.getInputStream());
			oos = new ObjectOutputStream(this.s.getOutputStream());
			Object object = ois.readObject();
			oos.writeObject(object);
			oos.flush();
			
		}
	}
	
	
	
	
	
	ServerSocket ss;
	private void go()
	{
		try {
			ss = new ServerSocket(9000);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new ServerThread().start();
	}
	
	public static void main(String[] args) {
		new MyServer().go();
	}
}
