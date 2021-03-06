package Friday_Project_1WEEK;

import java.util.Scanner;

public class Building_Delta {
	
	static int[] dr = {-1, -1, -1, 0, 0,  1, 1, 1};
	static int[] dc = {-1, 0,   1,-1, 1, -1, 0, 1};
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc < T; tc++) {
			int num = sc.nextInt();
			char[][] bayeol = new char[num][num];
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					bayeol[i][j] = sc.next().charAt(0);
					// System.out.println(Arrays.toString.bayeol[i][j]); //투 스트링을 기입해야 출력 가능
				}
			}
			int max = 0; // 최대 높이 변수 지정
			// 강사님답
			for (int i = 0; i < bayeol.length; i++) {
				for (int j = 0; j < bayeol[i].length; j++) {
					// System.out.print(bayeol[i][j]); //출력해보기
					// or 공원 발견되면 바로 false 변경 ㅇㅈ?
					if (bayeol[i][j] == 'B') { // B위치 찾기
						boolean canBuild = true;// 현재위치가 건축올려도 되는지
						
						for(int k = 0; k < 8; k++)
						{
							//각 반복은 8방 중 한가지 방향에 대한 새로운 위치 nr, nc
							int nr = i + dr[k];		
							int nc = j + dc[k];
								
							//현재 검사하는 nr, nc가
							//배열을 벗어나지 않으면서 G인지 검사!
							if (nr >= 0 && nr < num && nc >= 0 && nc < num && bayeol[nr][nc] == 'G')
							{
								canBuild = false;
							}
							
							
							
						}
						
						/*
						if (i-1 >= 0 && j - 1 >= 0 && bayeol[i-1][j-1] == 'G')
							canBuild = false;
						if (i-1 >= 0 && j >= 0 && bayeol[i-1][j] == 'G')
							canBuild = false;
						if (i-1 >= 0 && j + 1 < num && bayeol[i-1][j+1] == 'G')
							canBuild = false;
						if (i >= 0 && j - 1 >= 0 && bayeol[i][j-1] == 'G')
							canBuild = false;
						if (i >= 0 && j + 1 < num && bayeol[i][j+1] == 'G')
							canBuild = false;
						if (i+1 >= 0 && j - 1 >= 0 && bayeol[i+1][j-1] == 'G')
							canBuild = false;
						if (i+1 >= 0 && j >= 0 && bayeol[i+1][j] == 'G')
							canBuild = false;
						if (i+1 >= 0 && j + 1 < num && bayeol[i+1][j+1] == 'G')
							canBuild = false;
			*/
						
						int height = 2; // default의 값은 2로 지정하고
						if (canBuild) {
							int count = 1;// 현재위치로 부터 4방으로 끝까지 검사해가며 빌딩의 수를 세기
							for (int m = i - 1; m >= 0; m--) {
								if (bayeol[m][j] == 'B')
									count++;
							} // 내위치도 세야하고 , 내위치는 한번만 세져야 하기 떄문에
								// count를 1부터 시작하고 십자탐색은 내 다음위치부터 시작
							for (int m = i + 1; m < num; m++) {
								if (bayeol[m][j] == 'B')
									count++;
							}
							for (int m = j - 1; m >= 0; m--) {
								if (bayeol[i][m] == 'B')
									count++;
							}
							for (int m = j + 1; m < num; m++) {
								if (bayeol[i][m] == 'B')
									count++;
							}
							height = count;
						}
						if (max < height)
							max = height;
					}
				}
				System.out.println("#" + max);
				// 내가쓴 문장
			}
		}
	}
//문제풀이 기지국 찾고 

}