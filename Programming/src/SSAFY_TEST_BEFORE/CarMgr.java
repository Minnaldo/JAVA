package SSAFY_TEST_BEFORE;

import java.util.Arrays;

import ssafy_HW_chapr05_190723.Book;

public class CarMgr {
	private Car[] cars = new Car[100];
	private int index;
	
//	public Car(String num, String model, int price)
	
	private CarMgr() {}
	
	private static CarMgr instance;
	
	public static CarMgr getInstance()
	{
		if ( instance == null)
			instance = new CarMgr();
		
		return instance;
	}
	
	//* 파라미터로 전달된 차량 정보를 배열에 저장 */
	public void add(Car c)
	{
		cars[index] = c;
		index++;
	}
	
	/** 현재 저장된 모든 차량 정보를 리턴. */
	public Car[] search()
	{
		//내가 찾고자 하는 index 까지만 정보 리턴하기 위해
		//index 크기만큼 새로운 배열을 생성.
		Car totalCar[] = new Car[index];
		System.arraycopy(cars, 0, totalCar, 0, index);
		return totalCar;
	}
	
	//* 파라미터로 전달된 번호와 같은 차량 정보 리턴. */
	public Car search(String num)
	{
		int i;
		for(i = 0; i < index; i++)
		{
			if(cars[i].getNum().equals(num))
				break;
		}
		return cars[i];
	}
	
	//* 파라미터로 전달된 가격보다 작은 차량 정보 리턴. */
	public Car[] search(int price)
	{
		int i, j = 0, cnt = 0;
		
		for(i = 0; i < index; i++)
		{
			if(cars[i].getPrice() <= price)
			{
				cnt++;
			}
		}
		
		Car underprice[] = new Car[cnt];
		for(i = 0; i < index; i++)
		{
			if(cars[i].getPrice() <= price)
			{
				underprice[j] = cars[i];
				j++;
			}
		}
		
		return underprice;
	}
	
	//* 파라미터로 전달된 번호의 차량을 검색하여 가격을 수정*/
	public void update(String num, int price)
	{
		int i;
		for(i = 0; i < index; i++)
		{
			if(cars[i].getNum().equals(num))
				cars[i].setPrice(price);
		}
		
	}
	
	//* 파라미터로 전달된 번호의 차량을 삭제. */
	public void delete(String num)
	{
		int i;
		for(i = 0; i < index; i++)
		{
			if(cars[i].getNum().equals(num))
			{
				cars[i] = cars[index-1];
				index--;
			}
		}
	}
	
	//* 배열에 저장된 차량 대수를 리턴. */
	public int size()
	{
		return index;
	}
	
	
	//* 배열에 저장된 차량의 금액 합계를 계산하여 리턴한다. */
	public int totalPrice()
	{
		int i = 0, sum = 0;
		for(i = 0; i < index; i++)
		{
			sum += cars[i].getPrice();
		}
		return sum;
	}
	
}
