package Theater;

import java.util.Scanner;

public class MovieTest22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieMgr22 mgr = MovieMgr22.getInstance();
		Scanner sc = new Scanner(System.in);

		Movie[] movies = new Movie[100];
		
		
		int index = 0;

		while (true) {
			System.out.println("1. 영화 정보 입력 ");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화 정보 삭제");
			System.out.println("0. 종료");

			int sel = sc.nextInt();

			if (sel == 0)
				break;
			else if (sel == 1) 
			{
				// 영화에 대한 다섯가지 세부정보를 입력받아서 저장.
				System.out.println("제목,감독,등급,장르,줄거리를 순서대로.. 엔터,스페이스로 구분해가며 입력하세요.");
				int idx = 0;
				Movie n = new Movie(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
				mgr.add(n);
			}
			else if (sel == 2)
			{
				//영화 전체 정보를 검색하는 기능
				
			}
			
			else if (sel == 3)
			{
				//영화들 중에서 특정 장르만 검색하는 기능
				String search = sc.next();
				//foreach문에서   오른쪽에 배열이니
				//오른쪽에서 하나씩 꺼내다가 m에 넣고 반복.
				for(Movie m : mgr.search(search))
					System.out.println(m);
			}

		}
	}

}
