package AD;

import java.time.format.ResolverStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Comparator_Test {

	static class info{
		int a;
		public info(int a) {
			// TODO Auto-generated constructor stub
			this.a=a;
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,7,2,0,1};
		LinkedList<Integer> li=new LinkedList<>();
		li.add(10);
		li.add(0);
		li.add(9);
		li.add(5);
		li.add(1);

		Arrays.sort(arr);
		
		Collections.sort(li);

		info[] infoArr=new info[3];
		infoArr[0]=new info(10);
		infoArr[1]=new info(5);
		infoArr[2]=new info(7);
//
//		Arrays.sort(infoArr,new Comparator<info>() {
//			@Override
//			public int compare(info o1, info o2) {
//				// TODO Auto-generated method stub
//				return o1.a-o2.a;
//			}
//		});
		Arrays.sort(infoArr,new Comparator<info>() {

			@Override
			public int compare(info o1, info o2) {
				// TODO Auto-generated method stub
				return o1.a-o2.a;
			}
		});
		for (int i = 0; i < infoArr.length; i++) {
			System.out.println(infoArr[i].a);
		}
		System.out.println("==============");


		LinkedList<info> li2=new LinkedList<>();
		li2.add(new info(99));
		li2.add(new info(11));
		li2.add(new info(22));

		Collections.sort(li2, new Comparator<info>() {

			@Override
			public int compare(info o1, info o2) {
				// TODO Auto-generated method stub
				return o2.a-o1.a;
			}
		});
		
		for (info info : li2) {
			System.out.println(info.a);    
		}

	}

}