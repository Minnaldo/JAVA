package ssafy_HW_chapr05_190723;

public class BookManager {
	private Book[] books;
	private int max = 10;
	private int index = 0;
	
	public BookManager()
	{
		books = new Book[max];
	}
	
	public void addBook(Book b)
	{
		if (index < max)
		{
			books[index] = b;
			index++;
		}
		else
		{
			Book[] temp = new Book[max * 2];
			max *= 2;
			System.arraycopy(books, 0, temp, 0, books.length);
			books = temp;
		}
	}
	
	public void modiBook(Book b)
	{
		for(int i = 0; i < index; i++)
		{
			if(books[i].getTitle() == b.getTitle())
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
