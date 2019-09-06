package jsp;

import java.util.Scanner;

public class jh17136 {

	static int[][] origin;
	static int[][] map;
	
	static final int N = 10;
	static int flag=0;
	static int total =0;
	static int ans=999;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		origin = new int[N][N];
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				origin[i][j]= sc.nextInt();
			}
		}
		
		boolean ff= true;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(origin[i][j]==1)
					ff=false;
			}
		}
		if(ff) {
			System.out.println("0");
			return;
		}
			
		for(int k=5; k>0; k--) {
			copy();
			total=0;
			flag=0;
			
			for(int i=k; i>0; i--) {
				search(i);
			}
			
			if(flag!=-1) {
				ans = Math.min(ans, total);
			}
		}
		
		

		if(ans==999)
			System.out.println("-1");
		else
			System.out.println(ans);
		
	}//end main

	static void copy() {
		for(int i=0; i<N;i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = origin[i][j];
			}
		}
	}
	
	static boolean check(int r, int c, int k) {
		for(int i=r; i<r+k; i++) {
			for(int j=c; j<c+k; j++) {
				if(map[i][j]!=1)
					return false;
			}
		}
		return true;
	}
	
	static void cover(int r, int c , int k) {
		for(int i=r; i<r+k; i++) {
			for(int j=c; j<c+k; j++) {
				//지워버령
				map[i][j] = k;
			}
		}
	}

	static void search(int N) {
		int papers =5;
		for(int i=0; i<=(10-N); i++) {
			for(int j=0; j<=(10-N); j++) {
				// 색종이가 있으면 5*5검사 
				if(map[i][j]==1) {
					if(check(i,j,N)) {
						if(papers==0) {
							flag=-1;
							return;
						}
						cover(i,j,N);
						total++;
						papers--;
						j+=(N-1);
					}
				}
				else if(N!=1 && map[i][j]==N)
					j+= (map[i][j]-1);
			}
		}
		
	}

	//출력함수 
	static void print() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++){
				System.out.print(origin[i][j]+" ");
			}System.out.println();
		}
	}
	
	static void print2() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++){
				System.out.print(map[i][j]+" ");
			}System.out.println();
		}
	}
}