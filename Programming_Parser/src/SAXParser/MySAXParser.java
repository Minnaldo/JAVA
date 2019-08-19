package SAXParser;

import java.net.URL;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import SAXParser.Check;

public class MySAXParser {
	ArrayList<Check> list;

	public ArrayList<Check> getContent(String url){
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			MyHandler handler = new MyHandler();
			/*parse : 占식쏙옙占싼댐옙.  InputStream占쏙옙 占쏙옙占쏙옙占싶쇽옙(result.xml占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙.) Connection 占쏙옙占쌔댐옙.
			 * MyHandler占쏙옙占� 占쌍몌옙 占쏙옙達騁占� 
			 */
			parser.parse(new URL(url).openConnection().getInputStream(), handler);
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
	public class MyHandler extends DefaultHandler{
		private StringBuilder sb;
		Check ch;
		
		/* '<' 占쏙옙占쏙옙 占싻어서 ch占썼열占쏙옙 占쏙옙占쏙옙占싼댐옙.
		 * 
		 */
		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			super.characters(ch, start, length);
			sb.append(ch, start, length);
		}
		
		//End Tag (/CheckList)占쏙옙 호占쏙옙占� 占쏙옙.
		@Override
		public void endElement(String uri, String localName, String name)
				throws SAXException {
			super.endElement(uri, localName, name);
			if (this.ch != null){
				if (name.equalsIgnoreCase("Clean")){
					ch.setClean(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Ready")){
					ch.setReady(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Response")){
					ch.setResponse(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Request")){
					sb.trimToSize();
					if(sb.length()>0)
						ch.setRequest(sb.toString().trim());
				} else if (name.equalsIgnoreCase("Check")){		//Check占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 list占쏙옙 add占싼댐옙.
				     list.add(ch);
				}
				sb.setLength(0);	
			}
		}
		
		@Override
		public void startDocument() throws SAXException {
			super.startDocument();
			list = new ArrayList<Check>();
			sb = new StringBuilder();
		}
		
		//Start Tag (CheckList)占쏙옙 호占쏙옙占� 占쏙옙.
		@Override
		public void startElement(String uri, String localName, String name,
				Attributes attributes) throws SAXException {
			super.startElement(uri, localName, name, attributes);
			/* "Check"占쏙옙占� name占쏙옙 占싻억옙占쏙옙占쏙옙
			 * 占쏙옙占싸울옙 占쏙옙체占쏙옙 占쏙옙占쏙옙占싹곤옙 占쏙옙占쏙옙 占쌍억옙占쌔댐옙.
			 */
			if (name.equalsIgnoreCase("Check")){
				ch = new Check();
				ch.setCode(attributes.getValue(0));
				ch.setDate(attributes.getValue(1));
			}
	}
}
}