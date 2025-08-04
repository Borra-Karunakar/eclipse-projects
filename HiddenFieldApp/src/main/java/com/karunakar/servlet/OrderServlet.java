package com.karunakar.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("pname");
        int price = Integer.parseInt(request.getParameter("price"));
        int qty = Integer.parseInt(request.getParameter("qty"));

        int total = price * qty;

        response.setContentType("text/html");
        response.getWriter().println("<h2>Order Summary</h2>");
        response.getWriter().println("<p>Product: " + name + "</p>");
        response.getWriter().println("<p>Unit Price: ₹" + price + "</p>");
        response.getWriter().println("<p>Quantity: " + qty + "</p>");
        response.getWriter().println("<p><b>Total: ₹" + total + "</b></p>");
    }
}
