<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 25-04-2021
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title> Welcome User | JSP-6 </title>
</head>
<body>

<div style="text-align: center;">
    <div class="container-fluid">
        <h3>Welcome User | JSP-6 </h3>
    </div>
</div>
<div class="container-fluid mt-5 ">
    <div class="container mt-2">
        <div style="text-align: center;">
            <p class="font-weight-normal">
            <h1>Hello ${param.name}</h1></p><br><br>
        </div>
        <form action="OrderConfirmed.jsp">
            <div class="container mt-2">
                <label for="prod">Which Product do you wish to buy?</label>
                <c:set var="name" value="${param.name}" scope="session"/>
                <c:set var="age" value="${param.age}" scope="session"/>
            </div>
            <div class="container mt-2">
                <input type="textbox" class="form-control w-75 p-3" id="prod" name="product" placeholder="Enter Product Name" required>
            </div>

            <div class="container mt-3 mx-10">
                <input type="submit" formmethod="post" class="btn btn-primary" value="Order Now">
            </div>
        </form>

    </div>

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