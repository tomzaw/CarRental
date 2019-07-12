<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="${pageContext.request.contentType}/css/materialize.min.css"  media="screen"/>

        <title>Index Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <h1>Specific Car Page.</h1>

        <div class ="container">
            <div class="section">
                Aa.
                <a href="index.jsp" class="btn-large light-blue">Rent car</a><br><br>
                <br><br><br><br>
                <br><br><br><br>
                <br><br><br><br>
                <br><br><br><br>
                B.
            </div>
        </div>

        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
