<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24-04-2021
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>ODD-EVEN Game Results (Vowel Strings) | JSP-5</title>
</head>
<body>

<div style="text-align: center;">
    <div class="container-fluid">
        <h1> ODD-EVEN Game Results (Vowel Strings) | JSP-5</h1><br><br>
    </div>
</div>
<div class="container-fluid mt-5 ">
    <div class="container mt-2"><div style="text-align: center;">
        <p class="font-weight-normal"><h1>${displayMessage}</h1></p><br><br>
        You entered: <samp><b>${str}</b></samp> <br><br>
        After checking <b>${choice}</b> indexes of the entered string, the validated string was: <samp><b>${demo}</b></samp>

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
