<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head><title>Form Output</title></head>
<body>
    <h2>Form Data Received:</h2>

    <p><strong>User Name:</strong> ${param.username}</p>
    <p><strong>Password:</strong> ${param.password}</p>
    <p><strong>Address:</strong> ${param.address}</p>
    <p><strong>Subscribed:</strong> ${param.subscribe}</p>

    <p><strong>Selected Framework(s):</strong></p>
    <ul>
        <c:forEach var="f" items="${paramValues.frameworks}">
            <li>${f}</li>
        </c:forEach>
    </ul>

    <p><strong>Gender:</strong> ${param.gender}</p>
    <p><strong>Favorite Number:</strong> ${param.number}</p>
</body>
</html>
