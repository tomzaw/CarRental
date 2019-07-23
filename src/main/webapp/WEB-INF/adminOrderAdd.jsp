<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/materialize.min.css"  media="screen"/>
        <title>Admin Order Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <h1>Enter order data.</h1>

                <form:form action="/admin-order-add" method="post" modelAttribute="order">
                    <form:hidden path="id"/>
                    <form:input type="text" path="dateFrom" placeholder="Date from."/>
                    <form:input type="text" path="dateTo" placeholder="Date to."/>

                    <form:select path="paymentType" required="true">
                        <form:option value="" disabled="true" selected="true">Select payment type.</form:option>
                        <form:options items="${paymentOptionArray}" />
                    </form:select>

                    <form:input type="text" path="title" placeholder="Title."/>
                    <form:input type="text" path="description" placeholder="Description."/>

                    <form:select path="appUser.id" required="true">
                        <form:option value="0" disabled="true" selected="true">Select user.</form:option>
                        <form:options items="${appUserList}" itemLabel="username" itemValue="id"/>
                    </form:select>

                    <form:select path="client.id" required="true">
                        <form:option value="0" disabled="true" selected="true">Select client.</form:option>
                        <form:options items="${clientList}" itemValue="id"/>
                    </form:select>

                    <form:select path="vehicle.id" required="true">
                        <form:option value="0" disabled="true" selected="true">Select vehicle.</form:option>
                        <form:options items="${vehicleList}" itemValue="id"/>
                    </form:select>
                    <input class="btn-large blue" type="submit" value="Send"/>
                </form:form>

            </div>
        </div>
        <br><br><br><br>
        <br><br><br><br>
        <br><br><br><br>

        <%@include file="footer.jsp"%>
        <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/materialize.min.js"></script>
        <script>
            $(document).ready(function () {
                $('select').formSelect();
            });
        </script>
    </body>
</html>
