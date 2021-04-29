<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24-04-2021
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>ODD-EVEN Game (Vowel Strings) | JSP-5</title>
</head>
<body>

<div style="text-align: center;">
    <div class="container-fluid">
        <h1> ODD-EVEN Game (Vowel Strings) | JSP-5</h1>
    </div>
</div>
<form method="post" action="/Q22/game/result">
    <div class="form-group">
        <div class="container-fluid mt-5 ">
            <div class="container mt-2">
                <label for="str">Enter the String</label>
            </div>
            <div class="container mt-2">
                <input type="textbox" class="form-control w-75 p-3" id="str" name="str" placeholder="Type anything..." required>
            </div>
            <div class="form-check container mt-2" required>
                <div class="container mt-4">
                    <input class="form-check-input" type="radio" name="choice" id="odd" value="0">
                    <label class="form-check-label" for="odd">Odd</label><br>
                    <input class="form-check-input" type="radio" name="choice" id="even" value="1">
                    <label class="form-check-label" for="even">Even</label>
                </div>
            </div>
            <div class="container mt-3 mx-10">
                <input type="submit" formmethod="post" class="btn btn-primary" value="Check">
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
