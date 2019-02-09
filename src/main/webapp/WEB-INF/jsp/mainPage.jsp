<!DOCTYPE html>
<html>
<head>
    <%@include file="/WEB-INF/jsp/header/header.jspf" %>
    <title>Hello world Example</title>
</head>
<body>
<form id="welcomeForm" name="welcomeForm" method="POST" action="${flowExecutionUrl}">

    <div>
        Person Name: <input type="text" name="name"/>
    </div>
    <br/>
    <div>
        <input type="submit" name="_eventId_welcome" value="submit"/>
    </div>
</form>

</body>
</html>
<script>

    $(document).ready(function () {
        console.log("ready!");
    });
</script>
