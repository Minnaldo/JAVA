package Scripts;


public class WS_Array_03_Chomin_Problem1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34, 23, 64, 25, 12, 75, 22, 88, 53, 37};
		int arr_sum = 0; 
		//print()
		for (int i = 0; i < arr.length; i++)
		{	
			System.out.print(arr[i] + " ");
		}
		
		//total()
		System.out.println();
		System.out.print("배열의 합 : ");
		for (int i = 0; i < arr.length; i++)
		{
			arr_sum = arr_sum + arr[i];
		}
		System.out.println(arr_sum);
		
		
		int arr_sum2 = 0;
		int arr_avr = 0;
		//average()
		System.out.print("배열의 평균 : ");
		for (int i = 0; i < arr.length; i++)
		{
			arr_sum2 = arr_sum2 + arr[i];
			arr_avr = arr_sum2 / arr.length;
		}
		System.out.println(arr_avr);
		
		
		int arr_minimum = 100000;
		//minimum()
		System.out.print("배열의 최소값 : ");
		for (int i = 0; i < arr.length; i++)
		{
			if ( arr_minimum > arr[i] )
				arr_minimum = arr[i];
		}
		System.out.println(arr_minimum);
	}
	
}
