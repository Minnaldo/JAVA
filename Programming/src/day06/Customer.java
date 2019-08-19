package day06;

public class Customer {
	String name;
	int age;

	
	
	//해쉬코트와 equals를 가지고 
	@Override
	public boolean equals(Object obj) 
	{
		if	(obj instanceof Customer)
		{
			Customer target = (Customer)obj;
			if(this.name.equals(target.name) && this.age == target.age) 
			{
				return true;
			}
		}
		
		return false;
	}
}
