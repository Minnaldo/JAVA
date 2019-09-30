package Programmers;

import java.time.format.ResolverStyle;
import java.util.Arrays;
import java.util.Comparator;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution("Zbcdefg");
		
	}

	
	public static String solution (String s) {
	      String answer = "";
	      
	      Character[] ch = new Character[s.length()];
	      for(int i = 0; i < s.length(); i++) {
	    	  ch[i] = s.charAt(i);
	      }
	      
	      Arrays.sort(ch,new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
	      
//	      StringBuffer strbuffer = new StringBuffer();
//	      strbuffer.append(ch).reverse();
	      
	      for(int i = s.length()-1; i >= 0; i--)
	      {
	    	  answer += ch[i];
	      }
	      
	      
	      return answer;
	  }
}
