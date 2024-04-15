<%-- 
    Document   : helloworld-form
    Created on : Apr 14, 2024, 3:02:44 PM
    Author     : d
--%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello - input Form</title>
    </head>
    <body>
        <form action="processForm" method="GET">
            <input type="text" name="studentName" placeholder="What's your name?" />
            <input type="submit"/>
        </form>
    </body>
</html>
