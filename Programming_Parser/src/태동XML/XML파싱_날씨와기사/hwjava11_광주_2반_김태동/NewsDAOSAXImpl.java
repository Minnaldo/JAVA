package hwjava11_광주_2반_김태동;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class NewsDAOSAXImpl implements INewsDAO{

	List<News> list = new ArrayList<News>();
	private static NewsDAOSAXImpl nds = new NewsDAOSAXImpl();
	
	public static NewsDAOSAXImpl getInstance() {
		return nds;
	}
	
	private NewsDAOSAXImpl() {}

	public List<News> getNewsList(String url) {
		list.clear();
		connectNews(url);
		return list;
	}
	
	
	private void connectNews(String url) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			SAXHandler handler = new SAXHandler();
			parser.parse(new URL(url).openConnection().getInputStream(), handler);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public News search(int index) {
		return list.get(index);
	}
	
	public class SAXHandler extends DefaultHandler {
		private StringBuilder sb = new StringBuilder();
		News n;

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
			if (this.n != null) {
				if (name.equalsIgnoreCase("title")) {
					n.setTitle(sb.toString().trim());
				} else if (name.equalsIgnoreCase("description")) {
					n.setDesc(sb.toString().trim());
				} else if (name.equalsIgnoreCase("link")) {
					n.setLink(sb.toString().trim());
				} else if (name.equalsIgnoreCase("item")) {
					list.add(n);
				}
			}
			sb.setLength(0);
		}
		

		//노드가 시작된다.(태그)
		@Override
		public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, name, attributes);
			if (name.equalsIgnoreCase("item")) {
				n = new News();
			}
		}
	}
	
}
