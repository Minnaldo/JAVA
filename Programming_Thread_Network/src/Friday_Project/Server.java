package Friday_Project;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		ServerSocket ss = new ServerSocket(7000);

		while(true) {
			System.out.println("서버 열었다!!!");
			Socket ser = ss.accept();
			//객체 전송
			//		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(ser.getInputStream()));

			//문자열 읽어오기
			br = new BufferedReader(new InputStreamReader(ser.getInputStream()));
			System.out.println("client: "+br.readLine());
			
			bw = new BufferedWriter(new OutputStreamWriter(ser.getOutputStream()));
			String str = sc.next();
			bw.write(str);
			
			bw.flush();
			bw.close();
		}
//		br.close();

	}

}
