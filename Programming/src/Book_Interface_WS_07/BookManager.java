package Book_Interface_WS_07;

public class BookManager {
	private Book[] books = new Book[100];
//	private int max = 10;
	private int index = 0;
	
	public BookManager()
	{
//		books = new Book[max];
	}
	
	public void addBook(Book b)
	{
//		if (index < max)
//		{
			books[index] = b;
			index++;
//		}
//		else
//		{
//			Book[] temp = new Book[max * 2];
//			max *= 2;
//			System.arraycopy(books, 0, temp, 0, books.length);
//			books = temp;
//		}
	}
	
	public Book[] search()
	{
		Book copy_Book[] = new Book[index];
		System.arraycopy(books, 0, copy_Book, 0, index);
		return copy_Book;
	}
	
	
	public Book book_isbn(String isbn)
	{
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
	
	public Book book_title(String title)
	{
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
	
	public Book book_publisher(String publisher)
	{
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
	
	public Book book_price(int price)
	{
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
	
	public Book[] searchBook()
	{
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
	
	
	public Book[] searchMagazine()
	{
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
	
	public int sumPrice()
	{
		int sum = 0;
		for (int i = 0; i < index; i++)
		{
			sum += books[i].getPrice();
		}
		
		return sum;
	}
	
	public int average_price()
	{
		int sum = 0, cnt = 0;
		for(int i = 0; i < index; i++)
		{
			sum += books[i].getPrice();
			cnt++;
		}
		
		return sum / cnt;
	}
	
	public Book[] search_price(int price)
	{
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
	
	public void modiBook(Book b)
	{
		for(int i = 0; i < index; i++)
		{
			if(books[i].getTitle().equals(b.getTitle()))
			{
				books[i] = books[index-1];
				index--;
			}
		}
	}
	
	public void printBook()
	{
		for(int i = 0; i < index; i++)
		{
			books[i].toString();
		}
	}
	
}
