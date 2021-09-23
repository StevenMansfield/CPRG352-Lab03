<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2021, 5:32:55 PM
    Author     : 786821
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <div>
                <label>Enter your age:</label>
                <input type="text" name="age" value="">
            </div>
            <div>
                <input type="submit" value="Age next birthday">
            </div>
            <div>
                <a href="arithmetic">Arithmetic Calculator</a>
            </div>
        </form>        
    </body>
</html>
