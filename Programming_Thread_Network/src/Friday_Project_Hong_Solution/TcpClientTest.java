package Friday_Project_Hong_Solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientTest {
	public static void main(String[] args) {
		try {
			//소켓객체를 생성함으로써 연결요청을 보냄.
			Socket socket = new Socket("192.168.24.127", 7001);
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( socket.getOutputStream() ) );
			BufferedReader br = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
			//연결이 되면 서버가 주는 웰컴메시지를 출력한 후 응답을 서버에게 보내자...
//			System.out.println(br.readLine());
			
			new Thread(new ReceiverThread(br)).start();
			Scanner sc = new Scanner(System.in);
			while(true) {
				bw.write(sc.nextLine() + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
