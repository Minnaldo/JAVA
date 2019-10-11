import java.io.*;
import java.util.*;
public class 염라대왕의이름정렬_근열 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());	//테스트케이스
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());	//이름 개수
            
        //TreeSet : Set인터페이스를 구현해서  / 데이터의 저장을 허용하지 않으며, 정렬된 위치에 저장하므로 저장 순서를 유지하지도 않는다.
            
        //자바 컬렉션에서 제공하는 Set 인터페이스는 순서를 유지하지 않는 데이터의 집합.
        //Map 구조와 달리 Set 구조는 중복을 허용하지 않는다!!!
            HashSet<String> set = new HashSet<>();  //중복 제거하기 위해 HashSet을 사용.		
            for (int i = 0; i < N; i++) {
                set.add(br.readLine());			//Hashset에 입력.
            }
            LinkedList<String> list = new LinkedList<>();	//LinkedList LinkedList에서 데이터를 추가, 삭제할 때 주솟값만 바꿔주기 때문에 빠르다.
            list.addAll(set);	//리스트에 한번에 집어넣는다.
            
            //Collections.sort
            //list.sort(new Comparator<String>() {	
            Collections.sort(list, new Comparator<String>() {	//Comparator 사용방법			
                @Override
                public int compare(String o1, String o2) {	
                    /*if(o1.length()==o2.length()) {				//문자열 길이가 같을경우,
                        int len = o1.length();					
                        for (int i = 0; i < len; i++) {			//문자열 길이만큼 반복문
                            if(o1.charAt(i)!=o2.charAt(i))		//한글자씩 비교해가면서 같지 않으면
                                return o1.charAt(i)-o2.charAt(i);	//오름차순으로
                        }
                    }*/
                	if(Integer.compare(o1.length(), o2.length()) == 0)
                		return o1.compareTo(o2);		//compareTo를 하면  얘가 자동으로 사전순으로 정렬해줌.
                    return Integer.compare(o1.length(), o2.length());					
                }
            });
            bw.write("#"+tc+"\n");
            for (String str : list) {
                bw.append(str+"\n");
            }
            bw.flush();
        }
    }
}


