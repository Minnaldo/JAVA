package chap07_190730;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("aaa"));
			Car c = (Car) ois.readObject();
			System.out.println(c.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
