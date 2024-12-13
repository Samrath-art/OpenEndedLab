package OEL;
import java.util.Scanner;

class LibraryCatalog {
    Book[] catalog;
    int size;

    public LibraryCatalog(int capacity) {
        catalog = new Book[capacity];
        size = 0;
    }

    // Add a new book to the catalog
    public void addBook(String title, String author, int year, String genre) {
        if (size < catalog.length) {
            catalog[size++] = new Book(title, author, year, genre);
        } else {
            System.out.println("Catalog is full");
        }
    }

    // Search for a book by title
    public Book searchBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (catalog[i].title.equalsIgnoreCase(title)) {
                return catalog[i];
            }
        }
        return null; // book not found
    }

    // Search for a book by author
    public Book searchBookByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if (catalog[i].author.equalsIgnoreCase(author)) {
                return catalog[i];
            }
        }
        return null; // book not found
    }

    // Display all books sorted by title using Bubble Sort
    public void displayBooks() {
        // Simple Bubble Sort to sort books by title
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (catalog[j].title.compareToIgnoreCase(catalog[j + 1].title) > 0) {
                    // Swap the books
                    Book temp = catalog[j];
                    catalog[j] = catalog[j + 1];
                    catalog[j + 1] = temp;
                }
            }
        }

        System.out.println("Books in Catalog (sorted by title):");
        for (int i = 0; i < size; i++) {
            System.out.println(catalog[i].title + " by " + catalog[i].author + ", " + catalog[i].year + ", " + catalog[i].genre);
        }
    }
}

