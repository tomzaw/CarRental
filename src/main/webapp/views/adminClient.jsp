<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <title>Admin Client Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Clients</h1>
                <a href="" class="btn-large blue">Add</a><br><br>
                <c:choose> 
                    <c:when test="${clients==null or empty clients}"><h2>No clients.</h2></c:when>
                    <c:otherwise>
                        <table>
                            <tr><td>Id</td><td>First name</td><td>Last name</td><td>Email</td><td>Phone</td></tr>
                            <c:forEach items="${clients}" var="i">
                                <tr>
                                    <td>${i.id}</td>
                                    <td>${i.firstName}</td>
                                    <td>${i.lastName}</td>
                                    <td>${i.email}</td>
                                    <td>${i.phone}</td>
                                    <td><a href="">Edit</a></td>
                                    <td><a href="">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>

        <br><br><br><br>
        <br><br><br><br>
        <br><br><br><br>
        <br><br><br><br>
        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
