package a.net;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.border.Border;

public class MyClient {
	Socket s;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	class ClientThread extends Thread
	{
		public ClientThread() {
			try {
				s = new Socket("localhost", 9000);
				oos = new ObjectOutputStream(s.getOutputStream());
				ois = new ObjectInputStream(s.getInputStream());
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void run() {
			while(true)
			{
				try {
					ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					
				}
			}
		
		}
	}
	
	public MyClient() {
		createGUI();
	}
	
	private void createGUI() {
		// TODO Auto-generated method stub
		TextField tf = new TextField();
		tf.setColumns(15);
		Button b = new Button("버튼");
		TextArea ta = new TextArea();
		Panel p = new Panel();
		p.add(tf);
		p.add(b);
		this.add(ta, BorderLayout.CENTER);
		this.add(p);
		this.setSize(500, 500);
		this.setLocation(400, 500:)
	}

	void go()
	{
		new ClientThread().start();
	}
	
	public static void main(String[] args) {
		new MyClient().go();
		

	}

}
