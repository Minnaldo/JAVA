package SWEA_D4;

import java.util.Scanner;

public class SWEA_D4_1210_jiwon {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int testCase = 10;
        int [] dx = {-1, 1, 0};
        int [] dy = {0, 0, -1};
        for (int tc = 1; tc <= testCase; tc++) {
            int n = sc.nextInt();
            int [][] map = new int[100][100];
            int x=0, y=0;
            for(int i=0; i<100; i++) {
                for(int j=0; j<100; j++) {
                    map[i][j] = sc.nextInt();
                    if(map[i][j] == 2) {
                        x = j;
                        y = i;
                    }
                }
            }
            while(y!=0) {
                
                for(int i=0; i<3; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    
                    if(nx >=0 && nx < 100 && ny >=0 && ny < 100 && map[ny][nx] == 1) {
                        x = nx;
                        y = ny;
                        map[y][x] = 0;
                        break;
                    }
                    
                }
            }
            
            
            System.out.println("#" + n + " " + x );
        }
    }
}