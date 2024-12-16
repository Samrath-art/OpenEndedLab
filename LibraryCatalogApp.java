package OEL;
import java.util.Scanner;
public class LibraryCatalogApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Stack catalog = new Stack(10);

        // Adding books to the stack
        catalog.push("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        catalog.push("1984", "George Orwell", 1949, "Dystopian");
        catalog.push("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");

        // Display all books in the stack (LIFO order)
        catalog.displayBooks();

        System.out.println("\nEnter title or author to peek:");
        String searchQuery = scanner.nextLine();

        Book foundBook = catalog.peekByTitleOrAuthor(searchQuery);
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook.title + " by " + foundBook.author + ", " + foundBook.year + ", " + foundBook.genre);
        }

        scanner.close();
    }}

