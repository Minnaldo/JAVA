package hwjava11_광주_2반_김태동;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewsMain {
	NewsDAODOMImpl ndd;
	NewsDAOSAXImpl nds;
	List<News> list;
	News news;

	public NewsMain() {
		ndd = NewsDAODOMImpl.getInstance();
		nds = NewsDAOSAXImpl.getInstance();
		list = new ArrayList<>();
	}

	public void go() {
		Scanner sc = new Scanner(System.in);
		int menu;
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("0을 누르면 종료합니다.");
			System.out.println("1. 기사 제목 출력");
			System.out.println("2. 기사 요약 출력");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				showList();
				
				break;
			case 2:
				showList();
				System.out.println("---------------------------------------------------------");
				System.out.println("보고싶은 기사의 번호를 입력하세요.");
				int idx = sc.nextInt();
				
				System.out.println("-------------------DOM Parser-------------------");
				news = ndd.search(idx - 1);
				System.out.println(news.getDesc());
				
				System.out.println("-------------------SAX Parser-------------------");
				news = nds.search(idx - 1);
				System.out.println(news.getDesc());

				break;
			case 0:
				System.out.println("종료합니다.");
				break;
			}
		} while (menu != 0);
	}

	public void showList() {

		System.out.println("-------------------DOM Parser-------------------");
		list = ndd.getNewsList("http://rss.etnews.com/Section902.xml");

		for (News news : list) {
			System.out.println(news.getTitle());
		}

		System.out.println("-------------------SAX Parser-------------------");
		list = nds.getNewsList("http://rss.etnews.com/Section902.xml");

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i).getTitle());
		}
		
	}

	public static void main(String[] args) {
		new NewsMain().go();
	}

}
