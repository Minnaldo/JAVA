package 순열;


public class HONG_거듭제곱 {
	public static void main(String[] args) {
//		System.out.println(pow(2, 4));
		pow(1, 2140000000);
//		pow2(1, 20000);
		System.out.println(cnt1);
		System.out.println(cnt2);
	}
	
	static int cnt1 = 0;
	static int cnt2 = 0;

	static int pow2(int a, int b) {
		cnt2++;
		if( b == 1 )
			return a;
		if( b == 0 )
			return 1;
		return a * pow2(a,b-1);
	}
	
	static int pow(int a, int b) {
		cnt1++;
		if( b == 1)
			return a;
		if( b == 0)
			return 1;
		int tmp = pow(a, b/2);//a의 b/2승
		//b가 홀수라면
		if( b % 2 == 1 ) {
			return tmp * tmp * a;
		}
		else
			return tmp * tmp;
	}
}
