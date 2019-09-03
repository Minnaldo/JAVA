package 플젝대비_News;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NewsDAODOMImpl implements INewsDAO {
	ArrayList<News> list;
	
	private void connectNews(String url) {
		
	}

	@Override
	public ArrayList<News> getNewsList(String url) {
		list = new ArrayList<News>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document dom = builder.parse(new URL(url).openConnection().getInputStream());
			Element root = dom.getDocumentElement();
			
			NodeList items = root.getElementsByTagName("item");
			
			for (int i=0;i<items.getLength();i++){
				News news = new News();
				Node item = items.item(i);
//				weather.setCode(item.getAttributes().getNamedItem("code").getNodeValue());
//				weather.setDate(item.getAttributes().getNamedItem("date").getNodeValue());
				
				NodeList properties = item.getChildNodes();
				for (int j=0;j<properties.getLength();j++){
					Node property = properties.item(j);
					String name = property.getNodeName();
					if (name.equalsIgnoreCase("title")){
						news.setTitle(property.getFirstChild().getNodeValue());
					} else if (name.equalsIgnoreCase("link")){
						news.setLink(property.getFirstChild().getNodeValue());
					} else if (name.equalsIgnoreCase("description")){
						news.setDesc(property.getFirstChild().getNodeValue());
					} 	
				}
				list.add(news);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
		return list;
	}

	@Override
	public News search(int index) {
		return null;
	}
	
	
}
