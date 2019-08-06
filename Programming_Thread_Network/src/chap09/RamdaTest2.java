package chap09;

public class RamdaTest2 {

	interface Calc
	{
		int cal(int a, int b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc add = new Calc()
		{
			public int cal(int a, int b)
			{
				return a + b;
			};
		};
		
		System.out.println(add.cal(4,2));
		
		Calc minus = new Calc()
		{
			public int cal(int a, int b)
			{
				return a - b;
			};
		};
		System.out.println(minus.cal(4, 2));
		
		Calc add2 = (a,b)-> {return a + b;};
		System.out.println(add2.cal(4, 3));
		
		Calc add3 = (a,b)-> a+b;
	}

}
