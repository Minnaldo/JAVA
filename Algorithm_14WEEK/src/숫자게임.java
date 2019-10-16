import java.util.Scanner;

public class 숫자게임 {
	
	static int T;
	static int result = 0;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            result = 0;
            solve(N, 0);
            System.out.println("#" + tc + " " + result);
        }
    }
    
    
    static void solve(int N, int cnt) {
        if( N < 10 ) {
            result = Math.max(result, cnt);
            return;
        }
        if( N >= 10 ) {
            solve(N/10 * (N%10), cnt+1);
        }
        if( N >= 100 ) {
            solve(N/100 * (N%100), cnt+1);
            solve(N/100 * (N%100/10) * (N%10), cnt+1);
        }
        if( N >= 1000 ) {
            solve(N/1000 * (N%1000), cnt+1);//  천
            solve(N/1000 * (N%1000/100) * (N%100), cnt+1); // 천과 백
            solve(N/1000 * (N%1000/10) * (N%10), cnt+1); // 천과 십
            solve(N/1000 * (N%1000/100) *  (N%100/10) * (N%10), cnt+1); // 천과 백과 십
        }
        if( N >= 10000 ) {
            //만 , 만십, 만백, 만천, 만천백, 만천십, 만백십, 만천백십
            solve(N/10000 * (N%10000), cnt+1); //만
            solve(N/10000 * (N%10000/10) * (N%10), cnt+1); //만십
            solve(N/10000 * (N%10000/100) * (N%100), cnt+1); //만백
            solve(N/10000 * (N%10000/1000) * (N%1000), cnt+1); //만천
            solve(N/10000 * (N%10000/1000) * (N%1000/100) * (N%100), cnt+1); //만천백
            solve(N/10000 * (N%10000/1000) * (N%1000/10) * (N%10), cnt+1); //만천십
            solve(N/10000 * (N%10000/100) * (N%100/10) * (N%10), cnt+1); //만백십
            solve(N/10000 * (N%10000/1000) * (N%1000/100) * (N%100/10) * (N%10), cnt+1); //만천백십
        }
    }
}