package 플젝대비_News;

import java.util.ArrayList;

public interface INewsDAO {
	ArrayList<News> getNewsList(String url);
	News search(int index);
}
