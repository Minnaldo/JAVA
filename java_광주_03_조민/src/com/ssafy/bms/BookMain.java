package com.ssafy.bms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {
	Scanner s = new Scanner(System.in);
	IBookMgr mgr = BookMgrImpl.getInstance();   
	Book books = null;
	
	List<Book> list = new ArrayList<>();

	public static void main(String[] args) {
		BookMain m = new BookMain();
		int num=0;
		while(true) {
			num=m.menu();
			if(num==0) 
				break;
			switch (num)
			{
				case 1:
					m.insert();
					break;
				case 2:
					m.search();
					break;
				case 3:
				try {
					m.searchIsbn();
				} catch (RecordNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
				case 4:
					m.searchTitle();
					break;
				case 5:
					m.update();
					m.search();
					break;
				case 6:
					m.delete();
					m.search();
					break;
				case 7:
					m.save();
					break;
				case 8:
					m.load();
					m.search();
					break;
				case 9:
					m.sortIsbn();
					break;
				case 10:
					m.countWord();
					break;
			}//end switch
			
		}//end while
	}
	public  int menu() {
		int result=0;
		System.out.println("==================================");
		System.out.println("========== 도서 관리 프로그램 ===========");
		System.out.println("==================================");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록 보기");
		System.out.println("3. 도서 검색(ISBN으로 검색)");
		System.out.println("4. 도서 검색(도서명으로 검색)");
		System.out.println("5. 도서 수정");
		System.out.println("6. 도서 삭제");
		System.out.println("7. 도서 정보 파일 저장");
		System.out.println("8. 도서 정보 파일로 부터 읽어오기");
		System.out.println("9. ISBN으로 정렬해서 목록보기");
		System.out.println("10.도서명 중 가장 빈도수 높은 단어 구하기");
		System.out.println("0. 종료");
		System.out.println("원하는  번호를 선택 하세요.");
		result=Integer.parseInt(s.nextLine());
		return result;
		
	}
    public void insert(){
    	System.out.println("도서 정보를 입력하세요. 형식:ISBN,도서명,저자,금액");
    	String[] info=s.nextLine().split(",");
    	
    	int price = Integer.parseInt(info[3]);
    	
//    	mgr.add(new Book(info[0], info[1], info[2], price));
    	
    	
    }
    public void search() {
    	System.out.println(">>>>>>>>  도서 목록 보기 ");

    	// 구현하세요.
    	mgr.search();
    	
    }
    public void searchIsbn() throws RecordNotFoundException {
    	System.out.println(">>>>>>>>  도서  검색 (ISBN으로 검색) ");
    	System.out.println("검색하고자하는 ISBN을 입력하세요.");
    	String isbn=s.nextLine();

    	// 구현하세요.
    	mgr.search(isbn);
    	
    }
    public void searchTitle() {
    	System.out.println(">>>>>>>>  도서  검색 (이름으로 검색) ");
    	System.out.println("검색하고자하는 이름을 입력하세요.");
    	String title=s.nextLine();

    	// 구현하세요.
    	
    	
    }
    public void update() {
    	System.out.println(">>>>>>>>  도서  수정 ");
    	System.out.println("수정하고자하는 ISBN,부서을 입력하세요.");
    	String[] info=s.nextLine().split(",");

    	// 구현하세요.
    	
    	
    }
    public void delete() {
    	System.out.println(">>>>>>>>  도서  삭제 ");
    	System.out.println("삭제하고자하는 ISBN을 입력하세요.");
    	String isbn=s.nextLine();

    	// 구현하세요.
    	try {
			mgr.delete(isbn);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    public void save() {
    	System.out.println(">>>>>>>>  도서  정보 저장 ");
    	
    	// 구현하세요.
    	mgr.save();
    	
    }
    public void load() {
    	System.out.println(">>>>>>>>  도서  정보 읽어오기 ");

    	// 구현하세요.
    	mgr.load();
    	
    }
    public void sortIsbn() {
    	System.out.println(">>>>>>>>  도서ISBN로 정렬하기 ");

    	// 구현하세요.
    	List<Book> bs = mgr.sortIsbn();
    	for(Book e : bs)
    	{
    		System.out.println(e);
    	}
    	
    }
    public void countWord() {
    	System.out.println(">>>>>>>>  빈도수 높은 단어 구하기 ");
    	
    	// 구현하세요.
    	
    	
    }

}
