<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/text" method="POST">
    <label>Input text message:
        <input type="text" name="input_text_message" required/>
    </label>
    <input type="submit" value="send"/>
</form>

<form action="${pageContext.request.contextPath}/number" method="POST">
    <label>Input number message:
        <input type="number" name="input_number_message" required/>
    </label>
    <input type="submit" value="send"/>
</form>

</body>
</html>
