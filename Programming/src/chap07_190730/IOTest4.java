package chap07_190730;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
//		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("sample333.txt");
			dos = new DataOutputStream(new BufferedOutputStream(fos));
			dos.writeInt(256);	
			dos.writeDouble(3.141592);
			dos.writeUTF("hello SSAFY");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream
					(new BufferedInputStream
							(new FileInputStream("sample333.txt")));
			int a = dis.readInt();
			double b = dis.readDouble();
			String c = dis.readUTF();
			System.out.println(a + ", " + b + ", " + c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
