package a.net;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.border.Border;

public class MyClient extends Frame{
	Socket s;
	ObjectOutputStream oos;
	ObjectInputStream ois;

	class ClientThread extends Thread {
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
			try {
				while (true) {
					ois.readObject();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					ois.close();
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public MyClient() {
		createGIU();
	}
	
	private void createGIU() {
		// TODO Auto-generated method stub
		TextField tf = new TextField();
		tf.setColumns(15);
		Button b = new Button("버튼");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//send();
			}
		});
		TextArea ta = new TextArea();
		ta.setColumns(30);
		Panel p = new Panel();
		p.add(tf);
		p.add(b);
		
		this.addWindowStateListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
			
		});
		this.add(ta,BorderLayout.CENTER);
		this.add(p,BorderLayout.SOUTH);
		this.setSize(500,500);
		this.setLocation(400, 500);
		this.setVisible(true);
	}

	void go() {
		new ClientThread().start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClient().go();
	}

}
