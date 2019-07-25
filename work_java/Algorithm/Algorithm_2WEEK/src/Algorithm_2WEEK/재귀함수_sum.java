package Algorithm_2WEEK;

//재귀함수 : 자기 자신을 호출하는 함수
public class 재귀함수_sum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		recur(n);
	
		System.out.println("=====끝=====");
		
	}
	
	
	
	static int sum = 0;		//호출스택공간보다 하나 밖 영역에 변수를 만들어두고
	static void recur(int n)
	{
		if(n == 0) {		//일반적인 재귀함수는 기저영역 이라고 해서
			System.out.println(sum);
			return;		//특정 조건이 되면 함수를 종료시키는 조건문을 갖게됨.
		}
		
		sum += n;
		System.out.println(n);	//각각 3,2,1이 지나가긴 하지만	
								//각각은 자신의 호출 스택공간에 들어있음.
		recur(n-1);		
		//재귀적으로 자신을 호출할때는, 기저영역에서 검사되는 조건에
		//해당하는 값을 변화시키는게 일반적이겠죠.
		
	}
}
