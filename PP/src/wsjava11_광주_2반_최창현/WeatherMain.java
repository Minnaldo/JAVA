package wsjava11_광주_2반_최창현;

import java.util.ArrayList;

public class WeatherMain {
	public static void main(String[] args) {
		showList();
	}
	
	static void showList() {
		WeatherDAO wMain = WeatherDAO.getInstance();
		//ArrayList<Weather> list = wMain.getWeatherListDOM("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1123070500");
		ArrayList<Weather> list = wMain.getWeatherListSAX("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1123070500");
        for(  Weather weather: list)
        	System.out.println(weather);
	}
}
