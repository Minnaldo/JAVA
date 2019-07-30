//Program End... 가 나오게 하기.
//Exception 처리를 할 것.

package chap07_190730;

import java.io.*;

class InputFile {
	FileReader fis;

	//여기서의 에러를 try ~catch 를 사용하는게 아니라 전져ㅇ줘야함
	public InputFile(String filename) throws FileNotFoundException{
		fis = new FileReader("data.txt");
//		throw new Exception();
	}

	void readLine() throws IOException{
		String s;
		BufferedReader buf = new BufferedReader(fis);
		while ((s = buf.readLine()) != null)
			System.out.println(s);

	}

	public static void main(String[] a) {
		InputFile inputFile;
			try {
				inputFile = new InputFile("data.txt");
				inputFile.readLine();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		System.out.println("Program End...");
	}
}