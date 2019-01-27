
<!DOCTYPE html>
    <%@ page pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link rel="stylesheet" href="/WEB-INF/resources/styles.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <title>Hello world Example</title>
    </head>
    <body>
        <div>
            <c:out value="new value"/>
            Hellos
        </div>
    </body>
</html>
<script>

$( document ).ready(function() {
    console.log( "ready!" );
});
</script>
