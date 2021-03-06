package MovieMovie;

public class Movie_77 {
	private String title;
	private String director;
	private int grade;
	private String summary;
	
	Movie_77 () {}	
	
	public Movie_77(String title, String director, int grade) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
	}

	public Movie_77(String title, String director, int grade, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Movie_77 [title=" + title + ", director=" + director + ", grade=" + grade + ", summary=" + summary
				+ "]";
	}
	
	
	
}
