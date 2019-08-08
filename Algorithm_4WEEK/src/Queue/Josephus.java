package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> josepus = new ArrayList<Integer>();
		
		//기본값 세팅
		for(int i = 0; i < n; i++)
		{
			arr.add(i+1);
		}
		
		while(!arr.isEmpty())
		{
			temp = (temp + m - 1) % arr.size();
			josepus.add(arr.remove(temp));
		}
		
		System.out.print("<");
		for(int i = 0; i < n; i++)
		{
			System.out.print(josepus.get(i));
			
			if(i != n-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(">");
	}

}
