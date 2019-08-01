package Algorithm_3WEEK;

import java.util.Scanner;

public class switch_ONOFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		int switch_num = sc.nextInt();
		int[] switch_status = new int[switch_num + 1];
		for (int i = 1; i <= switch_num; i++) {
			switch_status[i] = sc.nextInt();
		}

		int student_num = sc.nextInt();
		int student_sex[] = new int[student_num + 1];
		int get_num[] = new int[student_num + 1];
		// (1, 3)  (2, 3)

		//student_sex = 1 : 남  ,  student_sex = 2 :  여
		//남,여  숫자 입력.
		for(int i = 1; i <= student_num; i++)
		{
			student_sex[i] = sc.nextInt();
			get_num[i] = sc.nextInt();
		}

		for(int i = 1; i <= student_num; i++)
		{
			if(student_sex[i] == 1)			//남자면
			{
				for(int j = 1; j <= switch_num; j++)
				{

					if(j % get_num[i] == 0)
					{
						if(switch_status[j] == 0)
							switch_status[j] = 1;
						else
							switch_status[j] = 0;
					}
				}
			}

			else if(student_sex[i] == 2)	//여자면
			{
				if(switch_status[get_num[i]] == 0)
					switch_status[get_num[i]] = 1;
				else
					switch_status[get_num[i]] = 0;
					//get_num[i] == 3
					for(int k = 1; k <= switch_num; k++)
					{
						if(get_num[i]- k <1 || get_num[i] + k > switch_num) 
							break;
						if( (switch_status[get_num[i] - k]) == switch_status[(get_num[i]) + k])
						{
							if(switch_status[get_num[i] - k] == 0)
								switch_status[get_num[i] - k] = 1;
							else
								switch_status[get_num[i] - k] = 0;
							if(switch_status[get_num[i] + k] == 0)
								switch_status[get_num[i] + k] = 1;
							else
								switch_status[get_num[i] + k] = 0;
						}
					}
			}


		}
		for(int t = 1; t <= switch_num; t++)
		{
			System.out.print(switch_status[t] + " ");
			if( t % 20 == 0) 
				System.out.println();
		}
	}

}
