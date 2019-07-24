<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>

        <title>About Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">
                <br><br><br><br>

                <div class="row">
                    <div class="col s12 m4 offset-m4">
                        <div class="card center-align">

                            <form class="login-form" action="/login" method="post">
                                <div class="card-action blue white-text"><h4>Log in</h4></div>

                                <div class="card-content">
                                    <div class="form field">
                                        <label for="email">Email</label>
                                        <input name="email" type="text"/>
                                    </div>

                                </div>

                                <div class="card-content">
                                    <div class="form field">
                                        <label for="password">Password</label>
                                        <input type="password" name="password"/>
                                    </div>

                                </div>

                                <div class="card-content">
                                    <div class="form field center-align">
                                        <input class="btn-large blue" type="submit" value="Log in"/>
                                    </div>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>

                <br><br><br><br>
                <br><br><br><br>
                <br><br><br><br>
            </div>
        </div>
        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
