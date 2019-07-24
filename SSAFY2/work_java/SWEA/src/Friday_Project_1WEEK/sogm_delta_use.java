package Friday_Project_1WEEK;

import java.util.Scanner;

public class sogm_delta_use {
	// delta 선언
    static int[][] delta =  {{0}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 소금쟁이는 순서대로 입장. 입장하자마자 3칸2칸1칸을 뛰고 마지막 자리에 자리 잡음
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        for (int tc = 0; tc < testCase; tc++) {
            int N = sc.nextInt(); // 연못의 크기
            int C = sc.nextInt(); // 소금쟁이의 수
            int [][] lake = new int[N][N];
            int cnt = 0;
            
//          //6 2 4
//          lake[6][8] = 1;
//          // 1 5 2
//          lake[7][5] = 1;
//          // 0 0 4
//          lake[0][6] = 1;
            // 6 6 1 -> 세 번째 점프에서 (0,6)에 있는 소금쟁이를 만나 죽음
            // 2 4 3 -> 왼쪽으로 나가죽음
            
            // 소금쟁이 수 만큼 반복을 돌면서 시작위치와 방향을 입력 받고, 방향으로 3, 2, 1칸을 뛰는데
            // 한 번 뛰때마다 나갔는지, 밟았는지 검사. 나가거나 밟으면 죽은거니까  continue
            
            // 소금쟁이 수 만큼 반복
            for(int i =0; i<C; i++) {
                // 각 소금쟁이의 출발 좌표와 방향을 입력 받자
                int r = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                
                // r, c로부터 d 방향으로 3칸 이동.
                // 소금쟁이가 일단 살아있을 것으로 간주
                boolean isAlive = true;
                // 소금쟁이 뛰는 칸수 3, 2, 1로 반복
                for(int j = 3; j > 0; j--) {
                    // 방향에 대해서 델타를 이용한 방향 이동을 사용하면 매우 편리하고 자주 사용됨
                    // {{0}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}} <- 위에  delta 선언 보기
                    r += delta[d][0] * j;
                    c += delta[d][1] * j;
//                  if(d == 1) {
//                      r -= j;
//                  } else if( d == 2) {
//                      r += j;
//                  } else if( d == 3) {
//                      c -= j;
//                  } else if( d == 4) {
//                      c += j;
//                  }
                    // 나갔는지 검사. 나갔으면 continue
                    if( r < 0 || r >= N || c < 0 || c >= N) {
                        isAlive = false; // 죽으면 표시
                        break;
                    }
                    // 이동한 위치에 소금쟁이가 있는지 검사, 있으면 continue;
                    if(lake[r][c] != 0) {
                        isAlive = false; // 죽으면 표시
                        break;
                    }
                
                }
                if (isAlive) {
                	cnt++;
                    lake[r][c] = 1; // 3번 뛰고 살아있을 때만 배열에 표시
                    
                }

                
            }
            System.out.println("#" + (tc+1) + " " + cnt);

        }
    }

}
