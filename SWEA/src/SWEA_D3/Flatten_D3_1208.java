package SWEA_D3;

import java.util.Scanner;

public class Flatten_D3_1208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0;
			int num = sc.nextInt();
			char[][] arr = new char[8][8];
			for(int i = 0; i < 8; i++)
			{
				arr[i] = sc.next().toCharArray();
			}
			
			for(int i = 0; i < 8; i++)	{
				for(int j = 0; j < 8; j++) {
					//가로 보기
					int left = j;
					int right = j + num - 1;
					if( right < 8 ) {
						boolean chk = false;
						// right가 left보다 작아지면 => stop
						while(left <= right) {
							if (arr[i][left] != arr[i][right]) {
								//다르면 실패
								chk = true;
								break;
							}
							left++;
							right--;
						}
						if(chk == false) {
							cnt++;
						}
					}
					
					//세로 보기
					int up = i;
					int down = i + num - 1;
					if ( down < 8 ) {
						boolean chk = false;
						while( up <= down ) {
							if (arr[up][j] != arr[down][j]) {
								//다르면 실패
								chk = true;
								break;
							}
							up++;
							down--;
						}
						if(chk == false) {
							cnt++;
						}
					}
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
			
		}
	}

}
