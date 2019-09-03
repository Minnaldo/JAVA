package edu.ssafy.chap11.Dom;
import javax.xml.parsers.*;
import org.w3c.dom.*;
public class DOMTest01 {
   public static void main(String args[]) throws Exception {
      DocumentBuilderFactory dbf
         = DocumentBuilderFactory.newInstance();
      DocumentBuilder parser = dbf.newDocumentBuilder();
      Document xmldoc = parser.parse("addr.xml");
      Element root = xmldoc.getDocumentElement(); //노드를 상속받고있음 > 주소록이라는 애가 나옴 (key ,value)로 되어있음 
      System.out.println(root.getNodeName()+root.getNodeValue()); //name이 주소록 //value는 null
   }
}

