<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                            <tr><td>Company</td><td>Mazda</td></tr>
                            <tr><td>Model</td><td>CX-3</td></tr>
                            <tr><td>Engine</td><td>Tdi</td></tr>
                            <tr><td>Engine Volume</td><td>1.4</td></tr>
                            <tr><td>Color</td><td>White</td></tr>
                        </table>
                    </div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <p>Description.</p>
                        <br><br>
                        <br><br>
                        <br><br>

                        <h4>Call or send a form and the company employee will call you.</h4>
                        <h4>Phone: 000-000-000.</h4>

                        <form action="/post-client-form" method="post">
                            <input type="text" placeholder="First name.">
                            <input type="text" placeholder="Last name.">
                            <input type="text" placeholder="Email.">
                            <input type="text" placeholder="Phone."><br><br>
                            <input class="btn-large blue" type="submit" value="Send">
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
