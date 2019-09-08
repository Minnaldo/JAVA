package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 인접행렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N+1][N+1];
			
			for(int i = 0; i < M; i++)
			{
				int num1 = sc.nextInt();	//출발정점
				int num2 = sc.nextInt();	//도착정점
				
				arr[num1][num2] = 1;
				arr[num2][num1] = 1;
			}
			
			boolean[] visited = new boolean[N+1];
			Queue<Integer> queue = new LinkedList<>();

			//처음 방문할 상태노드를 큐에 넣고 방문 췤!
			queue.add(1);
			visited[1] = true;
			//큐 가 빌 때 까 지
			while( !queue.isEmpty() )
			{
				//큐에서 꺼내서 처리
				int node = queue.poll();
				System.out.print(node + " ");
				//현재 노드에서 전이 될 수 있는 상태노드들을 큐에 추가
				for(int i = 0; i < N+1; i++)
				{
					//node번에서 i번으로 경로가 존재하고, i번을 아직 방문하지 않았다면
					if( arr[node][i] == 1 && !visited[i] )
					{
						//방문 체크하고 큐에 삽입
						visited[i] = true;
						queue.add(i);
					}
				}
			}
			
		}
	}

}
