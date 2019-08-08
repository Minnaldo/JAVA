package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 우선순위프린터큐_Solution {
   static class Document{
       int idx;
       int priority;
       Document(int _idx, int _priority){
           this.idx = _idx;
           this.priority =_priority;
       }
   }
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int tc=0; tc<t; tc++) {
           int N = sc.nextInt();//문서의 수 <=100
           int M = sc.nextInt();//알고싶은 문서의 순서
           int[] parr = new int[10];
           Queue<Document> queue = new LinkedList<>();//Document에 대한 큐
           for(int i=0; i<N; i++) {
               int idx=i;
               int priority = sc.nextInt();
               parr[priority]++;
               Document d = new Document(idx, priority);
               queue.add(d);
           }
           // 위와 같이 큰 우선순위부터 반복을 하면서 순서가 M인 녀석이 나오면 종료
           //지금까지 몇개가 출력됐는지 저장할 면수.
           int cnt =0;
           //현재 검사하는 우선순위...
           int idx = 9;
           while(true) {
               if(parr[idx]==0) {
                   idx--;
                   if(idx==0)
                       break;
               }
               else {
                   Document d = queue.poll();
                   //현재 검사하는 우선순위에 일치하는 문서라면
                   if(d.priority == idx) {
                       //출력했으니 카운트 하나 세고, 해당 우선순위 문서 수를 하나 줄임
                       cnt++;
                       parr[idx]--;
                       //그 놈이 찾던 놈이면 반복종료.
                       if(d.idx == M) {
                           break;
                       }
                   }
                   else {
                       //우선순위가 더 낮은 아이라면 뒤에가서 줄서.
                       queue.add(d);
                   }
               }
           }
           System.out.println(cnt);
       }
   }
}