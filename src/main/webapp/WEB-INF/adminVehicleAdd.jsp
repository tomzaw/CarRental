<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <title>Admin Add Vehicle Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Enter vehicle data</h1>

                <form action="/admin-vehicle-add" method="post">
                    <input type="text" placeholder="Company.">
                    <input type="text" placeholder="Model.">
                    <input type="text" placeholder="Version.">
                    <input type="text" placeholder="Engine name.">
                    <input type="text" placeholder="Engine volume.">
                    <input type="text" placeholder="Color."><br><br>
                    <input class="btn-large blue" type="submit" value="Send">
                </form>

            </div>
        </div>
        <br><br><br><br>
        <br><br><br><br>

        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
