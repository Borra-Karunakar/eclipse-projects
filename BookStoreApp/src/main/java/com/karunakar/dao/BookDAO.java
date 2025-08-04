package com.karunakar.dao;

import com.karunakar.model.Book;

import java.sql.*;
import java.util.*;

public class BookDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/bookstore";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Karunakarks17$";

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public void insertBook(Book book) throws Exception {
        String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());
            ps.executeUpdate();
        }
    }

    public List<Book> selectAllBooks() throws Exception {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getDouble("price"));
                books.add(book);
            }
        }

        return books;
    }
}
