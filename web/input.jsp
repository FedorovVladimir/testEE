<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/sum" method="GET">
    <p>
        <%
            if (request.getAttribute("message") != null) {
                out.print(request.getAttribute("message"));
            }
        %>
    </p>
    <label>Слагаемое 1:
        <input type="text" name="input_text_1"
               value="<% if (request.getAttribute("input_text_1") != null) {
                   out.print(request.getAttribute("input_text_1"));
               }%>"/>
    </label><br>
    <label>Слагаемое 2:
        <input type="text" name="input_text_2"
               value="<%if (request.getAttribute("input_text_2") != null) {
                   out.print(request.getAttribute("input_text_2"));
               }%>"/>
    </label><br>
    <p>
        <%
            if (request.getAttribute("sum") != null) {
                out.print("Сумма: " + request.getAttribute("sum"));
            }
        %>
    </p>
    <input type="submit" value="сложить"/>
    <input type="reset" value="очистить"/>
</form>

</body>
</html>
