import java.util.Scanner;

public class 원재메모리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
//			0011
			String input = sc.next();
			int cnt = 0;
			char[] mem = new char[input.length()];
			for(int i = 0; i < mem.length; i++)
				mem[i] = '0';
			
			//입력된 문자열(기억에 있는 원본 메모리 비트열) 을 처음부터 끝까지 검사해가며
			for(int i = 0; i < input.length(); i++) {
				//검사하는 위치의 비트가 내가 복원중인(초기화된)메모리와 비트가 다르다면
				if( input.charAt(i) != mem[i] ) {
					//복원중인 메모리의 해당 비트를 기억에 있는 비트로 바꿈( 현재부터 끝까지 다 변경되는 규칙에 따라서... )
					for(int j = i; j < mem.length; j++)
						mem[j] = input.charAt(i);
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt) ;
		}
	}
}









