package 태동XML.XML파싱_날씨와기사.wsjava11_광주_2반_김태동;

import java.util.List;

public class WeatherMain {
	
	static void showList() {
		WeatherDAO wtdao = WeatherDAO.getInstance();
		WeatherDAO2 wtdao2 = WeatherDAO2.getInstance();
		List<Weather> list = wtdao.getWeatherList();
		System.out.println("--------------DOM Parser--------------");
		for (Weather weather : list) {
			System.out.println(weather);
		}
		
		
		System.out.println("--------------SAX Parser--------------");
		list = wtdao2.getWeatherList();
		
		for (Weather weather : list) {
			System.out.println(weather);
		}
		
	}
	public static void main(String[] args) {
		showList();
	}
}
