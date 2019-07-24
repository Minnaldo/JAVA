package Algorithm_1WEEK_D1;

import java.util.Scanner;

public class Gravity_190718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int N = 10;
		int[][] map = new int[10][10];
		
		//각 열에 쌓인 블록의 수
		int[] input = {7, 4, 2, 0, 0, 6, 0, 7, 0 , 0};
		
		//보니까 0번열은 7개가 쌓여있음.
			
		//input에 들어있는 수만큼  블록을 쌓음.
		for (int i = 0; i < input.length; i++)
		{
			for (int j = 0; j < input[i]; j++) {
				map[N - 1 - j][i] = 1;
			}
		}
				
		//90도 돌려서 여기다가 넣어보자
		int[][] r_map = new int[10][10];
				
		//N-1-i, 0 => 0,i로
		for(int j = 0; j < N; j++)
		{
			for(int i = 0; i < N; i++)
			{
				r_map[j][i] = map[N-1-i][j];
			}
		}
				
		//각 행을 순회하며
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map.length; j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
				
		System.out.println("90도 회전 후 =====");
		//90도 회전 후
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map.length; j++)
			{
//				int input = sc.nextInt();
				System.out.print(r_map[i][j]);
			}
			System.out.println();
		}
				
		int max = 0;
		//맨아래부터 검사시작.
		//본인이 1인가?   아니면 위에놈 검사하러!
		/*1이야? ㅇㅇ
		 * 아래가 0인지?
		 * 0이면 아래와 변경
		 * 아래가 1이거나
		 * 내가 N-1번째라면 끝.
		 * 그동안 변경한 횟수를 셈.
		 */
		for(int j = 0; j < N; j++)
		{
			for(int i = N - 1; i >= 0; i--)
			{
				if (r_map[i][j] == 1)
				{
//					System.out.println(i + "번째 행에 1이 있어요(0열)");
					//출력 대신에, 내 자리가 맨 아래줄이 아니고, 내 아랫줄이 1이 아니라면
					//"반복"해서 아래로 내리고 카운트++
					int cur_row = i;
										
					//내가 마지막 줄이 아니고 내 아랫줄이 1이 아닌 조건
					int cnt = 0;
					while(cur_row != N-1 && r_map[cur_row+1][j] != 1)
					{
//						System.out.println("넌 마지막도 아니고 밑에 1이 있지도 않아요 : " + cur_row + "내려야하는 줄");
						r_map[cur_row][j]--;		//현재 내 자리를 1로 만들고
						r_map[cur_row+1][j]++;		//내 아랫칸의 자리를 1로 만듦.
						cnt++;
						cur_row++;					//현재 위치도 하나 아래로 이동
					}
//					System.out.println(cnt);
					max = Math.max(max,  cnt);		//
				}
			}
		}
				
		System.out.println("가장 큰 낙차는 " + max + " 입니다.");		
		/*내가 N-1행이면 종료
		 * 아래가 1이면 종료
		 * 둘 다 아니면
		 * 아래가 0이므로
		 * 나 = 0, 아래 = 1(나를 내리고) 카운트 + 1
		 */
		System.out.println("=======아래로 밀착 후");
		for(int i = 0; i < r_map.length; i++)
		{
			//각 열을 순회하며
			for(int j = 0; j < r_map[i].length; j++)
				System.out.print(r_map[i][j]);
			System.out.println();
		}		
	}
}
