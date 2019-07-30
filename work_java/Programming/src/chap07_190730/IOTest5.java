package chap07_190730;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("111", 10000);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("aaa");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
