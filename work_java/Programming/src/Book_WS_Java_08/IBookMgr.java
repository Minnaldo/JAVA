package Book_WS_Java_08;

import java.util.ArrayList;
import java.util.List;

public interface IBookMgr {
	
	/**도서 최초 입력 기능 */
	//+ add(b: Book) : void
	public void addBook(Book b);
	
	
	/**전체 도서 정보 출력 기능 */
	//search() : List<Book>
	public ArrayList<Book> search();
	
	/** 도서가 판매되어 재고 수량을 빼는 기능 */
	//+sell(isbn:String, quantity:int) throws QuantityException, ISBNNotFoundException: void
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;
	
	/** 도서가 구매되어 재고 수량을 더하는 기능  */
	//+buy(isbn:String, quantity:int) throws ISBNNotFoundException: void
	public void buy(String isbn, int quantity) throws ISBNNotFoundException;
	
	/**getTotalAmount(): int */
	//재고 도서들의  (수량*금액)을 하여 총 재고 금액을 구하여 리턴
	public int getTotalAmount();
	
	/**+open() */
	//클래스 생성시에 호출되어 지며, 파일("book.dat")에 저장된 파일을 읽어서 ArrayList에 저장한다.
	public void open();
	
	/**+close() */
	//프로그램 종료시에 호출되어지며, ArrayList에 있는 도서 정보를 파일로 저장한다.
	public void close();
	
}