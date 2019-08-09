package Friday_Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServerTest {
	public static void main(String[] args) {
		try {
			//port를 지정해서 ServerSocket을 생성하고 accept 대기.
			ServerSocket serverSocket = new ServerSocket(7001);
			
			while(true) {
				Socket socket = serverSocket.accept();
//				"192.168.24.235", 7001
				System.out.println(socket.getInetAddress());
				
				//socket객체로부터 입출력 스트림을 얻어서 원하는 형태로 가공
				BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( socket.getOutputStream() ) );
				BufferedReader br = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
				
				ServerThread.bwList.add(bw);
				new Thread(new ServerThread(br)).start();
			
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
