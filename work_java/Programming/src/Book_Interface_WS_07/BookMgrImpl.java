package Book_Interface_WS_07;

public class BookMgrImpl implements IBookMgr
{
	private Book[] books = new Book[100];
//	private int max = 10;
	private int index = 0;

	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		books[index] = b;
		index++;
	}

	@Override
	public Book[] search() {
		// TODO Auto-generated method stub
		Book copy_Book[] = new Book[index];
		System.arraycopy(books, 0, copy_Book, 0, index);
		
		return copy_Book;
	}

	@Override
	public Book book_isbn(String isbn) {
		// TODO Auto-generated method stub
		int i;
		for(i = 0; i < index; i++)
		{
			if(books[i].getIsbn().equals(isbn))
			{
				break;
			}
		}
		
		return books[i];
	}

	@Override
	public Book book_title(String title) {
		// TODO Auto-generated method stub
		
		int i;
		for(i = 0; i < index; i++)
		{
			if(books[i].getTitle().equals(title))
			{
				break;
			}
		}
		
		return books[i];
	}

	@Override
	public Book book_publisher(String publisher) {
		// TODO Auto-generated method stub
		int i;
		for(i = 0; i < index; i++)
		{
			if(books[i].getPublisher().equals(publisher))
			{
				break;
			}
		}
		return books[i];
	}

	@Override
	public Book book_price(int price) {
		// TODO Auto-generated method stub
		int i;
		for(i = 0; i < index; i++)
		{
			if(books[i].getPrice() <= price)
			{
				break;
			}
		}
		return books[i];
	}

	@Override
	public Book[] searchBook() {
		// TODO Auto-generated method stub
		int cnt = 0, i = 0;
		for(i = 0; i < index; i++)
		{
			
			if(!(books[i] instanceof Magazine))
			{
				break;
			}
		}
		return books;
	}

	@Override
	public Book[] searchMagazine() {
		// TODO Auto-generated method stub
		int cnt = 0;;
		for(int i = 0; i < index; i++)
		{
			if(books[i] instanceof Magazine)
			{
				cnt++;
			}
		}
		
		Book[] copy_book = new Book[cnt];
		int j = 0;
		for(int i = 0; i < index; i++)
		{
			if(books[i] instanceof Magazine)
			{
				copy_book[j] = books[i];
				j++;
			}
		}
		
		return copy_book;
	}

	@Override
	public int sumPrice() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < index; i++)
		{
			sum += books[i].getPrice();
		}
		return sum;
	}

	@Override
	public int average_price() {
		// TODO Auto-generated method stub
		int sum = 0, cnt = 0;
		for(int i = 0; i < index; i++)
		{
			sum += books[i].getPrice();
			cnt++;
		}
		return sum / cnt;
	}

	@Override
	public Book[] search_price(int price) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		for(int i = 0; i < index; i++)
		{
			if (books[i].getPrice() <= price)
			{
				count++;
			}
		}
		
		Book[] underprice_book = new Book[count];
		int j = 0;
		for(int i = 0; i < index; i++)
		{
			if(books[i].getPrice() <= price)
			{
				underprice_book[j] = books[i];
				j++;
			}
		}
		return underprice_book;
	}

	@Override
	public void modiBook(Book b) {
		// TODO Auto-generated method stub
		for(int i = 0; i < index; i++)
		{
			if(books[i].getTitle().equals(b.getTitle()))
			{
				books[i] = books[index-1];
				index--;
			}
		}
	}

	@Override
	public void printBook() {
		// TODO Auto-generated method stub
		for(int i = 0; i < index; i++)
		{
			books[i].toString();
		}
	}
	
	
}
