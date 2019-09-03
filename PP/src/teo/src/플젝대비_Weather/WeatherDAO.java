package 플젝대비_Weather;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherDAO {
	private static WeatherDAO wdao = new WeatherDAO();

	public static WeatherDAO getInstance() {
		return wdao;
	}

	private WeatherDAO() {
	}

	ArrayList<Weather> list;

	public ArrayList<Weather> getWeatherListDOM(String url) {
		list = new ArrayList<Weather>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {

			DocumentBuilder builder = factory.newDocumentBuilder();
			//(new URL(url).openConnection().getInputStream() : xml 문서!!
			
			Document dom = builder.parse(new URL(url).openConnection().getInputStream());
			//그 document 에서 엘리먼트를 뽑아옴
			Element root = dom.getDocumentElement();
			// 그 구조가 노드(<>이거 태그가 다 노드!,+ 데이터도 다 노드, 속성 또한 따로 하나의 노드)노드중에 태그를 엘리먼트노드라고함(태그)
			//이름를 이용해서 가져올수있음
			// nodeList로 받음(여러개니까)
			
			NodeList items = root.getElementsByTagName("data");
			//엘리먼트노드는 안에 노드를 가질수 있음!!!!
			for (int i = 0; i < items.getLength(); i++) {
				Weather weather = new Weather();
			//get과 같음 
				Node item = items.item(i);
//				weather.setCode(item.getAttributes().getNamedItem("code").getNodeValue());
//				weather.setDate(item.getAttributes().getNamedItem("date").getNodeValue());

				NodeList properties = item.getChildNodes();
				for (int j = 0; j < properties.getLength(); j++) {
					Node property = properties.item(j);
					String name = property.getNodeName();
					if (name.equalsIgnoreCase("hour")) {
						weather.setHour(Integer.parseInt(property.getFirstChild().getNodeValue()));
					} else if (name.equalsIgnoreCase("temp")) {
					//노드의 value는 null 이고 
					//텍스트 노드의 value를 보려면 자식으로 가야함 - 그래서 getFirstChild()하는거임!!!!!!!!!!!!!!!!!!!!
						weather.setTemp(Double.parseDouble(property.getFirstChild().getNodeValue()));
					} else if (name.equalsIgnoreCase("wfKor")) {
						weather.setWfkor(property.getFirstChild().getNodeValue());
					} else if (name.equalsIgnoreCase("reh")) {
//						if (property.getFirstChild() != null)
							weather.setReh(Integer.parseInt(property.getFirstChild().getNodeValue()));
					}

				}
				list.add(weather);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	public void connectXML() {

	}

	public ArrayList<Weather> getWeatherListSAX(String url) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			MyHandler handler = new MyHandler();
			parser.parse(new URL(url).openConnection().getInputStream(), handler);

			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public class MyHandler extends DefaultHandler {
		private StringBuilder sb;
		Weather weather;

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			super.characters(ch, start, length);
			sb.append(ch, start, length);
		}

		@Override
		public void endElement(String uri, String localName, String name) throws SAXException {
			super.endElement(uri, localName, name);
			if (this.weather != null) {
				if (name.equalsIgnoreCase("hour")) {
					weather.setHour(Integer.parseInt(sb.toString().trim()));
				} else if (name.equalsIgnoreCase("temp")) {
					weather.setTemp(Double.parseDouble(sb.toString().trim()));
				} else if (name.equalsIgnoreCase("wfKor")) {
					weather.setWfkor(sb.toString().trim());
				} else if (name.equalsIgnoreCase("reh")) {
					weather.setReh(Integer.parseInt(sb.toString().trim()));
				} else if (name.equalsIgnoreCase("data")) {
					list.add(weather);
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

		@Override
		public void endDocument() throws SAXException {
			// TODO Auto-generated method stub
			super.endDocument();
		}

		@Override
		public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, name, attributes);
			if (name.equalsIgnoreCase("data")) {
				weather = new Weather();
//				weather.setCode(attributes.getValue(0));
//				weather.setDate(attributes.getValue(1));
			}
		}
	}
}
