package chap07_190730;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		try {
			result = a / b;
		}catch(ArithmeticException e)
		{
			System.out.println("0을 입력하시면 안된다구요!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			System.out.println("Fannaly");
		}
		
		
		System.out.println("result : " + result);
		
		System.out.println("Program end");
	}

}
