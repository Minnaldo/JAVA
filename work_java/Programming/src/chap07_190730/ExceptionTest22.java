package chap07_190730;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class ExceptionTest22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		try {
			result = div(a, b);
			System.out.println(100/ result);
		} catch (ArithmeticException e) {	//런타임 에러
			System.out.println("ArithmeticException");
		} catch (MyDataInputException e)
		{
			e.showError();
//			System.out.println("DataFormatException");
		}
		System.out.println("programg end");
	}

	static int div(int a, int b) throws ArithmeticException, MyDataInputException{
		int result = 0;
		
		if ( b == 0 )
		{
			throw new MyDataInputException("0을 입력하지 마세요");
		}

		return result;
	}
}
