package chap07_190730;

import java.io.Serializable;

public class Car implements Comparable<Car>, Serializable{
	String num;
	int price;
	
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		if(o != null)
		{
			/** 음수 or 양수 or 0 */
			//음수가 나오면 바꿔라
			return o.price - price;
		}
		return 0;
	}
	
	public Car()
	{
		
	}
	
	
	public Car(String num, int price)
	{
		this.num = num;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}
	
}
