package edu.ssafy.chap11.Dom;
import javax.xml.parsers.*;
import org.w3c.dom.*;
public class DOMTest02 {
   public static void main(String args[]) throws Exception {
      DocumentBuilderFactory dbf
         = DocumentBuilderFactory.newInstance(); //factory 
      DocumentBuilder parser = dbf.newDocumentBuilder(); //DocumentBuilder를 상속받는게 누구인지 
	  
	  System.out.println("parser class name : "+parser.getClass().getName()+"\n"); //sun에서 만든 documentBuilderImpl >> DocumentBuilder를 상속받고 있음 
     
	  Document xmldoc = parser.parse("addr.xml");
      Element root = xmldoc.getDocumentElement();
      System.out.println(root);
   }
}

