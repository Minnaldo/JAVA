package Network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7000);
//		BufferedReader br = null;
//		BufferedWriter bw = null;
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		try {
			while(true)
			{
				System.out.println("서버는 기다리는중");
				Socket cli = ss.accept();	//여기서 기다리고 있다. 클라이언트가 접속하기 전까지
				cli.getInputStream();
				cli.getOutputStream();

//				InputStream is = cli.getInputStream();
//				br = new BufferedReader(new InputStreamReader(is));
//				String str = br.readLine();
//				System.out.println("client로부터 날아온 문자열 /t" + str);
				
				ois = new ObjectInputStream(new BufferedInputStream(cli.getInputStream()));
				
				Customer cus = (Customer) ois.readObject();
				System.out.println("client로부터 날아온 문자열 " + cus.toString());
				
				oos = new ObjectOutputStream(new BufferedOutputStream(cli.getOutputStream()));
				
				oos.writeObject(cus);
				oos.flush();

//				bw = new BufferedWriter(new OutputStreamWriter(cli.getOutputStream()));
//				bw.write(str + " - 서버로부터 날아온 문자열이다 \n");
//				bw.flush();
			}
		} catch(IOException e) {
		} finally {
			ois.close();
			oos.close();
			
//			bw.close();
//			br.close();
//			ss.close();
		}
	}

}
