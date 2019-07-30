package chap07_190730;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = new Car[5];
		cars[0] = new Car("1111", 5000);
		cars[1] = new Car("5555", 6900);
		cars[2] = new Car("2222", 3900);
		cars[3] = new Car("4444", 8900);
		cars[4] = new Car("3333", 2900);
		
		
		//이렇게만 돌리면 에러뜬다.
		//어떤 기준으로 정렬을 하라는거야?
		//Car 클래스에 Comparable<Car>를 implements 해주고
		//compareTo(Car o) 오버라이드 해서 재정의 해줌.
//		Arrays.sort(cars);
		
		//내가 Car클래스에 Comparable<Car>를 구현하지 않아도
		//Comparator가 해준다.
		Comparator<Car> com = new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o1.price - o2.price;
			}
		};
		
		Arrays.sort(cars);
		
		for (Car car : cars)
		{
			System.out.println(car.toString());
		}
		
		
		System.out.println("=========================");
		
		
		ArrayList<Car> list = new ArrayList();
		list.add(new Car("1111", 5000));
		list.add(new Car("5555", 6900));
		list.add(new Car("2222", 3900));
		list.add(new Car("4444", 8900));
		list.add(new Car("3333", 2900));
		
		Collections.sort(list, com);
		for (Car car : list)
		{
			System.out.println(car.toString());
		}
		
	}
}
