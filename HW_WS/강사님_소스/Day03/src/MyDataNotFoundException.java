
public class MyDataNotFoundException extends Exception{
	public MyDataNotFoundException() {
		super("몰랑몰랑 흐흐");
	}
	public void print() {
		System.out.println("찾는 데이타가 없어요");
	}
}
