import java.util.Scanner;

public class 유니온파인드 {

	static final String src = 
			"7 8\n" + 
			"1 2\n" + 
			"1 3\n" + 
			"2 4\n" + 
			"2 5\n" + 
			"4 6\n" + 
			"5 6\n" + 
			"6 7\n" + 
			"3 7\n";
	
	static int[] parents;
	static int[] rank;		//뎁쓰를 저장.  (트리의 높이를 저장할 배열.)
	
	public static void main(String[] args) {
		/* 상호 배타 집합... 교집합이 없는 집합.
		 * 집합을 구분하기 위해서 집합을 구분하기 위한 식별자가 필요
		 * 
		 * makeSet : 해당 원소를 집합의 식별자로 하는 새로운 집합을 생성.
		 * findSet : 해당 원소가 속한 집합의 대표자를 찾는 연산.
		 *      (3반이 강우네반이라고 했을때, 준호 누구네 반이야? -> 강우네반이야) : 대표자를 찾는 연산
		 * union : 두 원소가 속한 집합을 하나로 합치는 연산
		 */
		
		/*	makeSet : 자기 자신을 부모로 설정
		 * 	find : 자기 자신이 부모인 노드가 나올때까지 부모를 재귀 호출.
		 * 	union : 두 대표자 간에 한쪾을 부모로 설정.
		 * 
		 */
		
		Scanner sc = new Scanner(src);
		
		int V = sc.nextInt();	//노드의 갯수
		int E = sc.nextInt();	//두 원소가 같은 집합임을 표편하는 입력의 갯수
		parents = new int[V+1];
		rank = new int[V+1];
		
		
		//makeSet : 자기 자신을 부모로 설정
		//makeSet : 해당 원소를 집합의 식별자로 하는 새로운 집합을 생성.
		//makeSet연산을 수행 하시오.
		for(int i = 1; i <= V; i++) {
			parents[i] = i;
		}
		
		//M개의 연산에 대해서  유니온 하고,
		for(int i = 0; i < E; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			union(x, y);
		}
		
		//모두 유니온 한 후에 집합의 갯수를 출력하시오ㅋ
		int cnt = 0;
		for(int i = 1; i <= V; i++) {
			if ( parents[i] == i )
				cnt++;
		}
		
		System.out.println(cnt);
	}
	
	
	//find : 자기 자신이 부모인 노드가 나올때까지 부모를 재귀 호출.
	//findSet : 해당 원소가 속한 집합의 대표자를 찾는 연산.
	//(3반이 강우네반이라고 했을때, 준호 누구네 반이야? -> 강우네반이야) : 대표자를 찾는 연산
	//x원소의 대표자를 찾아서 리턴. (부모를 계속해서 찾아나감. -> 그러다가 결국 대표자를 찾음!!!)
	static int findSet(int x) {
		//자신의 부모가 자신이면 루트노드이므로, 대표자. 그러니까 자신을 리턴.
		if(parents[x] == x) {
			return x;
		}
		
		//아니라면, 계속해서 부모를 찾아나감.
		return parents[x] = findSet(parents[x]);
				
		//이거랑 위에 적은 방식이랑 무슨 차이지?  위에 if문 돌 때, 덜 걸린다는건가?
		//return findSet(parents[x]);
		
	}
	
	//union : 두 대표자 간에 한쪽을 부모로 설정.
	//union : 두 원소가 속한 집합을 하나로 합치는 연산
	static void union(int x, int y) {
		x = findSet(x);
		y = findSet(y);
		
		if( rank[x] > rank[y]) {
			parents[y] = x;
		}
		else {
			parents[x] = y;
			if( rank[x] == rank[y] ) {
				rank[y]++;
			}
		}
		
		
		
//		int nx = findSet(x);
//		int ny = findSet(y);
//		
//		parents[nx] = ny;
	}

}
