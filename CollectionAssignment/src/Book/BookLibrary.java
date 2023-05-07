package Book;
import java.util.*;
public class BookLibrary {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("How many books you wants to add in the library");
		int choice = ch.nextInt(); 
		Book[] b = new Book[choice];
		
		for(int i=0; i<choice;i++) {
			System.out.println("Enter Book "+(i+1)+" Details");
			Scanner bookScan = new Scanner(System.in);
			
			System.out.println("Enter book Id");
			int id = bookScan.nextInt();
			
			System.out.println("Enter book Name");
			String book_name = bookScan.next();
			
			System.out.println("Enter book Price");
			float book_price = bookScan.nextFloat();
			
			System.out.println("Enter book Author");
			String book_author = bookScan.next();
			
			System.out.println("Enter book Pages");
			int book_pages = bookScan.nextInt();
			b[i]=new Book(id,book_name,book_price,book_author,book_pages);
		}
		ArrayList<Book> li = new ArrayList<Book>();
		
		for(int i=0; i<choice;i++) {
			li.add(b[i]);
		}
		Iterator<Book> i = li.iterator();
		System.out.println("-----Books in the Library-----");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
/*int book_id;
	String book_name;
	float book_price;
	String author_name;
	int book_pages;*/


/*Q 3 Write program for maintaining book record of library .
use ArrayList Class to hold an multiple book record and display all book record using iterator .
b) traverse arraylist and store each book record in class object and display book name 
*/
