<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/materialize.min.css"  media="screen"/>
        <title>Admin Add Vehicle Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Enter vehicle data.</h1>

                <form:form action="/admin-vehicle-add" method="post" modelAttribute="vehicle">
                    <form:hidden path="id"/>
                    <form:input type="text" path="company" placeholder="Company."/>
                    <form:errors path="company"/>
                    <form:input type="text" path="model" placeholder="Model."/>
                    <form:errors path="model"/>
                    <form:input type="text" path="version" placeholder="Version."/>
                    <form:errors path="version"/>
                    <form:input type="text" path="engineName" placeholder="Engine name."/>
                    <form:errors path="engineName"/>
                    <form:input type="text" path="engineVolume" placeholder="Engine volume."/>
                    <form:errors path="engineVolume"/>
                    <form:input type="text" path="color" placeholder="Color."/>
                    <form:errors path="color"/>
                    <form:input type="text" path="description" placeholder="Description."/>
                    <form:errors path="description"/><br>
                    <input class="btn-large blue" type="submit" value="Send"/>
                </form:form>

            </div>
        </div>
        <br><br><br><br>
        <br><br><br><br>

        <%@include file="footer.jsp"%>
        <script src="${pageContext.request.contextPath}/js/materialize.min.js"></script>
    </body>
</html>
