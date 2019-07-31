package Algorithm_3WEEK;

public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World 0_0, Welcome to hell 8_8";

		// 문자의 배열로 변환
		char[] ch_arr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);

			if (Character.isDigit(c))
				System.out.println(c + " 는 숫자입니다. ");
		}

//			//한 글자씩 char형으로 가져오는것.
//			char c = str.charAt(i);	

	}

}
