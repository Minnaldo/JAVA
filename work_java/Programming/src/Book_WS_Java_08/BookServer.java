package Book_WS_Java_08;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;

public class BookServer {

	public static void main(String[] args) throws IOException {

		//throws IOException 해 줌.
		ServerSocket ss = new ServerSocket(7000);
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		
	}

}
