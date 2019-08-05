package Network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		Socket ser = new Socket("localhost", 7000);			//localhost
		Socket ser = new Socket("192.168.24.127", 7000);	//민
//		Socket ser = new Socket("192.168.24.126", 9000);	//현정
//		Socket ser = new Socket("192.168.24.115", 7000);	//태호
//		Socket ser = new Socket("192.168.24.114", 7000);	//민혜
//		Socket ser = new Socket("192.168.24.113", 7000);	//희수
//		Socket ser = new Socket("192.168.24.118", 7000);	//찬영
//		Socket ser = new Socket("192.168.24.119", 7000);	//한빛누나
		
		Scanner s = new Scanner(System.in);
		//ser.getInputStream();
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ser.getOutputStream()));
		
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(ser.getOutputStream()));
		System.out.println("서버에 보낼 이름,나이,주소를 입력하세요");

		String name = s.next();
		int age = s.nextInt();
		String addr = s.next();
		Customer c = new Customer(name, age, addr);
		
		oos.writeObject(c);
		oos.flush();
		
//		String send = s.next();
//		bw.write(send + "\n");
//		bw.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(ser.getInputStream()));
		String Receiver = br.readLine();
		System.out.println(Receiver);
		
//		br.close();
//		bw.close();
		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(ser.getInputStream()));
		Customer cus = (Customer) ois.readObject();
		System.out.println(cus.toString());
		
		ois.close();
		ser.close();
	}

}
