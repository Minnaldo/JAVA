package day06;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//* "Hello" + 'a'  /  append랑 비교하면
//		// 500배 이상 빠르다.
//		String str = "Hello" +'a';
//		StringBuilder sb = new StringBuilder(str);
//		sb.append("a");
//		System.out.println(sb.toString());
		

		StringBuilder sbsb = new StringBuilder();
		String strstr = "";
		
		double start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
		{
			strstr += "s";
			strstr += "t";
			strstr += "r";
			strstr += "i";
			strstr += "n";
			strstr += "g";
		}
		double end = System.currentTimeMillis();
		System.out.println("String : " + (end+start));
		
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
		{
			sbsb.append("S");
			sbsb.append("T");
			sbsb.append("R");
			sbsb.append("I");
			sbsb.append("N");
			sbsb.append("G");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder : " + (end+start));
		
	}

}
