<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="styles.css" type="text/css">
    <title>404 Error Page</title>
</head>
<body>
    <div id="container">
        <jsp:include page="header.jsp" />
        <div id="content">
            <h2 class="error">Oops!</h2>
            <div id="error_image"><img alt="Tangled film" src="images/tangled_film.png"></div>
            <h4 class="error">We can't seem to find that page right now.<br>Please try again later.</h4>
            <p class="error"><b>Error code:</b> ${pageContext.errorData.statusCode}</p>
            <p class="error"><b>Request URI:</b> ${pageContext.request.scheme}://${header.host}${pageContext.errorData.requestURI}</p><br />
            <button id="error_button" class="error" onclick="history.back()">Back to Previous Page</button>
        </div>
        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>