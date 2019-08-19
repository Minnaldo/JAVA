package chap07_190730;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import SSAFY_TEST_BEFORE.Car;

public class setTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** 순서 : x  중복 : x  (순서,중복 허용 X) */
		/** 서울,광주,구미,대전,광주    로 저장해도 4가지만 나온다. */
//		HashSet set = new HashSet();
		
		//Hashset을 Set or Collection 으로 바꿔도 된다.
		//상속 때문에?!
//		Set set1 = new HashSet();
//		Collection set2 = new HashSet();

		
		TreeSet set = new TreeSet();
		//Object로 업캐스팅 돼서 저장된다.
		set.add("Seoul");
		set.add("Gwangju");
		set.add("Gumi");
		set.add("Daejeon");
		set.add("Gwangju");
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.toString());
		
		for(Object o : set)
		{
			//String의 toString이 호출됩니다.
			System.out.println(o.toString());
		}
		Set<Car> set2 = new TreeSet();
		set2.add(new Car());
		set2.add(new Car());
		set2.add(new Car());
		
		for(Car car : set2)
		{
			System.out.println(car.toString());
		}
	}

}
