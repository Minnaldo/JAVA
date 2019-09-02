package Baekjoon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 보물_깨달음 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] brr = new int[N];
		int[] crr = new int[N];

		for(int i = 0; i < N; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++)
		{
			brr[i] = sc.nextInt();
		}

		Integer[] integerArr = Arrays.stream(arr).boxed().toArray( Integer[]::new );
		Arrays.sort(integerArr, Comparator.reverseOrder());

		Arrays.sort(brr);

		int sum = 0;
		for(int i = 0; i < N; i++)
		{

			sum += integerArr[i]*brr[i];
//			System.out.println(brr[i]);
//			System.out.println(sum);
		}

		System.out.println(sum);
	}

}
