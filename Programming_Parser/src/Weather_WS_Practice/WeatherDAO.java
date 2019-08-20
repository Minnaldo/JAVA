package Weather_WS_Practice;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class WeatherDAO {
	private List<Weather> list = new ArrayList<>();
	private static WeatherDAO wtdao = new WeatherDAO();
	
	public static WeatherDAO getInstance()
	{
		return wtdao;
	}
	
	private WeatherDAO()
	{
		
	}
	
	public List<Weather> getWeatherList()
	{
		connectXML();
		return null;
	}
	
	public void connectXML()
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		
		try {
			builder = factory.newDocumentBuilder();
			Document dom = builder.parse(new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2920064000")
					.openConnection().getInputStream());
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
