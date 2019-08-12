//SWEA_D2_1961. 숫자 배열 회전
package SWEA_D2;

import java.text.NumberFormat;
import java.util.Scanner;

public class SWEA_D2_1961 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int[][] brr = new int[N][N];
			int[][] crr = new int[N][N];
			
			int[] a11 = new int[N];
			int[] b22 = new int[N];
			int[] c33 = new int[N];
			
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			
			int k=0 ;
			for(int i = 0; i < N; i++)
			{
				int p= (int) Math.pow(10, N-1);
//				System.out.println(p);
				for(int j = N-1; j >= 0; j--)
				{
					a11[k] += arr[j][i]*p;
					
					p /= 10;
//					System.out.print(arr[j][i] + " ");
					brr[i][j] = arr[j][i];
					
				}
				k++;
//				System.out.println();
			}
			
			k = 0;
			for(int i = N-1; i >= 0; i--)
			{
				int p= (int) Math.pow(10, N-1);
				for(int j = N-1; j >= 0; j--)
				{
					b22[k] += brr[j][i]*p;
					
					p /= 10;
//					System.out.print(brr[j][i] + " ");
					crr[i][j] = brr[j][i];
				}
				k++;
//				System.out.println();
			}
			
			k = 0; 
			for(int i = N-1; i >= 0; i--)
			{
				int p= (int) Math.pow(10, N-1);
				for(int j = 0; j < N; j++)
				{
					c33[k] += crr[j][i]*p;
					
					p /= 10;
//					System.out.print(crr[j][i] + " ");
					
				}
				k++;
//				System.out.println();
			}
			
			System.out.println("#" + tc);
			for(int i = 0; i < N; i++)
			{
//				System.out.println(a11[i] + " " + b22[i] + " " + c33[i]);
				//NumberFormat nf = NumberFormat.getInstance();
				//nf.setMinimumIntegerDigits(N);
				
				System.out.printf("%"+"0"+N+"d" + " " + "%" +"0"+N+"d" + " " + "%"+"0"+N+"d", a11[i], b22[i], c33[i]);
				System.out.println();
			}
			//아주 좋은 성과였습니다 :)
		}
		
	}

}
