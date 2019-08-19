//SWEA_D4_1210. 2일차 - Ladder1

package SWEA_D4;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D4_1210 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++)
		{
			sc.nextInt();
			
			//100x100 배열을 준비해서 각 사다리 모양을 입력받자.
			int[][] map = new int[100][100];
			for(int i = 0; i < 100; i++)
			{
				for(int j = 0; j < 100; j++)
				{
					map[i][j] = sc.nextInt();
				}
			}
			
			
			int[] lanes = new int[100]; //몇개인지 모르니까 최대 100개로..
			int idx = 0;
			int col_idx = 0;	//여기다가 현재 내가 탐색하는 열의 위치를 저장할거야!
			//사다리 맵의 맨 마지막 줄을 첫칸부터 마지막칸까지 탐색하면서, 
			//1이나 2가 있는 위치를 찾자.
			for(int i = 0; i < 100; i++)
			{
				if( map[99][i] == 1)		//100칸 
				{
					//lanes배열에 담을 건데, 처음엔 0 그담엔 1 그담엔 2 그담엔 3 그담엔 4 ....
					//한 개 담을때마다 0 -> 1 -> 2 -> 3... 하고 늘어나야됨!!
					lanes[idx] = i;
					idx++;
					
				}
				else if( map[99][i] == 2)
				{
//					System.out.println(i);
					col_idx = idx;
					lanes[idx] = i;
					idx++;
				}
			}
			
			int row = 99;		//맨 아랫줄을 현재 행의 위치로.
//			System.out.println(Arrays.toString(lanes));
			//맨 윗줄에 닿을때까지 
			while (row > 0)
			{
				if( col_idx > 0 && map[row][lanes[col_idx]-1] == 1)
				{
					col_idx--;
				}
				
				if( col_idx < idx - 1 && map[row][lanes[col_idx]+1] == 1) {
					col_idx++;
				}
					row--;
			}
			
			
			System.out.println("#" + tc + " " + lanes[col_idx] );
		}
		
	}
}
