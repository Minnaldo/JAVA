package day01;

//조건문은 if(), switch() 뿐이다.
public class Condition {
	public static void main(String[] args) {

		int a = 3;
		char c = 'a';		//문자 'a'는 숫자지만
		String str = "b";	//문자열 "a"는 숫자가 아니다. 
		
		switch (str) {
		case "a":
			System.out.println(1);
			break;
		case "b":
			System.out.println(2);
			break;
		case "c":
			System.out.println(3);
			break;
		default:
			System.out.println("default");
		}

		System.out.println("종료");
	}
}
