package tenth_week;

import java.util.Arrays;

public class Disjoint {
	static int[] parents;
	public static void main(String[] args) {
		parents = new int[10];
		for (int i = 0; i < parents.length; i++) {
			makeSet(i);
		}
		printSet();
		union(0, 1); printSet();
		union(2, 3); printSet();
		union(0, 3); printSet();
		union(4, 5); printSet();
		union(6, 7); printSet();
		union(4, 7); printSet();
		union(3, 5); printSet();
		union(1, 8); printSet();
		union(0, 9); printSet();
	}
	static void printSet() {
		System.out.println(Arrays.toString(parents));
	}

	static void makeSet(int x) {
		parents[x] = x;
	}
	static int findSet(int x) {
		if(parents[x] == x) {
			return x;
		}
		parents[x] = findSet(parents[x]);
		return parents[x];
	}
	static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);
		parents[px] = py;
	}
}