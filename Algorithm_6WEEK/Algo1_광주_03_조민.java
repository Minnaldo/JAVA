import java.util.Scanner;

public class Algo1_광주_03_조민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int C = sc.nextInt();
			int R = sc.nextInt();
			
			String[][] arr = new String[C][R];
			
			
			
			int k = 0;
			
			for(int i = 0; i < C; i++)
			{
				for(int j = 0; j < R; j++)
				{
					arr[i][j] = sc.next();

				}
			}
			
			//상(0,1) 하(0,-1) 좌(-1,0) 우(1,0)
			int cnt = 0;
			for(int i = 0; i < C; i++)
			{
				for(int j = 0; j < R; j++)
				{
//					char[] c = arr[i][j].toCharArray();
//					char[][] c = arr[i][j].toCharArray();
					
					//'G'이면 
					if(arr[i][j].equals('G')
					{
						//'0'이면 계속 진행
						
						//'W'이면 break;
						
						//'T'이면 cnt++;
					}
					

					k++;
				}
			}
			
		}
	}

}



/*
2
5 7
T 0 T 0 G 0 G
0 W T W W W 0
T W G 0 T W T
0 0 0 T G W 0
0 0 T 0 0 W 0
2 10
T W 0 G 0 W 0 G 0 W
G 0 T W T 0 T W T 0
*/