package com.ssafy.news;

import java.util.ArrayList;

public interface INewsDAO {
	ArrayList<News> getNewsList(String url);
	News search(int index);
}
