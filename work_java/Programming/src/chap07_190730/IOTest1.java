package chap07_190730;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("Hello.txt");
		FileInputStream fis = new FileInputStream(f);
		int a  = 0;
		while( (a = fis.read() ) != -1)
		{
			System.out.println((char)a);
		}
		
		System.out.println("______--------------------------____________");
		
		FileReader fr = new FileReader(f);
		while((a=fr.read()) != -1)
		{
			System.out.println((char)a);
		}
				
		fis.close();
		fr.close();
		
	}	

}
