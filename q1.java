<%-- 
    Document   : LoginPage
    Created on : 11 Nov, 2018, 5:11:47 PM
    Author     : abhilasha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightblue"></body>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN PAGE</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel='stylesheet'>
        <style>
            td{
                padding: 10px;
            }
            div{
                width:50%;
                border: 1px solid black;
                border-radius:5px;
                background-color: lightgray;
            }
        </style>
    </head>
    <body>
        <h1><u><center>Login Here</center></u></h1>
           <center>
    <div>
        <form action="login" method="POST">
        <table>
            <tr>
                <td>User Name</td>
                <td><input type="text" class="form-control" name="username" placeholder="User Name"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" class="form-control" name="password" placeholder="Password"></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: "center"><input class="btn btn-success" type="submit" value="Submit"></td>
            </tr>
        </table>
        </form>
    </div>
</center>
    </body>
</html>
