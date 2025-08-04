package com.karunakar.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/balance")
public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        HttpSession session = request.getSession(false); // Don't create if not exists

        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            double balance = (Double) session.getAttribute("balance");

            response.setContentType("text/html");
            response.getWriter().println("<h2>Welcome, " + name + "</h2>");
            response.getWriter().println("<p>Your balance is: ₹" + balance + "</p>");
            response.getWriter().println("<a href='logout'>Logout</a>");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
