package MovieMovie;

public class MovieMgr_77 {
	private Movie_77[] movies_77 = new Movie_77[100];
	private int index = 0;;
	
	MovieMgr_77 () {}
	
	/** 파라미터로 전달된 영화 정보를 전달받아 배열에 저장한다. */
	public void add(Movie_77 m)
	{
		movies_77[index] = m;
		index++;
	}
	
	/** 배열에 저장된 모든 영화정보를 리턴한다. */
	public Movie_77[] search()
	{	
		Movie_77 total_movie[] = new Movie_77[index];
		System.arraycopy(movies_77, 0, total_movie, 0, index);
		return total_movie;
	}
	
	/** 파라메타로 전달된 타이틀을 포함하고 있는 모든 영화 정보를 검색하여 리턴 */
	public Movie_77[] search(String title)
	{
		
	}
	
	/** 파라미터로 전달된 감독명의 모든 영화 정보를 검색하여 리턴한다. */
	public Movie_77[] searchDirector(String name)
	{
		
	}
	
	/** 파라미터로 전달된 장르의 모든 영화 정보를 검색하여 리턴한다. */
	public Movie_77[] searchGenre(String genre)
	{
		
	}
	
	/** 파라미터로 전달된 제목의 영화를 삭제한다. */
	public void delete(String title)
	{
		
	}
	
	/** 저장된 영화 정보의 갯수를 리턴한다. */
	public int getSize()
	{
		return 0;
	}
}
