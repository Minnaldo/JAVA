package Algorithm_2WEEK;

//재귀함수 : 자기 자신을 호출하는 함수
public class 재귀함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		recur(n);
		
		
//		while (n > 0 )		//반복문에서 언젠간 반복이 종료되기 위해
//		{					//반복되는 조건,,
//			System.out.println("n>0");
//			n--;
//		}
		
	}
	
	
	static void recur(int n)
	{
		if(n == 0)		//일반적인 재귀함수는 기저영역 이라고 해서
			return;		//특정 조건이 되면 함수를 종료시키는 조건문을 갖게됨.
		
		System.out.println(n);	
		recur(n-1);		//재귀적으로 자신을 호출할때는, 기저영역에서 검사되는 조건에
						//해당하는 값을 변화시키는게 일반적이겠죠.
		System.out.println(n);
	}

}
