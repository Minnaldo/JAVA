import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		MovieMgr mgr = MovieMgr.getInstance();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 영화정보입력");
			System.out.println("2. 영화정보전체검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화정보삭제");
			System.out.println("0. 종료");
			int sel = sc.nextInt();
			if( sel == 0 )
				break;
			else if( sel == 1 ) {
				//영화에 대한 다섯가지 세부정보를 입력받아서 저장.
				System.out.println("제목,감독,등급,장르,줄거리를 순서대로. 엔터로 구분 해가며 입력 하세요.");
				Movie m = new Movie(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
				mgr.add(m);
			}
			else if( sel == 2 ) {
				//영화 전체 정보를 검색하는 기능
				// for( Movie m : mgr.search())
				for(int i =0;i<mgr.getSize();i++){
					
					System.out.println(mgr.search()[i]);
				}
				}
			else if( sel == 3 ) {
				//영화들 중에서 영화명을 포함만 검색하는 기능
				String search = sc.next();
				for(Movie m : mgr.search(search))
					System.out.println(m);
			}
			else if( sel == 4){
				//영화들 중에서 장르병을 포함만 검색하는 기능
				String search = sc.next();
				for(Movie m : mgr.searchGenre(search))
					System.out.println(m);
			}
			else if( sel ==5){
				String search = sc.next();
				mgr.delete(search);
			}
		}
		sc.close();
	}
}