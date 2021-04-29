<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24-04-2021
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>Greet w.r.t. Current Time | JSP-4</title>

</head>
<body>

<div style="text-align: center;">

    <div class="container-fluid">
        <h1> ${greetMessage} ${name} (Greet w.r.t. Current Time) | JSP-4</h1>

    </div>
</div>
</div>
<form method="post" action="/Q21/greet">
    <div class="form-group">
        <div class="container-fluid mt-5 ">
            <div class="container mt-2">
                <label for="name">Enter Name</label>
            </div>
            <div class="container mt-2">
                <input type="text" class="form-control w-75 p-3" id="name" name="name" placeholder="Enter Name" required>
            </div>

            <div class="container mt-3 mx-10">
                <input type="submit" formmethod="post" class="btn btn-primary" value="Greet Me">
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
                <a class="btn btn-primary" href="http://localhost:8080/" role="button">Home Page</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
