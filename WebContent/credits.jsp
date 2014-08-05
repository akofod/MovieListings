<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
            <h2>Project Credits</h2>
            <div id="credit_page">
                <h3>Developers</h3>
                <p>Mathew Storms - Project Lead, Model Developer</p>
                <p>Jeremy Renkel - Controler Developer</p>
                <p>William Kofod - UI Developer</p><br/>
                
                <h3>Images</h3>
                <p>Images courtesy of <a href="http://www.morguefile.com/">MorgueFile</a>.<br/>
                Used under the <a href="http://www.morguefile.com/license/morguefile">MorgueFile License</a>.</p>
                <p>Background Image by <a href="http://www.morguefile.com/creative/hotblack">Scott Liddell</a></p>
                <p>Front Page Image by <a href="http://www.morguefile.com/creative/mconnors">Michael Connors</a></p>
            </div>
        </div>
        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>