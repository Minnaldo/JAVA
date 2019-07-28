
public class MovieMgr {
	private MovieMgr() {
		movies = new Movie[100];
		index = 0;
	}
	private static MovieMgr instance;
	public static MovieMgr getInstance() {
		if(instance == null)
			instance = new MovieMgr();
		return instance;
	}
	
	//필요한 유지관리되어져야 할 상태 를 멤버변수로 정의
	private Movie[] movies;
	private int index;
	
	//필요한 기능들을 구현 :)
	public void add(Movie m) {
		if(index < 100)
			movies[index++] = m;
	}
	
	public Movie[] search() {
		//현재 등록된 영화들의 크기만큼의 배열을 새로 만들어서. 거기에 옮겨담아 리턴합시다.
		Movie[] tmp = new Movie[index];
		for(int i = 0; i < index; i++)
			tmp[i] = movies[i];
		return tmp;
	}
	
	public Movie[] search(String title) {
		//이름이 포함된 영화의 갯수만큼의 배열을 만들고, 거기에 채워서 리턴합시다.
		int cnt = 0;
		for(int i = 0; i < index; i++) {
			if( movies[i].getTitle().contains(title) )
				cnt++;
		}
		int idx = 0;
		Movie[] tmp = new Movie[cnt];
		for(int i = 0; i < index; i++) {
			if( movies[i].getTitle().contains(title) )
				tmp[idx++] = movies[i];
		}
		return tmp;
	}
	public Movie[] searchDirector(String name) {
		//파라메터로 전달된 감독명의 모든 영화정보를 검색하여 리턴한다.
		int cnt = 0;
		for(int i = 0; i < index; i++) {
			if( movies[i].getTitle().equals(name) )
				cnt++;
		}
		int idx = 0;
		Movie[] tmp = new Movie[cnt];
		for(int i = 0; i < index; i++) {
			if( movies[i].getTitle().equals(name) )
				tmp[idx++] = movies[i];
		}
		return tmp;
	}
	public Movie[] searchGenre(String genre) {
		//파라메터로 전달된 감독명의 모든 영화정보를 검색하여 리턴한다.
		int cnt = 0;
		for(int i = 0; i < index; i++) {
			if( movies[i].getTitle().equals(genre) )
				cnt++;
		}
		int idx = 0;
		Movie[] tmp = new Movie[cnt];
		for(int i = 0; i < index; i++) {
			if( movies[i].getTitle().equals(genre) )
				tmp[idx++] = movies[i];
		}
		return tmp;
	}
	/** 파라메터로 전달된 제목의 영화를 삭제한다. */
	public void delete(String title){
		for (int i = 0; i < index; i++) {
			if (movies[i].getTitle().equals(title)) {
				movies[i] = movies[--index];
			}
		}
	}
	/** 저장된 영화 정보의 갯수를 리턴한다. */
	public int getSize(){
		return index;
	}
}