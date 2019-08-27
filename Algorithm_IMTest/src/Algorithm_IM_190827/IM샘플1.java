package Algorithm_IM_190827;

import java.util.Scanner;

public class IM샘플1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			//각 테스트케이스의 첫 줄은 N이 주어짐.
			int N = sc.nextInt();

			char[][] map = new char[N][N];
			for(int i = 0; i < N; i++)
			{
				map[i] = sc.next().toCharArray();
			}

			//전체 맵에서 기지국인 아이가 있는 위치의 행,열 값들을 모두 출력해보세요.
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
//					if(map[i][j] == 'A')
//						System.out.println("A = " + i + "," + j);
//					if(map[i][j] == 'H')
//						System.out.println("H = " + i + "," + j);
//					if(map[i][j] == 'X')
//						System.out.println("X = " + i + "," + j);
					
					if(map[i][j] != 'X' && map[i][j] != 'H')
//						System.out.println(i + " " + j + " " + (map[i][j]-'A' + 1));
						
						//만약 A라면,,
					//map[i-1][j], map[i][j-1], map[i+1][j], map[i][j+1]
					//네 칸 중에 집이 있는지 보아야 함.
						
						//만약 B라면,,
					//map[i-1][j], map[i][j-1], map[i+1][j], map[i][j+1]
					//map[i-2][j], map[i][j-2], map[i+2][j], map[i][j+2]
						
						//만약 C라면,,
					//map[i-1][j], map[i][j-1], map[i+1][j], map[i][j+1]
					//map[i-2][j], map[i][j-2], map[i+2][j], map[i][j+2]
					//map[i-3][j], map[i][j-3], map[i+3][j], map[i][j+3]
						
						for(int k = 1; k < map[i][j]-'A'+1; k++)
						{
							//map[i-1][j] 가 집이냐?  부숴!
							if(i-k < N && map[i-1][j] == 'H')
								map[i-1][j] = 'X';
							//map[i+1][j] 가 집이냐?  부숴!
							if(i+k > -1 && map[i+1][j] == 'H')
								map[i+1][j] = 'X';
							//map[i][j-1] 가 집이냐?  부숴!
							if(j-k > -1 && map[i][j-1] == 'H')
								map[i][j-1] = 'X';
							//map[i][j+1] 가 집이냐?  부숴!
							if(j+k < N && map[i][j+1] == 'H')
								map[i][j+1] = 'X';
						}
				}
			}
			
			int cnt = 0;
			//마지막으로, 다시 지도를 돌면서, 남은 집의 개수를 셉니다.
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					if(map[i][j] != 'X' && map[i][j] != 'H')
						cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}

}


/* 문제 풀이 순서
 * 1. 지문을 천천히 잘 읽어요. 제약사항과 예제도 충분히 읽어야 해요
 * 2. 입력, 출력에 대한 설명을 잘 읽고, 주어진 예제를 잘 분석해 보세요.
 * 3. 
*/