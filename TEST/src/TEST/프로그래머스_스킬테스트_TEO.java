package TEST;

public class 프로그래머스_스킬테스트_TEO {

	public static int solution(int num) {
		int answer = 0;
		for (int i = 0; i < 500; i++) {
			if (num == 1) {
				break;
			}
//			if (i == 499 && num!=1) {
//				answer = -1;
//				break;
//			}
			if (num % 2 == 0) {
				num /= 2;
			} 
			else if (num % 2 == 1)	{
				num = num * 3 + 1;
			}
			answer++;
			//	          System.out.print(num+" ");
		}
		if(num != 1)
			answer = -1;
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		int num = 626331;
		solution(num);
	}
}