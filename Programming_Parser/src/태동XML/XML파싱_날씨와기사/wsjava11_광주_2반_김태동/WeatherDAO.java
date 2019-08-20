package 태동XML.XML파싱_날씨와기사.wsjava11_광주_2반_김태동;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WeatherDAO {
	private List<Weather> list = new ArrayList<>();
	private static WeatherDAO wtdao = new WeatherDAO();

	public static WeatherDAO getInstance() {
		return wtdao;
	}

	private WeatherDAO() {
	}

	public List<Weather> getWeatherList() {
		connectXML();
		return list;
	}

	public void connectXML() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document dom = builder.parse(new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2920064000")
					.openConnection().getInputStream());
			Element root = dom.getDocumentElement();

			NodeList items = root.getElementsByTagName("data");

			for (int i = 0; i < items.getLength(); i++) {
				Weather weather = new Weather();
				Node item = items.item(i);

				NodeList properties = item.getChildNodes();
				for (int j = 0; j < properties.getLength(); j++) {
					Node property = properties.item(j);
					String name = property.getNodeName();

					if (name.equalsIgnoreCase("hour")) {
						weather.setHour(Integer.parseInt(property.getFirstChild().getNodeValue()));
					} else if (name.equalsIgnoreCase("temp")) {
						weather.setTemp(Double.parseDouble(property.getFirstChild().getNodeValue()));
					} else if (name.equalsIgnoreCase("wfKor")) {
						weather.setWfKor(property.getFirstChild().getNodeValue());
					} else if (name.equalsIgnoreCase("reh")) {
						if (property.getFirstChild() != null)
							weather.setReh(Integer.parseInt(property.getFirstChild().getNodeValue()));
					}

				}
				list.add(weather);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
