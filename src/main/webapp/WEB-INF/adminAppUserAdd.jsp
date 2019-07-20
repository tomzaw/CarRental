<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <title>Admin Users Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Admin Users Page.</h1>
                Aa.
                <a href="" class="btn-large blue">Add</a><br><br>
                <c:choose> 
                    <c:when test="${users==null or empty users}"><h2>No users.</h2></c:when>
                    <c:otherwise>
                        <table>
                            <tr><td>Id</td><td>Username</td><td>Email</td><td>Password</td></tr>
                            <c:forEach items="${users}" var="i">
                                <tr>
                                    <td>${i.id}</td>
                                    <td>${i.username}</td>
                                    <td>${i.email}</td>
                                    <td>${i.password}</td>
                                    <td><a href="">Edit</a></td>
                                    <td><a href="">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>

        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
