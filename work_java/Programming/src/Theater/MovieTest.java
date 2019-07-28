package Theater;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieMgr movietest = new MovieMgr();
		Movie movie_information[] = new Movie[100];

		Scanner sc = new Scanner(System.in);

		int index = 0;

		while (true) {
			System.out.println("1. 영화 정보 입력 ");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화 정보 삭제");
			System.out.println("0. 종료");
			
			int a = sc.nextInt();
			
			if (a == 0)
				break;
			
			Movie[] movies = movietest.search();
			switch (a) {
			case 1:
				String _title = sc.next();
				String _director = sc.next();
				int _grade = sc.nextInt();
				String _genre = sc.next();
				String _summary = sc.next();
				
				movie_information[index] = new Movie(_title, _director, _grade, _genre, _summary);
				movietest.add(movie_information[index]);
				index++;

				break;
			case 2:
				
				for (int i = 0; i < movies.length; i++) {
					System.out.println(movies[i]);
				}
				break;
			case 3:
				String movie_title = sc.next();
				for(int i = 0; i < movies.length; i++)
				{
					System.out.println(movies[i]);
				}
				break;
			case 4:
				for (int i = 0; i < movies.length; i++)
				{
					System.out.println(movies[i]);
				}
				break;
			case 5:
				String movie_delete = sc.next();
				movietest.delete(movie_delete);
				break;
			case 0:
				break;
			}

		}

	}

}
