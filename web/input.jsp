<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/calc" method="GET">
    <p>
        <%
            if (request.getAttribute("message_1") != null) {
                out.print(request.getAttribute("message_1"));
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

<form action="${pageContext.request.contextPath}/calc" method="POST">
    <p>
        <%
            if (request.getAttribute("message_2") != null) {
                out.print(request.getAttribute("message_2"));
            }
        %>
    </p>
    <label>Множитель 1:
        <input type="text" name="input_text_3"
               value="<% if (request.getAttribute("input_text_3") != null) {
                   out.print(request.getAttribute("input_text_3"));
               }%>"/>
    </label><br>
    <label>Множитель 2:
        <input type="text" name="input_text_4"
               value="<%if (request.getAttribute("input_text_4") != null) {
                   out.print(request.getAttribute("input_text_4"));
               }%>"/>
    </label><br>
    <p>
        <%
            if (request.getAttribute("mul") != null) {
                out.print("Произведение: " + request.getAttribute("mul"));
            }
        %>
    </p>
    <input type="submit" value="умножить"/>
    <input type="reset" value="очистить"/>
</form>

</body>
</html>
