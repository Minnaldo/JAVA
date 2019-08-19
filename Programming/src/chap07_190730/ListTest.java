package chap07_190730;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*list는 Hashset과는 다르게 순서와 중복이 있다.
		List list = new ArrayList();
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(90);
		list.add(90);
		list.get(3);
		
		//[30, 40, 20, 90]
		System.out.println(list.toString());
		
		
		for(Object object : list)
		{
			System.out.println(object);
		}
		//30
		//40
		//20
		//90
		
		
		//* list도 배열처럼 인덱스 0부터 시작
		System.out.println("===========================");
		System.out.println(list.get(1));
		
		
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
	}

}
