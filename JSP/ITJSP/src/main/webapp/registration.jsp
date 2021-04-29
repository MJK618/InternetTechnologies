<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24-04-2021
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>Registration Successful | JSP-3</title>
</head>
<body>

<div style="text-align: center;">

    <div class="container-fluid">
        <h1>Registration Successful | JSP-3 </h1>

    </div>
</div>

<div class="container-fluid mt-5 ">
    <div class="container mt-2">
        Hello <b>${fname} ${lname},</b><br>
        Your registration was successful<br><br>

        <b>Your entered credentials were:<br></b><br>
        Full Name: ${fname} ${lname},<br><br>
        Date of Birth: ${dob},<br><br>
        Registered Email-ID: ${email},<br><br>
        Calculated age: ${age}<br><br>
        Favorite Food: ${favfood}<br><br>
        Lucky Number: ${lnum}
    </div>


    <div class="card-footer mt-5 text-center">
        <div class="row align-items-start">
            <div class="col-6">
                <div class="container col-lg-6">
                    <a class="btn btn-primary"  onclick="history.back(-1)" role="button">Back</a>
                </div>

            </div>
            <div class="col-6">
                <div class="container col-lg-6">
                    <a class="btn btn-primary" href="http://localhost:8080/" role="button">Home Page</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
