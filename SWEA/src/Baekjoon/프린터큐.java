package Baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//class SSS {
//	int value;
//	int priority;
//}

public class 프린터큐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			List<Integer> queue = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				queue.add(sc.nextInt());
			}
			int cnt = 0;

			while(M>=0) {
				for (int i = 0; i < queue.size(); i++) {
					int first = queue.get(0);
					for (int j = 1; j < queue.size(); j++) {
						if(first < queue.get(j)) {
							queue.add(queue.remove(0));
							M--;
							if(M < 0) {
								M += queue.size();
							}
							break;
						}
					}
				}
				queue.remove(0);
				M--;
				cnt++;
			}

			System.out.println(cnt);
		}
	}
}
