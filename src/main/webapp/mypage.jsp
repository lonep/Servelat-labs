<%--
  Created by IntelliJ IDEA.
  User: lonep
  Date: 27.10.2022
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Kotiy lab1</title>
<style>

body {
    text-align: center;
    font-family: Calibri;
    background-color: #99b268;
}
h1 {

    font-size: 24px;
}
h2 {

    font-size: 16px;
}

button {
    margin-top: 20px;
    height: 50px;
    width: 100px;
    border-radius: 5px;
    background-color: white;
    color: black;
}

button:hover {
    background-color: #d9dad0;
}


#form {
    background-color: white;
    border-radius: 20px;
    margin-left: 400px;
    margin-right: 400px;
}

.field {
    margin-top: 10px;
}

#ErrorLabel {
    visibility: hidden;
}
#loginState {
    visibility:  ${state};
}


</style>


</head>
<body>
<form id="form" method="post">
    <h1>Authorization</h1>
    <div class="field">
        <label >Login:
            <input type="text" name="login">
        </label>
        <br/>
    </div>

    <div class="field">
        <label>Password:
            <input type="password" name="pass">
        </label>
        <br/>
    </div>
    <button>login</button>
    <br/>

    <p id="ErrorLabel">Login or password is incorrect</p>

    <p id="loginState">${Role} </p>
</form>
</body>
</html>
