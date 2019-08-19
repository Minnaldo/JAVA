package day01;

public class ArrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20, c = 40;
		
		int[] Array = new int[3];
		Array[0] = 7;
		Array[1] = 8;
		Array[2] = 9;
		
		int[] Array2 = {10, 20, 40};
		
		for(int i = 0; i < Array2.length; i++)
		{
			//continue는 자기 아래 {} 하나를 안 본다.
			if(i == 0)
				continue;
			
			
			//시험!!!! (break)에 대해 나올거 같다.
			//break는 그 반복문을 빠져나간다.
			//시험!!!!  switch ~ case
			switch(i)
			{
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			default:
				break;
			}
			System.out.println(Array2[i]);
		}
		
		
		System.out.println("++++++");
					
		
		for(int i = 0; i < Array.length; i++)
		{
			
			System.out.println(Array[i]);
			if(i == 1)
			{
				break;
			}
		}
	}
}
