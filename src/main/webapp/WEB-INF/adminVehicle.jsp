<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <title>Admin Vehicle Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Vehicles</h1>
                <a href="/admin-vehicle-add" class="btn-large blue">Add</a><br><br>
                <c:choose>
                    <c:when test="${vehicles==null or empty vehicles}"><h2>No vehicles.</h2></c:when>
                    <c:otherwise>
                        <table>
                            <tr><td>Id</td><td>Comapany</td><td>Model</td><td>Engine</td><td>Engine volume</td><td>Color</td></tr>
                            <c:forEach items="${vehicles}" var="i">
                                <tr>
                                    <td>${i.id}</td>
                                    <td>${i.company}</td>
                                    <td>${i.model}</td>
                                    <td>${i.version}</td>
                                    <td>${i.engineName}</td>
                                    <td>${i.engineVolume}</td>
                                    <td>${i.color}</td>
                                    <td><a href="admin-vehicle-edit/${i.id}">Edit</a></td>
                                    <td><a href="admin-vehicle-delete/${i.id}">Delete</a></td>
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
