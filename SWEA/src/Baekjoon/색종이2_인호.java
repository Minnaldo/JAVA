package Baekjoon;

import java.util.Scanner;
public class 색종이2_인호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean[][] canvas = new boolean[100][100];
        int x = 0;
        int y = 0;
        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    canvas[j][k] = true;
                }
            }
        }
        
        int circumference = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(canvas[i][j]) {
                    if(i-1 >= 0 && !canvas[i-1][j]) {
                        circumference++;
                    }
                    if(i+1 < 100 && !canvas[i+1][j]) {
                        circumference++;
                    }
                    if(j-1 >= 0 && !canvas[i][j-1]) {
                        circumference++;
                    }
                    if(j+1 < 100 && !canvas[i][j+1]) {
                        circumference++;
                    }
                    if(i == 0 || i == 99 || j == 0 || j == 99) {
                        circumference++;
                    }
                    if((i==0 && j==0) || (i==99 && j==0) || (i==0 && j==99) || (i==99 && j==99)) {
                        circumference++;
                    }
                }
            }
        }
        System.out.println(circumference);
    }
}