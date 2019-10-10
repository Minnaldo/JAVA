import java.util.Scanner;

public class 섬의개수_제출 {

	static int[][] arr = new int[52][52]; //바깥쪽을 바다로 만들기 위해서 배열 크기를 2칸 더 늘려줌.
	static int[] chk = new int[10000];
	static int Count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int score = 0, cnt = 0, total_count = 0;


		while(true) {
			int width = sc.nextInt();
			int height = sc.nextInt();

			if(width == 0 && height == 0)
				break;

			else {
				//0 으로 초기화 된 배열에 입력값을 넣어줌.
				for(int i = 1; i <= height; i++) {
					for(int j = 1; j <= width; j++) {
						arr[i][j] = sc.nextInt();
					}
				}

				for(int i = 1; i <= height; i++) {
					for(int j = 1; j <= width; j++) {
						if(arr[i][j] == 1) {
							score = search(i, j);
							chk[cnt] = score;
							cnt++;
							total_count++;
							Count = 0;
						}
					}
				}


				System.out.println(total_count);

				total_count = 0;
			}
		}
	}
	static int search(int i, int j) {
		if (arr[i][j] == 1)
			Count++;

		arr[i][j] = 0;

		if(arr[i][j+1] == 1) search(i, j+1);	//우
		if(arr[i+1][j+1]==1) search(i+1,j+1);	//우하
		if(arr[i-1][j+1]==1) search(i-1,j+1);	//좌하
		if(arr[i+1][j] == 1) search(i+1, j);	//하
		if(arr[i][j-1] == 1) search(i, j-1);	//좌
		if(arr[i+1][j-1]==1) search(i+1,j-1);	//우상
		if(arr[i-1][j-1]==1) search(i-1,j-1);	//좌상
		if(arr[i-1][j] == 1) search(i-1, j);	//상

		return Count;
	}

}
