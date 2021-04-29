<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24-04-2021
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>Registration Form | JSP-3</title>
</head>
<body>

<div style="text-align: center;">

    <div class="container-fluid">
        <h1>Registration Form | JSP-3</h1>

    </div>
</div>
</div>
<form method="post" action="/Q20/register">
    <div class="form-group">
        <div class="container-fluid mt-5 ">
            <div class="container mt-2">
                <label for="fname">First Name</label>
            </div>
            <div class="container mt-2">
                <input type="text" class="form-control w-75 p-3" id="fname" name="fname" placeholder="Enter First Name" required>
            </div>
            <div class="container mt-2">
                <label for="lname">Last Name</label>
            </div>
            <div class="container mt-2">
                <input type="text" class="form-control w-75 p-3" id="lname" name="lname" placeholder="Enter Last Name">
            </div>
            <div class="container mt-2">
                <label for="email">Email Address</label>
            </div>
            <div class="container mt-2">
                <input type="email" class="form-control w-75 p-3" id="email" name="email" placeholder="name@example.com" required>
            </div>
            <div class="container mt-2">
                <label for="favfood">Favorite Food</label>
            </div>
            <div class="container mt-2">
                <input type="text" class="form-control w-75 p-3" id="favfood" name="favfood" placeholder="Something Delicious">
            </div>
            <div class="container mt-2">
            <label for="lnum">Lucky Number</label>
        </div>
            <div class="container mt-2">
                <input type="number" class="form-control w-75 p-3" id="lnum" name="lnum" placeholder="Your Magic Number">
            </div>
            <div class="container mt-2">
                <label for="dob">Date Of Birth</label>
            </div>
            <div class="container mt-2">
                <input type="date" class="form-control w-75 p-3" id="dob" name="dob" placeholder="01/01/1950" required>
            </div>
            <div class="form-check container mt-2" required>
                <div class="container mt-4">
                    <input class="form-check-input" type="radio" name="gender" id="male" value="M">
                    <label class="form-check-label" for="male">Male</label><br>
                    <input class="form-check-input" type="radio" name="gender" id="female" value="F">
                    <label class="form-check-label" for="female">Female</label>
                </div>
            </div>
            <div class="container mt-3 mx-10">
                <input type="submit" formmethod="post" class="btn btn-primary" value="Register">
            </div>
        </div>
    </div>

</form>

<div class="card-footer mt-5 text-center">
    <div class="row align-items-start">
        <div class="col-6">
            <div class="container col-lg-6">
                <a class="btn btn-primary"  onclick="history.back(-1)" role="button">Back</a>
            </div>

        </div>
        <div class="col-6">
            <div class="container col-lg-6">
                <a class="btn btn-primary" href="http://jatin.in1.cloudjiffy.net/" role="button">Home Page</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
