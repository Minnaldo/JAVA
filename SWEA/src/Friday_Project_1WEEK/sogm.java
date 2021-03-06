package Friday_Project_1WEEK;

import java.util.Scanner;

public class sogm {
	static int[][] delta = { {0}, {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		//테스트케이스 수만큼 반복
		for(int i = 0; i < TC; i++)
		{
			int map_size = sc.nextInt();	//연못의 크기 (맵의 크기)
			int sogm_num = sc.nextInt();	//소금쟁이의 수
			int[][] map = new int[map_size][map_size];
			
//			int start_x = 0;
//			int start_y = 0;
			boolean isAlive = true;
			int cnt = 0;
			
			
			//소금쟁이 수만큼 (행,렬,방향) 입력 받음.
			for(int j = 0; j < sogm_num; j++)
			{
				int start_x = sc.nextInt();	//r
				int start_y = sc.nextInt();	//c
				int way = sc.nextInt();
				
				for(int k = 3; k > 0; k--)
				{
					//delta 사용!
					start_x += delta[way][0] * k;
					start_y += delta[way][1] * k;
										
					if (start_x < 0 || start_x >= map_size || start_y < 0 || start_y >= map_size)
					{
						isAlive = false;	//나갔는지 검사,, 나갔으면  continue;
									//이동한 위치에 소금쟁이가 있는지 검사, 있으면 continue; )
						break;
					}
					if( map[start_x][start_y] != 0)
					{	isAlive = false;
						break;
					}
				}
				
				if(isAlive)
				{
					cnt++;
					map[start_x][start_y] = 1;
				}				
				
			}
			System.out.println(cnt);
			
			
		}
	}

}
