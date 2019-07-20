<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <title>Admin Order Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Orders</h1>
                <a href="admin-order-add" class="btn-large blue">Add</a><br><br>
                <c:choose> 
                    <c:when test="${orders==null or empty orders}"><h2>No orders.</h2></c:when>
                    <c:otherwise>
                        <table>
                            <tr>
                                <td>Id</td><td>From</td><td>To</td><td>Payment type</td><td>Title</td><td>Description</td>
                                <td>Client id</td><td>Vehicle id</td>
                            </tr>
                            <c:forEach items="${orders}" var="i">
                                <tr>
                                    <td>${i.id}</td>
                                    <td>${i.dateFrom}</td>
                                    <td>${i.dateTo}</td>
                                    <td>${i.paymentType}</td>
                                    <td>${i.title}</td>
                                    <td>${i.description}</td>
                                    <td>${i.client.id}</td>
                                    <td>${i.appUser.id}</td>
                                    <td><a href="admin-order-edit/${i.id}">Edit</a></td>
                                    <td><a href="admin-order-delete/${i.id}">Delete</a></td>
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
