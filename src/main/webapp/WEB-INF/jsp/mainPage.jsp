
<!DOCTYPE html>
    <%@ page pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <link href="/resources/css/style.css" rel="stylesheet" >
        <script src="/resources/js/3.3.1-jquery-min.js"></script>
        <title>Hello world Example</title>
    </head>
    <body>
    <form name="welcomeForm"  method="POST" action="${flowExecutionUrl}">

            <div>
              Person Name: <input type="text" name="name"/>
            </div>
            <br/>
            <div>
            <input type="submit" name="_eventId_welcome"value="OK" />
            </div>
    </form>

    </body>
</html>
<script>


function submit(){

$("welcomeForm").submit();

}

$( document ).ready(function() {
    console.log( "ready!" );
});
</script>
