<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/materialize.min.css"  media="screen"/>
        <title>Admin Users Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Users</h1>
                <a href="/admin-user-add" class="btn-large blue">Add</a><br><br>
                <c:choose> 
                    <c:when test="${users==null or empty users}"><h2>No users.</h2></c:when>
                    <c:otherwise>
                        <table>
                            <tr><td>Id</td><td>Username</td><td>Email</td></tr>
                            <c:forEach items="${users}" var="i">
                                <tr>
                                    <td>${i.id}</td>
                                    <td>${i.username}</td>
                                    <td>${i.email}</td>
                                    <td><a href="admin-user-edit/${i.id}">Edit</a></td>
                                    <td><a href="admin-user-delete/${i.id}">Delete</a></td>
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
        <script src="${pageContext.request.contextPath}/js/materialize.min.js"></script>
    </body>
</html>
