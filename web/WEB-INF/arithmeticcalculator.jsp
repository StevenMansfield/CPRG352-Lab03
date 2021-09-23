<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2021, 2:17:28 PM
    Author     : 786821
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <div>
                <label>First: </label>
                <input type="text" name="first_number" value="">
            </div>
            <div>
                <label>Second: </label>
                <input type="text" name="second_number" value="">
            </div>
            <div>
                <input type="submit" value="+">
                <input type="submit" value="-">
                <input type="submit" value="*">
                <input type="submit" value="%">
            </div>
        </form>
        <br>
        <div>
            Result: <p> </p> 
        </div>
        <div>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
