package Algorithm_2WEEK;

//재귀함수 : 자기 자신을 호출하는 함수
public class 재귀함수_sum22 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		recur(n, 0);
	
		System.out.println("=====끝=====");
		
	}
	
	/*2번째 재귀함수_합 방법,, => sum을 들고 다닌다.*/
	
	static int sum = 0;		//호출스택공간보다 하나 밖 영역에 변수를 만들어두고
	static void recur(int n, int sum)
	{
		if(n == 0) {		//일반적인 재귀함수는 기저영역 이라고 해서
			System.out.println("sum = " + sum);
			return;		//특정 조건이 되면 함수를 종료시키는 조건문을 갖게됨.
		}
		
		System.out.println(n);		
								
		recur(n-1, sum + n);		
		//재귀적으로 자신을 호출할때는, 기저영역에서 검사되는 조건에
		//해당하는 값을 변화시키는게 일반적이겠죠.
		
	}
}
