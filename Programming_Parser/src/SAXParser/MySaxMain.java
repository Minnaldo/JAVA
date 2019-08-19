package SAXParser;

import java.util.ArrayList;

public class MySaxMain {
	public static void main(String[] args){

        ArrayList<Check> list=new MySAXParser().getContent("http://127.0.0.1:8080/result.xml");
//		ArrayList<Check> list=new MySAXParser().getContent("loaclhost/result.xml");
        for(  Check c: list){
        	System.out.println(c);
        }
    }
}