package Theater;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index;
	
	MovieMgr() {}
	
	//* 파라미터로 전달된 영화 정보를 전달받아 배열에 저장. */
	public void add(Movie a)
	{
		movies[index] = a;
		index++;
	}
	
	
	//* 배열에 저장된 모든 영화정보를 리턴. */
	public Movie[] search()
	{
		//내가 찾고자 하는 index 까지만 정보 리턴하기 위해
		//index 크기만큼 새로운 배열을 생성
		Movie totalMovie[] = new Movie[index];
		System.arraycopy(movies, 0, totalMovie, 0, index);
		return totalMovie;
	}
	
	//* 파라미터로 전달된 타이틀을 포함하고 있는 모든 영화 정보를 검색하여 리턴. */
	public Movie[] search(String title)
	{
		int i;
		for(i = 0; i < index; i++)
		{
			if(movies[i].getTitle().equals(title))
				break;
		}
		
		return movies;		
	}
	
	public Movie[] Movie_search(String title)
	{
		int cnt = 0;
		for(int i = 0; i < index; i++)
		{
			if ( movies[i].getTitle().contains(title) )
				cnt++;
		}
		
		int idx = 0;
		Movie[] temp = new Movie[cnt];
		for (int i = 0; i < index; i++)
		{
			if ( movies[i].getTitle().contains(title) )
				temp[idx++] = movies[i];
		}
		
		return temp;
	}
	
	//* 파라미터로 전달된 감독명의 모든 영화 정보를 검색하여 리턴. */
	public Movie[] searchDirector(String name)
	{
		int cnt = 0;
		for(int i = 0; i < index; i++)
		{
			if(movies[i].getDirector().equals(name))
				cnt++;
		}
		
		int idx = 0;
		Movie[] temp = new Movie[cnt];
		for (int i = 0; i < index; i++)
		{
			if(movies[i].getDirector().equals(name) )
				temp[idx++] = movies[i];
		}
		
		return temp;
	}
	
	//* 파라미터로 전달된 장르의 모든 영화 정보를 검색하여 리턴. */
	public Movie[] searchGenre(String Genre)
	{
		int i;
		for(i = 0; i < index; i++)
		{
			if(movies[i].getGenre().equals(Genre))
				break;
		}
		
		return movies;
	}
	
	//* 파라미터로 전달된 제목의 영화를 삭제. */
	public void delete(String title)
	{
		int i;
		for(i = 0; i < index; i++)
		{
			if(movies[i].getTitle().equals(title))
			{
				movies[i] = movies[index-1];
				index--;
			}

		}
	}
	
	//* 저장된 영화 정보의 갯수를 리턴한다. */
	public int getSize()
	{
		return index;
	}
	
}
