package assignment;

import java.util.*;

/*
Question 41:
Create BookStore class with bookId and bookName.
Sort using Comparator by bookName and then bookId.
*/

class BookStore {
    private int bookId;
    private String bookName;

    public BookStore(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName;
    }
}

public class Question41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookStore> books = new ArrayList<>();

        System.out.print("How many books to enter? ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter details for Book " + i + ":");
            System.out.print("Book ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Book Name: ");
            String name = scanner.nextLine();

            books.add(new BookStore(id, name));
        }

        // Sort by Book Name
        books.sort(Comparator.comparing(BookStore::getBookName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\n📚 Sorted by Book Name:");
        for (BookStore b : books) {
            System.out.println(b);
        }

        // Sort by Book ID
        books.sort(Comparator.comparingInt(BookStore::getBookId));

        System.out.println("\n📘 Sorted by Book ID:");
        for (BookStore b : books) {
            System.out.println(b);
        }

        scanner.close();
    }
}

/*
 * How many books to enter? 3
Enter details for Book 1:
Book ID: 102
Book Name: Java Basics

Enter details for Book 2:
Book ID: 101
Book Name: Algorithms

Enter details for Book 3:
Book ID: 103
Book Name: Data Structures

📚 Sorted by Book Name:
Book ID: 101, Book Name: Algorithms
Book ID: 103, Book Name: Data Structures
Book ID: 102, Book Name: Java Basics

📘 Sorted by Book ID:
Book ID: 101, Book Name: Algorithms
Book ID: 102, Book Name: Java Basics
Book ID: 103, Book Name: Data Structures
*/
