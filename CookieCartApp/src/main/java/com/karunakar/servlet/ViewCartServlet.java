package com.karunakar.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/view")
public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Your Cart:</h2>");

        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                if (!"JSESSIONID".equals(c.getName())) {
                    out.println("<p>" + c.getValue() + "</p>");
                }
            }
        } else {
            out.println("<p>Cart is empty.</p>");
        }

        out.println("<br><a href='index.html'>Add More Items</a>");
    }
}
