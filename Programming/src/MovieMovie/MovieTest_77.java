package MovieMovie;

import java.util.Scanner;

public class MovieTest_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MovieMgr을 사용할 수 있게 객체 생성!!!
		MovieMgr_77 movietest = new MovieMgr_77();
		
		//영화 정보를 담을 수 있게 Movie클래스의 배열을 100개 생성!!!
		Movie_77 movie_information[] = new Movie_77[100];

		Scanner sc = new Scanner(System.in);
		int index = 0;
		
		while (true) 
		{
			System.out.println("<<< 영화 관리 프로그램 >>>");
			System.out.println("1. 영화 정보  입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 선택하세요. ");
			
			int input = sc.nextInt();
			
			if (input == 0)
				break;
			
			else if(input == 1)
			{
				movie_information[index] = new Movie_77(sc.next(), sc.next(), sc.nextInt(), sc.next());
				movietest.add(movie_information[index]);
				index++;
			}
			
			else if(input == 2)
			{
				
			}
			else if(input == 3)
			{
				
			}
			else if(input == 4)
			{
				
			}
			else if(input == 5)
			{
				
			}
			
			
		}

	}

}
