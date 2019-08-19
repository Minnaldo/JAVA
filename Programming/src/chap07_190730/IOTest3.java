package chap07_190730;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTest3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("sample22.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String s = "Hello ssafy";
		bos.write(s.getBytes());
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		osw.write("Hello SSAFY FF");
		bw.flush();
		bw.close();
		
		
		BufferedWriter bw22 = new BufferedWriter
								(new OutputStreamWriter
										(new FileOutputStream("sample22.txt")));		//노드스트림
		bw22.write("HELLO SSAFY CCCC");
		bw22.flush();
		bw22.close();
		
		FileInputStream fis = new FileInputStream("sample22.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String sam;
		while( (sam = br.readLine()) != null)
		{
			System.out.println(sam);
		}
		
	}

}
