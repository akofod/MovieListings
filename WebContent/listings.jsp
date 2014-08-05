<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styles.css" type="text/css">
<title>Local Movie Listings</title>
</head>
<body>
    <div id="container">
        <jsp:include page="header.jsp" />
        <div id="content">
            <h1>All Movies</h1>
            <s:iterator value="allMovies">
                <table>
                    <tr>
                        <th class="movie_title"><s:property value="title" /></th>
                    </tr>
                    <tr><td><s:property value="rating" />&nbsp; &nbsp; <s:property value="runtime" /></td></tr>
                    <tr><td><s:property value="description" /></td></tr>
                    <tr><td>
                        <s:iterator value="showings" var="time">
                            <s:property value="time"/>
                            &nbsp; &nbsp;
                        </s:iterator>
                    </td></tr>
                </table>
                <br/>
            </s:iterator>
        </div>
        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>