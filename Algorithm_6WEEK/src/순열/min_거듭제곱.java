package 순열;

public class min_거듭제곱 {
	public static void main(String[] args) {
		System.out.println(pow(2, 4));
	}

	static int pow(int a, int b)
	{
		if (b == 1)
			return a;
		if (b == 0)
			return 1;
		
		//b가 홀수라면
		int temp = pow(a, b/2);	//a의 b/2승
		if(b % 2 == 1)
			return temp * temp * a;
		else
			return temp * temp;
	}

}
