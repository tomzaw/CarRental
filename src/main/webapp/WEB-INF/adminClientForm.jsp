<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <title>Admin Client Form Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Clients Forms</h1>
                <a href="admin-client-form-add" class="btn-large blue">Add</a><br><br>
                <c:choose> 
                    <c:when test="${clientsForms==null or empty clientsForms}"><h2>No forms.</h2></c:when>
                    <c:otherwise>
                        <table>
                            <tr><td>Id</td><td>First name</td><td>Last name</td><td>Email</td><td>Phone</td></tr>
                            <c:forEach items="${clientsForms}" var="i">
                                <tr>
                                    <td>${i.id}</td>
                                    <td>${i.firstName}</td>
                                    <td>${i.lastName}</td>
                                    <td>${i.email}</td>
                                    <td>${i.phone}</td>
                                    <td><a href="admin-client-form-edit/${i.id}">Edit</a></td>
                                    <td><a href="admin-client-form-delete/${i.id}">Delete</a></td>
                                    <td><a href="admin-client-form-confirm/${i.id}">Confirm</a></td>
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
