package Book;

public class Book {
	int book_id;
	String book_name;
	float book_price;
	String author_name;
	int book_pages;
	
	public Book(int book_id,String book_name,float book_price,String author_name,int book_pages) {
		this.book_id 		= book_id;
		this.book_name 		= book_name;
		this.book_price 	= book_price;
		this.author_name 	= author_name;
		this.book_pages 	= book_pages;
	}
	
	public String toString() {
	return "Book id: "+book_id
			+"| Name: "+book_name+"| Price: "+book_price+"| Author: "+author_name+"| Pages: "+book_pages;
	}
}
