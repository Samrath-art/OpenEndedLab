package OEL;

import java.util.Scanner;

public class LibraryCatalogApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryCatalog catalog = new LibraryCatalog(10);

        // Adding books to the catalog
        catalog.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        catalog.addBook("1984", "George Orwell", 1949, "Dystopian");
        catalog.addBook("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");

        // Asking the user for input
        System.out.println("Welcome to the Library Catalog!");
        System.out.println("1. Search by title");
        System.out.println("2. Search by author");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input

        if (choice == 1) {
            System.out.print("Enter the title of the book: ");
            String title = scanner.nextLine();
            Book book = catalog.searchBookByTitle(title);
            if (book != null) {
                System.out.println("Found: " + book.title + " by " + book.author);
            } else {
                System.out.println("Book not found.");
            }
        } else if (choice == 2) {
            System.out.print("Enter the author of the book: ");
            String author = scanner.nextLine();
            Book book = catalog.searchBookByAuthor(author);
            if (book != null) {
                System.out.println("Found: " + book.title + " by " + book.author);
            } else {
                System.out.println("Book not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        // Display all books sorted by title
        catalog.displayBooks();

        scanner.close();
    }
}

