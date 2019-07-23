<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link type="text/css" rel="stylesheet" href="${pageContext.request.contentType}/css/materialize.min.css"  media="screen"/>

        <title>Index Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <br><br><br><br>
                <br><br><br><br>
                <div class="row">
                    <div class="col s6">
                        <img class="responsive-img" src="${pageContext.request.contentType}/img/Mazda_CX-3.jpg" width="540" height="300"/>
                    </div>
                    <div class="col s6">
                        <table>
                            <tr><td>Company</td><td>${vehicle.company}</td></tr>
                            <tr><td>Model</td><td>${vehicle.model}</td></tr>
                            <tr><td>Engine</td><td>${vehicle.engineName}</td></tr>
                            <tr><td>Engine Volume</td><td>${vehicle.engineVolume}</td></tr>
                            <tr><td>Color</td><td>${vehicle.color}</td></tr>
                        </table>
                    </div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <p>${vehicle.description}</p>
                        <br><br>
                        <br><br>
                        <br><br>

                        <h4>Call or send a form and the company employee will call you.</h4>
                        <h4>Phone: 000-000-000.</h4>

                        <form:form action="/post-client-form" method="post" modelAttribute="clientForm">
                            <form:input type="text" path="firstName" placeholder="First name."/>
                            <form:input type="text" path="lastName" placeholder="Last name."/>
                            <form:input type="text" path="email" placeholder="Email."/>
                            <form:input type="text" path="phone" placeholder="Phone."/><br><br>
                            <input class="btn-large blue" type="submit" value="Send">
                        </form:form>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
