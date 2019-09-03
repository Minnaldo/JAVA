package edu.ssafy.chap11.Dom;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOMTest04 {
   public static void main(String args[]) throws Exception {
      DocumentBuilderFactory dbf
         = DocumentBuilderFactory.newInstance();
      DocumentBuilder parser = dbf.newDocumentBuilder();
      Document xmldoc = parser.parse("addr.xml");
      Element root = xmldoc.getDocumentElement();
      getNode(root);
   }
   //����� �ڽ�(child)��带 ã�ư���
   public static void getNode(Node n) {
      for(Node ch = n.getFirstChild();ch != null;ch = ch.getNextSibling()) {
         //������Ʈ ������ ���
         if(ch.getNodeType() == Node.ELEMENT_NODE) {//노드의 type이 Element노드인 애들만 Test3처럼  공백(#text)이 안나옴 
            System.out.println(ch.getNodeName());
         }
      }
   }
}

