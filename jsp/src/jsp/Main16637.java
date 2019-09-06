package jsp;

import java.util.Scanner;

public class Main16637 {
	static int N, numCnt, plusCnt;
	static int []numMap;
	static char []plusMap;
	static boolean []is_visit;
	static int ans = Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numCnt = N/2+1;
		plusCnt = N/2;
		numMap = new int[numCnt];
		plusMap = new char[plusCnt];
		is_visit = new boolean[plusCnt];
		String tmp = sc.next();
		for(int i=0;i<N-1;i+=2)
		{
			numMap[i/2]=Integer.parseInt(tmp,i);
			plusMap[i/2] = tmp.charAt(i+1);			
		}
		numMap[N/2] = Integer.parseInt(tmp,N-1);
		
		int sss = (plusCnt+1)/2;
	}
	static void select_num(int now)
	{
		if(now == plusCnt) {
			for(int i=0;i<plusCnt;i++)
			{
				if(is_visit[i])
				{
					int tmp = calc(i);
					numMap[i]=tmp;
					numMap[i+1]=tmp;
					plusMap[i]='=';
				}
			}
			return;
		}
		for(int )
	}
	static int calc(int iter)
	{
		if(plusMap[iter] == '+') return numMap[iter]+numMap[iter+1];
		else if(plusMap[iter] == '-') return numMap[iter]-numMap[iter+1];
		else if(plusMap[iter] == '*')return numMap[iter]*numMap[iter+1];
		else{
			return numMap[iter];
		}
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
