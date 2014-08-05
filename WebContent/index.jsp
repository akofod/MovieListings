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
            <h2>Welcome to your Local Movie Listings</h2>
            
            <div id="index_image"><img alt="Movie reel" src="images/movie_tickets.png"></div>
            <div id="search">
                Select a movie to see showtimes:
                <s:form method="post" action="selectOne">
                    <select name="movieID">
                        <option >Captain America: The Winter Soldier 3D</option>
                        <option >Captain America: The Winter Soldier</option>
                        <option >Noah</option>
                        <option >Sabotage</option>
                        <option >Divergent</option>
                        <option >Muppets Most Wanted</option>
                        <option >300: Rise of an Empire</option>
                        <option >Mr. Peabody & Sherman</option>
                        <option >Non-Stop</option>
                    </select>
                    <input type="submit" value="See Showtimes" class="button" />
                </s:form>
            </div>
            <div id="seeAll"><a href="selectAll">See All Movie Showtimes</a></div>
        </div>
        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>