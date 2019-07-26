package Theater;

//Mgr이 싱글톤이 적용되어야. 유리함도 인지한다.
public class MovieMgr22 {
	private MovieMgr22() {
		movies = new Movie[100];
		index = 0;
	}
	private static MovieMgr22 instance;
	
	public static MovieMgr22 getInstance()
	{
		if(instance == null)
			instance = new MovieMgr22();
		return instance;
	}
	
	//필요한 유지관리되어져야 할 상태를 멤버변수로 정의.
	private Movie[] movies;
	private int index;
	
	//필요한 기능들을 구현 :)
	public void add(Movie m)
	{
		if(index < 100)
			movies[index++] = m;
	}
	
	public Movie[] search()
	{
		//현재 등록된 영화들의 크기만큼의 배열을 새로 만들어서, 거기에 옮겨담아 리턴.
		Movie[] tmp = new Movie[index];
		for(int i = 0; i < index; i++)
		{
			tmp[i] = movies[i];
		}
		
		return tmp;
	}
	
	public Movie[] search(String title)
	{
		//이름이 포함된 영화의 갯수만큼의 배열을 만들고, 거기에 채워서 리턴.
		int cnt = 0;
		for(int i = 0; i < index; i++)
		{
			//부분문자열 검사...  따라서, 알라딘에서 '알'만 해도 찾는다.
			if(movies[i].getTitle().contains(title))
				cnt++;
		}
			
		int idx = 0;
		Movie[] tmp = new Movie[cnt];
		for(int i = 0; i < index; i++)
		{
			if (movies[i].getTitle().contains(title))
				tmp[idx++] = movies[i];
		}
		return tmp;
		
		//난 틀렸어....
	}
	
}
