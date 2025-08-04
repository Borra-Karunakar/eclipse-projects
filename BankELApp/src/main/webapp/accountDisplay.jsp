<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="account" class="com.karunakar.bean.AccountBean" scope="request" />
<jsp:setProperty name="account" property="*" />

<%
    // Store account type in session
    String accType = request.getParameter("accountType");
    session.setAttribute("accType", accType);
%>

<html>
<head><title>Account Summary</title></head>
<body>
    <h2>Account Details</h2>
    <p><b>Account No:</b> ${account.accountNo}</p>
    <p><b>Name:</b> ${account.name}</p>
    <p><b>Balance:</b> ₹${account.balance}</p>
    <p><b>Account Type:</b> ${sessionScope.accType}</p>

    <p>
        <b>Status:</b>
        ${account.balance >= 1000 ? "Sufficient" : "Low Balance"}
    </p>
</body>
</html>
