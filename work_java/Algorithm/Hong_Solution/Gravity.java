
public class Gravity {
	public static void main(String[] args) {
		
		int N = 10;
		int[][] map = new int[10][10];
		//각 열에 쌓인 블록의 수.
		int[] input = {7,4,2,0,0,6,0,7,0,0};
		//보니까. 0번열은 7개가 쌓여있군요.
		//0번열에. 맨아래칸 부터 7개의 칸을 1로 바꿔줍시다.
		//맨 아래칸은 map[9][0]
		for(int j = 0; j < N; j++) {
			//이 반복은 j가  0부터 N-1까지 가는 반복
			for(int i = 0; i < input[j]; i++) {
				map[N-1 - i][j] = 1;
			}
		}
		//90도 돌려서 여기다가 넣어봐야지ㅎ
		int[][] r_map = new int[10][10];
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) {
				r_map[j][i] = map[N-1-i][j];
			}
		}
		//각 행을 순회하며
		for(int i = 0; i < map.length; i++) {
			//각 열을 순회하며
			for(int j = 0; j < map[i].length; j++)
				System.out.print(map[i][j]);
			System.out.println();
		}
		System.out.println("==========90도 회전 후");
		for(int i = 0; i < r_map.length; i++) {
			//각 열을 순회하며
			for(int j = 0; j < r_map[i].length; j++)
				System.out.print(r_map[i][j]);
			System.out.println();
		}
		int max = 0;
		for(int j = 0; j < N; j++) {
			for(int i = N-1; i >= 0; i--) {
				if( r_map[i][j] == 1 ) {
//					System.out.println(i + "번째 행에 1이 있어요 (0열)");
					//출력대신에, 내 자리가 맨 아래줄이 아니고, 내 아랫줄이 1이 아니라면 
					//'반복' 해서 아래로 내리고 카운트++
					int cur_row = i;
					//내가 마지막줄이 아니고 내 아랫줄이 1이 아닌 조건
					int cnt = 0;
					while( cur_row != N-1 && r_map[cur_row+1][j] != 1 ) {
//						System.out.println("난 마지막도 아니고 밑에 1이 있지도 않아요 : " + cur_row);
						r_map[cur_row][j]--;
						r_map[cur_row+1][j]++;
						cnt++;
						cur_row++;
					}
					max =  Math.max(max, cnt);
				}
			}
		}
		System.out.println("가장 큰 낙차는 " + max + " 입니다.");
		System.out.println("============아래로 밀착 후");
		for(int i = 0; i < r_map.length; i++) {
			//각 열을 순회하며
			for(int j = 0; j < r_map[i].length; j++)
				System.out.print(r_map[i][j]);
			System.out.println();
		}
		
		
		
		
		
	}
}





