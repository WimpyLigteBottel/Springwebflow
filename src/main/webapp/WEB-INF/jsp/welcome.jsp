
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
                     welcome ${name}
                   </div>
                   <br/>
                    <div>
                     ${result}
                   </div>
                   <br/>
                   <div>
                   <input type="submit" name="_eventId_back" value="Back"/>
                   </div>

           </form>
    </body>
</html>
<script>

$( document ).ready(function() {
    console.log( "ready!" );
});
</script>
