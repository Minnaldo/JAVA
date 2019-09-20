package Baekjoon;

import java.util.Scanner;

public class N과M_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] source = new int[N];
		int[] select = new int[M];
		
		for (int i = 0; i < source.length; i++) {
			source[i] = i+1;
		}
		perm(source, 0, select, new boolean[N]);
	}
	static void perm(int[] source, int idx, int[] select, boolean[] visited) {
		if(idx == select.length) {
			for (int i = 0; i < select.length; i++) {
				System.out.print(select[i]+" ");
			}System.out.println();
			return;
		}
		
		for (int i = 0; i < source.length; i++) {
			if(!visited[i]) {
				select[idx] = source[i];
				visited[i] = true;
				perm(source, idx+1, select, visited);
				visited[i] = false;
			}
		}
	}
}