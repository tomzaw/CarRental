<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <!--<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">-->

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>

        <title>Index Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class ="container">
            <div class="section">

                <h1 class="center">Car Rental</h1>

                <br><br><br><br>

                <div class="row">
                    <div class="col s4">
                        <div class="card">   
                            <div class="card-title center-align blue-text">Rent From Airport.</div>
                            <div class="card-content">No need to search the taxi or call someone to pick you up. The ready to use car will wait at the airport.</div>
                        </div>
                    </div>

                    <div class="col s4">
                        <div class="card">   
                            <div class="card-title center-align blue-text">Rent short term.</div>
                            <div class="card-content">Need a car for just a week? The hassle-free short term rent enables to get the car in less than ah hour.</div>
                        </div>
                    </div>

                    <div class="col s4">
                        <div class="card">   
                            <div class="card-title center-align blue-text">Rent long term.</div>
                            <div class="card-content">Just moved into the city and need a long term way of transport. Return the car whenever you want.</div>
                        </div>
                    </div>
                </div>

                <br><br><br><br>
                
                <h1 class="center">Available cars</h1>

                <div class="row">

                    <div class="col s3">
                        <div class="card">
                            <div class="card-image">
                                <a href="/car/Honda/Accord/9"><img src="img/Honda_Accord_IX_facelift_China_2016-04-16.jpg" width="270" height="150"/></a>
                            </div>
                            <span class="card-title">Honda Accord.</span>
                        </div>
                    </div>

                    <div class="col s3">
                        <div class="card">
                            <div class="card-image">
                                <a href="/car/Mazda/CX-3/1"><img src="img/Mazda_CX-3.jpg" width="270" height="150"/></a>
                            </div>
                            <span class="card-title">Mazda CX-3.</span>
                        </div>
                    </div>

                    <div class="col s3">
                        <div class="card">
                            <div class="card-image">
                                <a href="/car/Nissan/Qashqai/11"><img src="img/Nissan_qashqai_j11_front-side.png" width="270" height="150"/></a>
                            </div>
                            <span class="card-title">Nissan Qashqai.</span>
                        </div>
                    </div>

                    <div class="col s3">
                        <div class="card">
                            <div class="card-image">
                                <a href="/car/Skoda/Octavia/1"><img src="img/Skoda_Octavia_SE_TDi_S-A_1.6_Front.jpg" width="270" height="150"/></a>
                            </div>
                            <span class="card-title">Skoda Octavia.</span>
                        </div>
                    </div>

                </div>
                
            </div>
        </div>

        <%@include file="footer.jsp"%>
        <script src="js/materialize.min.js"></script>
    </body>
</html>
