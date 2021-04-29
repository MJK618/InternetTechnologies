<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 23-04-2021
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>JSP-1 Display Pattern</title>
</head>
<body>
<div style="text-align: center;">

<div class="container-fluid">
  <h1>Display Pattern | JSP-1 </h1>

</div>
</div>
</div>
<form>
  <div class="form-group">
    <div class="container-fluid mt-5 ">
      <p>${num}</p>
      <div class="container mt-2">
        <label for="n">Enter the number</label>
      </div>
      <div class="container mt-2">
        <input type="number" class="form-control w-25 p-3" id="n"  placeholder="Choose a number">
      </div>
    </div>
    <div class="container mt-3 mx-10">
  <input type="submit" formmethod="post" class="btn btn-primary" value="DISPLAY">
    </div>
  </div>
</form>
</body>
</html>
