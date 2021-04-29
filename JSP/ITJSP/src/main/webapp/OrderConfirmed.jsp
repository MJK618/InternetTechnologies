<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 25-04-2021
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

  <title>Order Confirmation | JSP-6</title>
</head>
<body>
<div style="text-align: center;">
  <div class="container-fluid">
    <h1>Order Confirmation | JSP-6 </h1>
  </div>
</div>
<div class="container-fluid mt-3 ">
  <div class="container mt-2">
    <div style="text-align: center;">
      <p class="font-weight-normal">
      <h3>Hello <c:out value="${name}"/> <br/></h3><br>
      Aged: <c:out value="${age}"/></p>
      <div class="container mt-2">
      Your order for <c:out value="${param.product}" /> is now confirmed.<br>
      </div><br><br>
    </div>
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
