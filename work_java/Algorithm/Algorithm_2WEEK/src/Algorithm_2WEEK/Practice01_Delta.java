package Algorithm_2WEEK;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Practice01_Delta {

//	static int[][] delta =  {{0}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	//상, 좌, 하, 우
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, -1, 0, 1};
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		int sum = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				//랜덤하게 5x5배열에 초기화.
				arr[i][j] = (int)(Math.random() * 45) + 1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				//상하좌우의 값이 배열의 범위안에 있다면 해당 값과 나와의 절대값 계산.
				for(int k = 0; k < 4; k++)
				{
					int nr = i + dr[k];
					int nc = j + dr[k];
					
					//5x5 안에 값이 들어있다면
					if(nr >= 0 && nr < 5 && nc >= 0 && nc < 5)
					{
						//해당 값과 나와의 절대값을 계산.
						int dif = Math.abs(arr[i][j] - arr[nr][nc]);

						sum += dif;
					}
					
				}
				System.out.print(sum + " ");
			}
		}
		System.out.println();
	}

}
