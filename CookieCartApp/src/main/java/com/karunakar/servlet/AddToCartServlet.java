package com.karunakar.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/add")
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String item = request.getParameter("item");

        // Create cookie with selected item name
        Cookie cookie = new Cookie(item, item);
        cookie.setMaxAge(60 * 60); // 1 hour

        response.addCookie(cookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>" + item + " added to cart!</h3>");
        out.println("<a href='index.html'>Add More</a><br>");
        out.println("<a href='view'>View Cart</a>");
    }
}
