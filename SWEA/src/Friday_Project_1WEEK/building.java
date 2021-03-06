package Friday_Project_1WEEK;

import java.util.Scanner;

public class building {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);			
		int TC = sc.nextInt();
		
		for(int i = 0; i < TC; i++)
		{
			int input_num = sc.nextInt();
			char[][] input = new char[input_num + 1][input_num + 1];
			int[][] chk = new int[input_num][input_num];
			
			//부지 생성 input
			for(int j = 0; j < input_num; j++)
			{
				for(int k = 0; k < input_num; k++)
				{
					input[j][k] = sc.next().charAt(0);
				}
			}
			
			//최대 높이 변수 지정
			int max = 0;
			
			for (int j = 0; j < input_num; j++)
			{
				for(int k = 0; k < input_num; k++)
				{
//					현재위치가 건축을 자유롭게 한다고 가정하고, 만약 공원이 발견되면 false로 변경			
					if ( input[j][k] == 'B')	//B위치 찾기
					{
						boolean canBuild = true;
						if (j - 1 >= 0 && k - 1 >= 0 && input[j-1][k-1] == 'G')
							canBuild = false;
						if (j - 1 >= 0 && k >= 0 && input[j-1][k] == 'G')
							canBuild = false;
						if (j - 1 >= 0 && k + 1 < input_num && input[j-1][k+1] == 'G')
							canBuild = false;
						if (j >= 0 && k - 1 >= 0 && input[j][k-1] == 'G')
							canBuild = false;
						if (j >= 0 && k + 1 < input_num && input[j][k+1] == 'G')
							canBuild = false;
						if (j + 1 >= 0 && k - 1 >= 0 && input[j+1][k-1] == 'G')
							canBuild = false;
						if (j + 1 >= 0 && k >= 0 && input[j+1][k] == 'G')
							canBuild = false;
						if (j + 1 >= 0 && k + 1 < input_num && input[j+1][k+1] == 'G')
							canBuild = false;
						
						int height = 2;	// 초기값을 2로 지정하고
						if(canBuild)
						{
							int count = 1;
							//현재 위치로부터 4방으로 끝까지 검사해가며 빌딩의 수 체크.
							for(int m = j - 1; m >= 0; m--)
							{
								if( input[m][k] == 'B')
									count++;
							}	//내 위치도 카운트 해야하고, 내 위치는 한번만 세어야 하기 때문에
							// count를 1부터 시작하고 십자탐색은 내 다음위치부터 시작
							for(int m = j + 1; m < input_num; m++)
							{
								if ( input[m][k] == 'B')
									count++;
							}
							for(int m = k - 1; m >= 0; m--)
							{
								if( input[j][m] == 'B')
									count++;
							}
							for(int m = k + 1; m < input_num; m++)
							{
								if( input[j][m] == 'B')
									count++;								
							}
							height = count;
						}
						if(max < height)
							max = height;
					}
				}
			}
			System.out.println("#" + (i+1) + " " + max);
		}
		System.out.println();
	}

}
