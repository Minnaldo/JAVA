package edu.ssafy.chap11.Dom;
import javax.xml.parsers.*;
import org.w3c.dom.*;
public class DOMTest03 {
   public static void main(String args[]) throws Exception {
      DocumentBuilderFactory dbf
         = DocumentBuilderFactory.newInstance();
      DocumentBuilder parser = dbf.newDocumentBuilder();
      Document xmldoc = parser.parse("addr.xml");
      Element root = xmldoc.getDocumentElement();
    //  System.out.println(root);
        getNode(root);
   }
   //����� �ڽ�(child)��带 ã�� �޼���
   public static void getNode(Node n) {//element가 넘어온 것임 (element가 node를 상속받고 있는 업캐스팅임)
      for(Node ch = n.getFirstChild();ch != null;ch = ch.getNextSibling()) {//정보가 3개 나옴 
         System.out.println(ch.getNodeName()); //이름을 print하면 정보 #text는 text노드인 애(<정보></정보><정보>사이에 공백이 있는게 나온것...ㅎ>  
      }
   }
}

