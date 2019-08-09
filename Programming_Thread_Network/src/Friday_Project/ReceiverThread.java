package Friday_Project;

import java.io.BufferedReader;
import java.io.IOException;

public class ReceiverThread implements Runnable{
	private BufferedReader br;
	public ReceiverThread(BufferedReader br) {
		// TODO Auto-generated constructor stub
		this.br = br;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
			try {
				String msg = null;
				while( (msg = br.readLine()) != null ) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
