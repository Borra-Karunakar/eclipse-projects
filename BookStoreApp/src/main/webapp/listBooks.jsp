<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>List of Books</title>
</head>
<body>
    <h2>Books List</h2>
    <a href="addBook.jsp">➕ Add New Book</a>
    <br><br>

    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price (₹)</th>
        </tr>

        <c:forEach var="book" items="${bookList}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
