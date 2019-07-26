package SSAFY_TEST_BEFORE;

import java.util.Scanner;

public class CarTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarMgr cartest = CarMgr.getInstance();
		
		
//		CarMgr cartest = new CarMgr();
		Car car_information[] = new Car[100];
		
		car_information[0] = new Car("11","쏘나타", 1100);
		car_information[1] = new Car("21","그랜져", 2100);
		car_information[2] = new Car("31","제네시스", 3100);
		car_information[3] = new Car("41","쏘나타", 4100);
		car_information[4] = new Car("51","쏘나타", 5100);
		
		cartest.add(car_information[0]);
		cartest.add(car_information[1]);
		cartest.add(car_information[2]);
		cartest.add(car_information[3]);
		cartest.add(car_information[4]);
		
		
		Car[] cars = cartest.search();
		for(int i=0; i < cars.length; i++) {
			System.out.println(cars[i].toString());
		}
		
//		for (Car car : cartest.search()) {
//			System.out.println(car.toString());
//		}
		
		System.out.println("1:차량번호검색");
		System.out.println("2:원하는 가격이하 차량검색");
		System.out.println("3:원하는 차량번호, 가격->수정");
		System.out.println("4:원하는 차량 삭제");
		System.out.println("5:차량 대수 리턴");
		System.out.println("6:배열에 저장된 차양의 금액 합계");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String num;
		int price;
		switch(a) {
		case 1:
			num = sc.next();
			Car cars0 = cartest.search(num);
			System.out.println(cars0.toString());
			break;
		case 2:
			price = sc.nextInt();
			
			Car[] cars1 = cartest.search(price);
			for(int i=0; i < cars1.length; i++) {
				System.out.println(cars1[i].toString());
			}		
			break;
		case 3:
			num = sc.next();
			price = sc.nextInt();
			cartest.update(num, price);
			
			Car[] cars2 = cartest.search();
			for(int i=0; i < cars2.length; i++) {
				System.out.println(cars2[i].toString());
			}
			break;
		case 4:
			num = sc.next();
			cartest.delete(num);
			
			Car[] cars3 = cartest.search();
			for(int i = 0; i < cars3.length; i++)
			{
				System.out.println(cars3[i].toString());
			}
			break;
		case 5:
			System.out.println(cartest.size());
			break;
		case 6:
			System.out.println(cartest.totalPrice());
			break;
		}
		
		
		
		
		
		
		
	}
}
