<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 24-04-2021
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>JSP-2 | Operate On Numbers</title>
</head>
<body>
<div style="text-align: center;">

    <div class="container-fluid">
        <h1>Operate On Numbers | JSP-2 </h1>

    </div>
</div>
</div>
<form method="post" action="/Q19/OperationsServlet">
    <div class="form-group">
        <div class="container-fluid mt-5 ">
            <div class="row align-items-start">
                <div class="col-6">
                    <div class="container col-lg-6">
                        <div class="container mt-2">
                            <label for="n">Enter first number</label>
                        </div>
                        <div class="container mt-2">
                            <input type="number" class="form-control w-100 p-3" id="n1" name="num1"
                                   placeholder="Enter a number" required>
                        </div>
                        <div class="container mt-2">
                            <label for="n">Enter second number</label>
                        </div>
                        <div class="container mt-2">
                            <input type="number" class="form-control w-100 p-3" id="n2" name="num2"
                                   placeholder="Enter a number" required>
                        </div>
                        <div class="container mt-3 mx-10">
                            <input type="submit" formmethod="post" class="btn btn-primary" value="DISPLAY">
                        </div>
                    </div>
                </div>
                <div class="col-6">
                    <div class="form-group ">
                        &nbsp;
                    </div>
                    <div class="form-group ">
                        &nbsp;
                    </div>
                    <div class="container col-lg-12 mt-3">
                        <div class="container-fluid mt-3 ">
                            <div class="container mt-5 ">
                                <b><p>ANSWER FOR ${operation}(${operator}) = ${answer}</p></b>
                            </div>
                        </div>
                    </div>
                </div>
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
