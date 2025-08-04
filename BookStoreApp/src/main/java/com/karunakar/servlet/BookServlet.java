package com.karunakar.servlet;

import com.karunakar.dao.BookDAO;
import com.karunakar.model.Book;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    private BookDAO bookDAO;

    public void init() {
        bookDAO = new BookDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        listBooks(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        insertBook(request, response);
    }

    private void listBooks(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Book> bookList = bookDAO.selectAllBooks();
            request.setAttribute("bookList", bookList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("listBooks.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    private void insertBook(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        Book newBook = new Book();
        newBook.setTitle(title);
        newBook.setAuthor(author);
        newBook.setPrice(price);

        try {
            bookDAO.insertBook(newBook);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("BookServlet");
    }
}
