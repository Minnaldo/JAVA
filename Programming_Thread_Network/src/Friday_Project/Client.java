package Friday_Project;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

public class Client {
	private JList<String> list;
	private JTextField tf;
	private JButton button;
	private JFrame f;
	DefaultListModel<String> model;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Socket cli = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		PrintWriter out = null;
		
		System.out.println("??!!");

		
		System.out.println("0입력하면 채팅 종료");
		while(true) {
			
			try {
				cli = new Socket("localhost", 7000);
				bw = new BufferedWriter(new OutputStreamWriter(cli.getOutputStream()));
				br = new BufferedReader(new InputStreamReader(cli.getInputStream()));
				out = new PrintWriter(bw);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			if(str.equals("0")) break;
			try {
				String str = sc.next();
//				out.write(str);
				out.println(str);
				out.flush();
				System.out.println("server: "+br.readLine());
				
				cli.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//			br.close();
			
		}
	}

}
