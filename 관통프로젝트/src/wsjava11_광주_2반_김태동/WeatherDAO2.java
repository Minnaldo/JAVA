package wsjava11_광주_2반_김태동;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherDAO2 {
	List<Weather> list;
	private static WeatherDAO2 wtdao2 = new WeatherDAO2();
	
	public static WeatherDAO2 getInstance() {
		return wtdao2;
	}
	
	private WeatherDAO2() {}

	public List<Weather> getWeatherList() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			MyHandler handler = new MyHandler();
			parser.parse(new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2920064000").openConnection().getInputStream(), handler);
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public class MyHandler extends DefaultHandler {
		private StringBuilder sb;
		Weather wh;

		//태그 하나 읽을 때 마다
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			super.characters(ch, start, length);
			sb.append(ch, start, length);
		}

		//노드가 끝난다.(태그)
		@Override
		public void endElement(String uri, String localName, String name) throws SAXException {
			super.endElement(uri, localName, name);
			if (this.wh != null) {
				if (name.equalsIgnoreCase("hour")) {
					wh.setHour(Integer.parseInt(sb.toString().trim()));
				} else if (name.equalsIgnoreCase("temp")) {
					wh.setTemp(Double.parseDouble(sb.toString().trim()));
				} else if (name.equalsIgnoreCase("wfKor")) {
					wh.setWfKor(sb.toString().trim());
				} else if (name.equalsIgnoreCase("reh")) {
					wh.setReh(Integer.parseInt(sb.toString().trim()));
				} else if (name.equalsIgnoreCase("data")) {
					list.add(wh);
				}
			}
			sb.setLength(0);
		}

		@Override
		public void startDocument() throws SAXException {
			super.startDocument();
			list = new ArrayList<Weather>();
			sb = new StringBuilder();
		}
		

		//노드가 시작된다.(태그)
		@Override
		public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, name, attributes);
			if (name.equalsIgnoreCase("data")) {
				wh = new Weather();
			}
		}
	}
}
