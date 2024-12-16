package OEL;
import java.util.Scanner;
public class Stack {
    private Book[] stack;
    private int size;

    public Stack(int capacity) {
        stack = new Book[capacity];
        size = 0;
    }

    // Push a book onto the stack
    public void push(String title, String author, int year, String genre) {
        if (size >= stack.length) {
            System.out.println("Stack is full!");
            return;
        }
        stack[size++] = new Book(title, author, year, genre);
    }

    // Pop a book from the stack
    public Book pop() {
        if (size == 0) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[--size];
    }

    // Peek the top book in the stack
    public Book peek() {
        if (size == 0) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[size - 1];
    }

    // Display all books in the stack
    public void displayBooks() {
        System.out.println("Books in Stack:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(stack[i].title + " by " + stack[i].author + ", " + stack[i].year + ", " + stack[i].genre);
        }
    } public Book peekByTitleOrAuthor(String searchQuery) {
        for (int i = size - 1; i >= 0; i--) {
            if (stack[i].title.equalsIgnoreCase(searchQuery) || stack[i].author.equalsIgnoreCase(searchQuery)) {
                return stack[i];
            }
        }
        System.out.println("No book found with the title or author: " + searchQuery);
        return null;
    }
}