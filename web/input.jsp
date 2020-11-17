<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/" method="POST">
    <p>
        <%
            if (request.getAttribute("message") != null) {
                out.print(request.getAttribute("message"));
            }
        %>
    </p>
    <label><input type="text" name="input_text"/></label>
    <input type="submit" value="submit"/>
</form>

</body>
</html>
