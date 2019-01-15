import java.util.*;

public class Main {

	public static void main(String args[]) {
		ArrayList<Book> books = new ArrayList<Book>();
		Book objectBook = new Book("Objectbook", 2000);
		books.add(objectBook);

		if (books.contains(objectBook)) {
		    System.out.println("The object book was found.");
		}

		objectBook = new Book("Objectbook", 2000);

		if (!books.contains(objectBook)) {
		    System.out.println("The object book was not found.");
		}
	}
}