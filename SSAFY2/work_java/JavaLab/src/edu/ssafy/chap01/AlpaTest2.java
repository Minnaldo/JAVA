package edu.ssafy.chap01;

public class AlpaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alpa2 = 65;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5 - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				char calpa = (char)alpa2;
				System.out.print(calpa);
				alpa2++;
			}
			System.out.println();
		}
	}
}
