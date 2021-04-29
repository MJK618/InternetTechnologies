<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <title>JSP Programs | Internet Technologies</title>
</head>
<body>
<div style="text-align: center;">
    <div class="container-fluid">

<h1>JSP-Programs | Jatin Kamboj</h1>
    </div>
</div>
<div class="container-fluid mt-5 ">

<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Q. No.</th>
        <th scope="col">Question Statement</th>
        <th scope="col">Link</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Q-18</td>
        <td>Display the pattern:<br>
            1<br>
            1 2<br>
            1 2 3<br>
            Take ‘n’ in a textbox from user. Display this pattern using Scriptlets</td>
        <td><a href="http://localhost:8080/Q18">Check Here</a></td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Q-19</td>
        <td>Make two files as follows:<br>
            a. main.html: shows 2 text boxes and 3 radio buttons with values "addition",
            "subtraction" and "multiplication"<br>
            b. operate.jsp: depending on what the user selects perform the corresponding function
            (Give two implementations: using request.getParameter() and using expression<br>
            language)</td>
        <td><a href="http://localhost:8080/Q19">Check Here</a></td>
    </tr>

    <tr>
        <th scope="row">3</th>
        <td>Q-20</td>
        <td>Validate User input entered in a form. The input must include Name, DOB, Email ID,
            Lucky Number, Favourite food etc.</td>
        <td><a href="http://localhost:8080/Q20">Check Here</a></td>
    </tr>
    <tr>
        <th scope="row">4</th>
        <td>Q-21</td>
        <td>Display Good Morning <uname>, Good Afternoon <uname> or Good Evening
            <uname> based on the current time of the day</td>
        <td><a href="http://localhost:8080/Q21">Check Here</a></td>
    </tr>
    <tr>
        <th scope="row">5</th>
        <td>Q-22</td>
        <td>Let the user enter a word in a textbox and let her/him select one of even or odd radio
            buttons. If she/he selects odd, check the odd positions in the word entered, if they all
            contain vowels, then display the message ‘You win’, else display ‘You lose’. Similarly,
            if the user selects even, check for vowels in all even positions in the word entered.</td>
        <td><a href="http://localhost:8080/Q22">Check Here</a></td>
    </tr>
    <tr>
        <th scope="row">6</th>
        <td>Q-23</td>
        <td>Ask a user's name Java Server Pages by Hans Bergsten age on a HTML form. Then
            display Hello <uname> on a JSP. On the same page ask the product the user would like
                to buy. Then redirect to another JSP which would display: Hello <uname>, You have
                    ordered <product>. (Use Session Scope Variable using setTag)</td>
        <td><a href="http://localhost:8080/Q23">Check Here</a></td>
    </tr>
    </tbody>
</table>
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