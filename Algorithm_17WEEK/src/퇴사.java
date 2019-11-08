import java.util.Scanner;

public class 퇴사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] counseling = new int[N][2];
		int[] pay = new int[N];
		for (int i = 0; i < N; i++) {
			counseling[i][0] = i+1;//상담 시작일
			counseling[i][1] = counseling[i][0] + sc.nextInt();//시작일 + 상담 소요일
		}
	}
}