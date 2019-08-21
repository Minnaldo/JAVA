package 순열;

import java.util.Scanner;

public class DDU_연구소1 {

	static int N;
	static int M;
	static int[][] arr;
	static Scanner sc = new Scanner(System.in);
	static int[][] temp;
	final static int[] dx= {-1,1,0,0};
	final static int[] dy= {0,0,-1,1};
	static int resul=0;


	static void copyArr() {
		for (int i = 0; i < arr.length; i++) {
			temp[i]=arr[i].clone();
		}
	}

	static void spread() {
		copyArr();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(temp[i][j]==2) {
					DFS(i,j);
				}
			}
		}

		int cnt=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(temp[i][j]==0) {
					cnt++;
				}
			}
		}
		resul=Math.max(resul,cnt);
	}
	static void DFS(int x,int y) {
		temp[x][y]=2;

		for (int i = 0; i < 4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0&&nx<N&&ny>=0&&ny<M&&temp[nx][ny]==0) {
				DFS(nx,ny);
			}
		}
	}
	static void setWall(int x,int y,int cnt) {
		if(cnt==3) {
			spread();
			return;
		}

		//?ш? ?ㅼ뼱媛???i,j ????섍린 ?뚮Ц???댁감??以묐났 ????		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==0) {
					arr[i][j]=1;
					setWall(i,j,cnt+1);
					arr[i][j]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new int[N][M];
		temp=new int[N][M];
		for (int i = 0; i <N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		//踰쎌꽭?곌린
		//1濡??명똿?섍퀬 ?ㅼ떆 0?쇰줈 蹂듦?
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(arr[i][j]==0) {
					arr[i][j]=1;
					setWall(i,j,1);
					arr[i][j]=0;
				}
			}
		}
		System.out.println(resul);

	}
}
