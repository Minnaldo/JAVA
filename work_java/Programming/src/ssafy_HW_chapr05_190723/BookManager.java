package ssafy_HW_chapr05_190723;

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
