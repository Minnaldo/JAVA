package day03;

public class MyDataNotFoundException extends Exception {
	public MyDataNotFoundException()
	{
		super("MyDataNotFoundException");
	}
	public void print()
	{
		System.out.println("찾는 데이터가 없어요!");
	}
}
