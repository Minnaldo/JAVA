package jsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main16918 {
	static final int dx[] = {0,-1,1,0};
	static final int dy[] = {-1,0,0,1};
	
	static char[][] map, setmap, nextmap;
	static int N, M, T;
	static Queue<pair> q;
	static class pair{
		int x;
		int y;
		public pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		nextmap = new char[N][M];
		setmap = new char[N][M];
		q = new LinkedList<pair>();
		for(int i=0;i<N;i++)
		{
			String tmp = br.readLine();
			for(int j=0;j<M;j++)
			{
				map[i][j] = tmp.charAt(j);
				nextmap[i][j] = 'O';
				setmap[i][j] = 'O';
				if(map[i][j] == 'O') q.add(new pair(j, i));
				
			}
			
		}
		if(T == 1) {
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					System.out.print(map[i][j]);
				}System.out.println();
			}
		}
			
		else if(T % 2 == 0)
		{
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					System.out.print(setmap[i][j]);
				}System.out.println();
			}
		}
		else {
			for(int tcnt=0;tcnt<T/2;tcnt++)
			{
				q=new LinkedList<>();
				for(int i=0;i<N;i++)
				{
					for(int j=0;j<M;j++)
					{
						if(map[i][j] == 'O')
						{
							q.add(new pair(j,i));							
						}
						map[i][j] = 'O';
					}
				}
				while(!q.isEmpty())
				{
					pair p = q.poll();
					int x = p.x;
					int y = p.y;			
					map[y][x]='.';
					for(int i=0;i<4;i++)
					{
						if(is_map(x+dx[i] , y+dy[i]))
						{
							map[y+dy[i]][x+dx[i]]='.';
						}
					}
				}
			}
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					System.out.print(map[i][j]);
				}System.out.println();
			}
	
			
		}
			
		
	}
	static boolean is_map(int x, int y)
	{
		if(x < 0 || y<0 || x>=M || y>=N) return false;
		return true;
	}
	
	
}
