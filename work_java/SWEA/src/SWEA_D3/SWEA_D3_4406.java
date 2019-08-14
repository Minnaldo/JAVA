//SWEA_D3_4406. 모음이 보이지 않는 사람.
package SWEA_D3;

import java.util.ArrayList;
import java.util.Scanner;

public class SWEA_D3_4406 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			ArrayList<Character> list = new ArrayList<>();
			char[] c = str.toCharArray();
						
			for(int i = 0; i < str.length(); i++)
			{
				list.add(str.charAt(i));
			}
			
			for(int i = 0; i < list.size(); i++)
			{
				if(list.get(i) == 'a' || list.get(i) == 'e' || list.get(i) == 'i' || list.get(i) == 'o' || list.get(i) == 'u')
				{
					list.remove(i);
					i--;
				}
			}
						
			System.out.print("#" + tc + " ");
			for(int i = 0; i < list.size(); i++)
			{
				System.out.print(list.get(i));
			}
			System.out.println();
		}
	}

}
