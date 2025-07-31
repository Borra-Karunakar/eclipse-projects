package assignment;

public class Question39 {
    public static void main(String[] args) {
        // Non-Generic Version
        System.out.println("--- Non-Generic Library ---");
        NonGenericLibrary nonGenLibrary = new NonGenericLibrary();
        nonGenLibrary.add(new Book("Java Basics"));
        nonGenLibrary.add(new Video("Intro to Spring"));
        nonGenLibrary.add(new Newspaper("The Times"));

        System.out.println(nonGenLibrary.retrieve(0));
        System.out.println(nonGenLibrary.retrieve(1));
        System.out.println(nonGenLibrary.retrieve(2));

        // Generic Version
        System.out.println("\n--- Generic Library (Books) ---");
        GenericLibrary<Book> bookLibrary = new GenericLibrary<>();
        bookLibrary.add(new Book("Effective Java"));
        System.out.println(bookLibrary.retrieve(0));

        System.out.println("\n--- Generic Library (Videos) ---");
        GenericLibrary<Video> videoLibrary = new GenericLibrary<>();
        videoLibrary.add(new Video("Spring Boot Crash Course"));
        System.out.println(videoLibrary.retrieve(0));
    }
}


/*
--- Non-Generic Library ---
Book: Java Basics
Video: Intro to Spring
Newspaper: The Times

--- Generic Library (Books) ---
Book: Effective Java

--- Generic Library (Videos) ---
Video: Spring Boot Crash Course
*/