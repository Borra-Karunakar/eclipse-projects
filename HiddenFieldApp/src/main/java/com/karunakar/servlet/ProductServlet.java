package com.karunakar.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String value = request.getParameter("product"); // e.g., "Pen-10"
        String[] parts = value.split("-");

        String productName = parts[0];
        String productPrice = parts[1];

        response.setContentType("text/html");
        response.getWriter().println("<h2>Enter Quantity</h2>");
        response.getWriter().println("<form action='order' method='post'>");

        response.getWriter().println("Quantity: <input type='number' name='qty' required><br><br>");
        response.getWriter().println("<input type='hidden' name='pname' value='" + productName + "'>");
        response.getWriter().println("<input type='hidden' name='price' value='" + productPrice + "'>");

        response.getWriter().println("<input type='submit' value='Place Order'>");
        response.getWriter().println("</form>");
    }
}
