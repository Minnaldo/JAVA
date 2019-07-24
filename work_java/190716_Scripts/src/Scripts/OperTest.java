package Scripts;

public class OperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 0;
			int y = 0;
			
		//	shortcut룰 !!!!!!!   &  ,  &&  시험 무조건 나옴.
			
			// &연산자 하나 일 때는,, 앞 조건이 거짓이어도 x++ 가 실행 됨.
			if ((2 > 5) & (x++ > y))
			{
				y++;
			}

			System.out.println("x = " + x + ", y = " + y);
			
			x = 0;
			y = 0;
			
			// && 연산자는 앞에가 거짓이면 뒤가 실행 안되니 x++가 실행 안 됨.
			if((2 > 5) && (x++ > y))
				y++;
			System.out.println("x = " + x + ", y = " + y);
	}
	

}
