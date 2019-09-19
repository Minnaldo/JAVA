package 연습해보기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
각 정점에 해당하는 상호배타 집합
간선을 경로비용 순으로 오름차순 정렬, 첫번째 간선부터 반복해서 검사
(두 정점이 같은 집합인지, 아니라면 간선 선택 후 유니온. 같은 집합이면 다음간선)
최종적으로 N-1개의 간선이 선택되면 종료
*/

public class Kruskal_Practice {

	static int[] parents;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner("7 11\n" +
				"0 1 31\r\n" + 
				"0 2 31\r\n" + 
				"0 6 31\r\n" + 
				"0 5 60\r\n" +
				"1 2 21\r\n" + 
				"2 4 46\r\n" + 
				"2 6 25\r\n" + 
				"3 4 34\r\n" + 
				"4 6 51\r\n" + 
				"5 3 18\r\n" + 
				"5 4 40\r\n" ); 
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		parents = new int[N+1];
		int[][] record = new int[M][3];
		for(int i =1; i < parents.length; i++)
			parents[i] = i;
		
		for(int i = 0; i < M; i++) {
			record[i][0] = sc.nextInt();
			record[i][1] = sc.nextInt();
			record[i][2] = sc.nextInt();
		}
		
		Arrays.sort(record, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1[2], o2[2]);
			}
		});
		
		
		int result = 0;
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			if(cnt == N-1)
				break;
			
			if(findSet(record[i][0]) != findSet(record[i][1])) {
				unionSet(record[i][0], record[i][1]);
				result += record[i][2];
				cnt++;
			}
		}
		
		System.out.println(result);
	}

	
	static int findSet(int x) {
		if(parents[x] == x)
			return x;
		
		parents[x] = findSet(parents[x]);
		return parents[x];
	}
	
	static void unionSet(int x, int y) {
		int nx = findSet(x);
		int ny = findSet(y);
		
		parents[nx] = ny;
	}
}
