package �������_Weather;

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
			//(new URL(url).openConnection().getInputStream() : xml ����!!
			
			Document dom = builder.parse(new URL(url).openConnection().getInputStream());
			//�� document ���� ������Ʈ�� �̾ƿ�
			Element root = dom.getDocumentElement();
			// �� ������ ���(<>�̰� �±װ� �� ���!,+ �����͵� �� ���, �Ӽ� ���� ���� �ϳ��� ���)����߿� �±׸� ������Ʈ�������(�±�)
			//�̸��� �̿��ؼ� �����ü�����
			// nodeList�� ����(�������ϱ�)
			
			NodeList items = root.getElementsByTagName("data");
			//������Ʈ���� �ȿ� ��带 ������ ����!!!!
			for (int i = 0; i < items.getLength(); i++) {
				Weather weather = new Weather();
			//get�� ���� 
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
					//����� value�� null �̰� 
					//�ؽ�Ʈ ����� value�� ������ �ڽ����� ������ - �׷��� getFirstChild()�ϴ°���!!!!!!!!!!!!!!!!!!!!
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
