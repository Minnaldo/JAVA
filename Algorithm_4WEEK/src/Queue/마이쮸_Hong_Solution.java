package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/* 사람이 와서 줄선다.  처음엔 1
 * 줄에서 가장 앞에 놈 나와서  갯수만큼 마이쮸를 먹는다.
 * 먹었으면 갯수를 하나 더 늘려서 뒤에 줄선다.
 * 새로운 사람이 와서 줄선다.
 * 
 * 각줄에는 고놈이 몇번사람이고, 몇개인지에 대한 상태 정보 필요!
*/
public class 마이쮸_Hong_Solution {

	static class Person {
		int num;
		int cnt;
		int sum;
		Person(int n, int c) {
			num = n;
			cnt = c;
		}
		public String toString()
		{
			return num + "번 먹은 갯수 : " + sum;
		}
	}
	
	public static void main(String[] args) {
		int nextNum = 1;
		Queue<Person> queue = new LinkedList<>();
		int mychuCnt = 20;
		Person p = null;
		while(true) {
			queue.add(new Person(nextNum++, 1));
			p = queue.poll();
			p.sum += (p.cnt > mychuCnt ? mychuCnt : p.cnt);		//먹은개수
			mychuCnt -= p.cnt;
			p.cnt++;
			
			queue.add(p);
			if( mychuCnt <= 0 )
				break;
		}
		System.out.println(p.num);
		
		for(Person pp : queue)
		{
			System.out.println(pp);
		}
	}

}
