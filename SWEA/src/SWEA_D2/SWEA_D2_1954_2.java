import java.util.Scanner;

public class Solution {
  
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
  
        for (int tc = 1; tc <= T; tc++) {
            int direction = 0;
            int arr_size = sc.nextInt();
            int[][] arr = new int[arr_size][arr_size];
            int i=0, j=0, num = arr_size+1;
              
            for(int count=1; count<= arr_size; count++) {
                arr[0][j] = count;
                j++;
            }
            j--;
            for(int circle_num = arr_size-1; circle_num > 0; circle_num--)
            {
                for(int count=1; count <= circle_num; count++)
                {
                    if(direction==0) i++;
                    else i--;
                    arr[i][j] = num;
                    num++;
                }
                for(int count=1; count <= circle_num; count++)
                {
                    if(direction==0) j--;
                    else j++;
                    arr[i][j] = num;
                    num++;
                }
                if(direction==0) direction = 1;
                else direction = 0;
            }
            System.out.println("#"+tc);
            for(int r= 0; r< arr_size; r++)
            {
                for(int c =0; c<arr_size; c++) 
                {
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();
            }   
        }
    }
}		// 오른쪽으로 4번
		// 아래쪽으로 3번
		// 왼왼쪽으로 3번
		// 위위쪽으로 2번
		// 오른쪽으로 2번

		Scanner sc = new Scanner(System.in);
		
		int N = 5;
		int[][] arr = new int[N][N];
		int r = 0, c = -1;
		int val = 1;
		while (val != 26) {
			for (int i = 0; i < N; i++) {
				c++;
				arr[r][c] = val++;
			}
			N--;
			for (int i = 0; i < N; i++) {
				r++;
				arr[r][c] = val++;
			}
			for (int i = 0; i < N; i++) {
				c--;
				arr[r][c] = val++;
			}
			N--;
			for (int i = 0; i < N; i++) {
				r--;
				arr[r][c] = val++;
			}
		}

		System.out.println("#" + tc);
		for (int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
//				System.out.print(arr[i][j]);
//				System.out.printf( );
			}
			System.out.println();
		}
//			System.out.println(Arrays.toString(arr[i]));
	}
}
