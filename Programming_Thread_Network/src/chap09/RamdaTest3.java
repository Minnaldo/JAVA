package chap09;

import chap09.RamdaTest2.Calc;

public class RamdaTest3 {
	
	public static void main(String[] args) {
		Calc c = (a,b)->a*b;
		Printer p = s->System.out.println(s);
		
		p.print(c.cal(3, 5) + "");
	}
	
}
