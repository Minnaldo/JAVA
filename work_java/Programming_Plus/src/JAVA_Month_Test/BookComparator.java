package JAVA_Month_Test;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		
		return Integer.parseInt(o1.getIsbn()) - Integer.parseInt(o2.getIsbn());			//오름차순;
//		return Integer.parseInt(o1.getIsbn()) - Integer.parseInt(o2.getIsbn()) * -1;	//내림차순;
	}

}
