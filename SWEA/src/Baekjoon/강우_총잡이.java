import java.io.*;
import java.util.*;

public class 강우_총잡이 {

	static boolean range(int r, int c) {
		if (r >= 0 && c >= 0 && r < R && c < C)
			return true;
		else
			return false;
	}

	static int R = 0, C = 0;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			R = Integer.parseInt(stz.nextToken());
			C = Integer.parseInt(stz.nextToken());
			char[][] map = new char[R][C];
			for (int r = 0; r < R; r++) {
				stz = new StringTokenizer(br.readLine());
				for (int c = 0; c < C; c++)
					map[r][c] = stz.nextToken().charAt(0);
			}
			int re_cnt = 0;
			for (int r = 0; r < R; r++)
				for (int c = 0; c < C; c++)
					if (map[r][c] == 'T') {
						int g_cnt = 0;
						for (int d = 0; d < dr.length; d++) {
							int next_r = r + dr[d], next_c = c + dc[d];
							while (range(next_r, next_c)) {
								if (map[next_r][next_c] == 'W' || map[next_r][next_c] == 'T')
									break;
								else if (map[next_r][next_c] == 'G') {
									g_cnt++;
									break;
								}
								next_r += dr[d];
								next_c += dc[d];
							}
						}
						if (g_cnt >= 1)
							re_cnt++;
					}
			System.out.println("#" + t + " " + re_cnt);
		}
	}
}
