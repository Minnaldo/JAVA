package chap07_190730;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("sample.txt");
		String str = new String("Hello SSAFY");
		byte[] word = str.getBytes();
		fos.write(word);
		fos.close();
		
	}

}
