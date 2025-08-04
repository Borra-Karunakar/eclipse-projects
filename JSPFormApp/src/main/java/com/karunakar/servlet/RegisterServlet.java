package com.karunakar.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String profession = request.getParameter("profession");
        String married = request.getParameter("married");
        String note = request.getParameter("note");

        out.println("<h2>Registration Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>DOB: " + dob + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Profession: " + profession + "</p>");
        out.println("<p>Married: " + (married != null ? "Yes" : "No") + "</p>");
        out.println("<p>Note: " + note + "</p>");
    }
}
