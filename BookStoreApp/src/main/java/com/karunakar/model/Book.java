package com.karunakar.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    // Constructor (Optional)
    public Book() {
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
