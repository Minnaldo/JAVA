package Scripts;

public class OperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 0;
			int y = 0;
			
		//	shortcut�� !!!!!!!   &  ,  &&  ���� ������ ����.
			
			// &������ �ϳ� �� ����,, �� ������ �����̾ x++ �� ���� ��.
			if ((2 > 5) & (x++ > y))
			{
				y++;
			}

			System.out.println("x = " + x + ", y = " + y);
			
			x = 0;
			y = 0;
			
			// && �����ڴ� �տ��� �����̸� �ڰ� ���� �ȵǴ� x++�� ���� �� ��.
			if((2 > 5) && (x++ > y))
				y++;
			System.out.println("x = " + x + ", y = " + y);
	}
	

}
