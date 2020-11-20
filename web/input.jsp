<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/" method="POST">
    <p>
        <%
            if (request.getAttribute("login") != null) {
                out.print(request.getAttribute("login"));
            }
        %>
    </p>
    <label>Login:
        <input type="text" name="input_login"
               value="<% if (request.getAttribute("input_login") != null) {
                   out.print(request.getAttribute("input_login"));
               }%>" required/>
    </label><br>
    <label>Password:
        <input type="password" name="input_psw"
               value="<%if (request.getAttribute("input_psw") != null) {
                   out.print(request.getAttribute("input_psw"));
               }%>" required/>
    </label><br>
    <input type="submit" value="login"/>
</form>

<form action="${pageContext.request.contextPath}/" method="POST">
    <label>Login:
        <input type="text" name="input_login"
               value="<% if (request.getAttribute("input_login") != null) {
                   out.print(request.getAttribute("input_login"));
               }%>" required/>
    </label>
    <p>
        <%
            if (request.getAttribute("message") != null) {
                out.print(request.getAttribute("message"));
            }
        %>
    </p>
    <input type="submit" value="get message"/>
</form>

</body>
</html>
