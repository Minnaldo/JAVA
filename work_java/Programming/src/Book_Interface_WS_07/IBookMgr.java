package Book_Interface_WS_07;

public interface IBookMgr {

	public void addBook(Book b);
	public Book[] search();
	public Book book_isbn(String isbn);
	public Book book_title(String title);
	public Book book_publisher(String publisher);
	public Book book_price(int price);
	public Book[] searchBook();
	public Book[] searchMagazine();
	public int sumPrice();
	public int average_price();
	public Book[] search_price(int price);
	public void modiBook(Book b);
	public void printBook();
	
	
}
