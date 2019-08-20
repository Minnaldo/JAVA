package hwjava11_광주_2반_김태동;

import java.util.List;

public interface INewsDAO {
	List<News> getNewsList(String url);
	News search(int index);
}
