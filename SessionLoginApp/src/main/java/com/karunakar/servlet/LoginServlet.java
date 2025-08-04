package com.karunakar.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String accno = request.getParameter("accno");
        String pass = request.getParameter("pass");

        // Dummy validation
        if ("12345".equals(accno) && "pass123".equals(pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("name", "Karunakar");
            session.setAttribute("balance", 5000.0);

            response.sendRedirect("balance");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Invalid Credentials</h3>");
            response.getWriter().println("<a href='login.html'>Try Again</a>");
        }
    }
}
