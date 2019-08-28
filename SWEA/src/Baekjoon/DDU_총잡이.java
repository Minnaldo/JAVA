package Baekjoon;

import java.util.Scanner;
public class DDU_총잡이 {
    static int T;
    static char[][] arr;
    static int N;
    static int M;
    static Scanner sc = new Scanner(System.in);
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static boolean inArr(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            M = sc.nextInt();
            arr = new char[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = sc.next().charAt(0);
                }
            }
            int resul = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] == 'G') {
                        resul += shoot(i, j);
                        //System.out.println(i+" "+j+"*********");
                        //System.out.println("resul " + resul);
                    }
                }
            }
            System.out.println("#" + tc + " " + resul);
        } // tc
    }
    static int shoot(int x, int y) {
        int sum = 0;
        int nx = x;
        int ny = y;
        for (int i = 0; i < 4; i++) {
            int dirX = dx[i];
            int dirY = dy[i];
            nx=x+dirX;
            ny=y+dirY;
            //System.out.println(nx + " " + ny);
            while (inArr(nx, ny) && (arr[nx][ny] != 'W')) {
                if (arr[nx][ny] == 'G') {
                    break;
                }
                if (arr[nx][ny] == 'T') {
                    //System.out.println(nx+"와"+ny+"에서 팡!!!!!");
                    arr[nx][ny]='A';
                    sum++;
                    break;
                }
                nx += dirX;
                ny += dirY;
            }
        }
        //System.out.println(sum+" 썸입니다!");
        return sum;
    }
}