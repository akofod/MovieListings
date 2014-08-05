<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="styles.css" type="text/css">
    <title>Error Page</title>
</head>
<body>
    <div id="container">
        <jsp:include page="header.jsp" />
        <div id="content">
            <h2 class="error">This request has generated an error.</h2>
            <p class="error"><b>Error code:</b> ${pageContext.errorData.statusCode}</p>
            <p class="error"><b>Error Message:</b> ${pageContext.exception.message}</p>
            <p class="error"><b>Request URI:</b> ${pageContext.request.scheme}://${header.host}${pageContext.errorData.requestURI}</p><br />
            <button onclick="history.back()">Back to Previous Page</button>
        </div>
        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>