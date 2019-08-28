import java.util.Scanner;

public class 유진_총잡이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int r = sc.nextInt(); // 행
			int c = sc.nextInt(); // 열
			String[][] str = new String[r][c];

			/*
			 * 상, 하, 좌, 우 직선방향만 가능 상, 하, 좌, 우에 W가 존재하면 목표물 ㄴㄴ 목표물 너머의 목표물 또한 ㄴㄴ 다른 총잡이 너머의
			 * 목표물 ㄴㄴ
			 */
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str[i].length; j++) {
					str[i][j] = sc.next();

				}
			}

			int cnt = 0;
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str[i].length; j++) {
					if (str[i][j].equals("G")) { // 만약 총잡이가 나타나면,
						// System.out.println(i+"행" +j+"열에 총잡이 등장 . 상하좌우 확인할게요");
						// 위에 검사
						// System.out.println("위에 확인할게요");
						for (int row = i - 1; row >= 0; row--) {
							if (str[row][j].equals("T")) {
								// System.out.println(row+"행"+j+"열에 목표물 있어요");
								str[row][j] = "W";
								cnt++;
								break;
							} else if (str[row][j].equals("W") || str[row][j].equals("G")) {
								// System.out.println(row+"행"+j+"행에 벽 또는 총잡이 있어서 나갑니다 . . ");
								break;
							}
						}
						// 아래 검사
						// System.out.println("아래 확인할게요");
						for (int row = i + 1; row < str.length; row++) {
							if (str[row][j].equals("T")) {
								// System.out.println(row+"행"+j+"열에 목표물 있어요");
								str[row][j] = "W";
								cnt++;
								break;
							} else if (str[row][j].equals("W") || str[row][j].equals("G")) {
								// System.out.println(row+"행"+j+"행에 벽 또는 총잡이 있어서 나갑니다 . . ");
								break;
							}
						}
						// 왼쪽 검사
						// System.out.println("왼쪽 확인할게요");
						for (int col = j - 1; col >= 0; col--) {
							if (str[i][col].equals("T")) {
								// System.out.println(i+"행"+col+"열에 목표물 있어요");
								str[i][col] = "W";
								cnt++;
								break;
							} else if (str[i][col].equals("W") || str[i][col].equals("G")) {
								// System.out.println(i+"행"+col+"행에 벽 또는 총잡이 있어서 나갑니다 . . ");
								break;
							}
						}

						// 오른쪽 검사
						// System.out.println("오른쪽 확인할게요");
						for (int col = j + 1; col < str[i].length; col++) {
							if (str[i][col].equals("T")) {
								// System.out.println(i+"행"+col+"열에 목표물 있어요");
								str[i][col] = "W";
								cnt++;
								break;
							} else if (str[i][col].equals("W") || str[i][col].equals("G")) {
								// System.out.println(i+"행"+col+"행에 벽 또는 총잡이 있어서 나갑니다 . . ");
								break;
							}
						}
					}
				}

			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
