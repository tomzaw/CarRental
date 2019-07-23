<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
                <h1>Enter user data.</h1>

                <form:form action="/admin-user-add" method="post" modelAttribute="user">
                    <form:hidden path="id"/>
                    <form:input type="text" path="username" placeholder="Username."/>
                    <form:errors path="username"/>
                    <form:input type="text" path="email" placeholder="Email."/>
                    <form:errors path="email"/>
                    <form:password path="password" placeholder="Password."/>
                    <form:errors path="password"/><br>
                    <input class="btn-large blue" type="submit" value="Send"/>
                </form:form>

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
