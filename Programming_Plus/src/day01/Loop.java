package day01;

public class Loop {

	public static void main(String[] args) {
		
		boolean flag = true;
		int cnt = 0;
		while (flag) 
		{
			cnt += 1;
			System.out.println("cnt : "+ cnt);
			if(cnt >= 10)
				flag = false;
		}
		
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("i : " + i);
		}
	}
}
