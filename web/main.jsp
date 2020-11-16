<html>
<head>
    <title>Answer page</title>
</head>
<body>

<p>
    <%!
        public String work(String text) {
            try {
                return String.valueOf(Integer.parseInt(text) + 1);
            } catch(NumberFormatException e) {
                return text + " " + text.split("[ \n\t.,:;()]").length;
            }
        }
    %>
    <%
        String text = request.getParameter("input_text");
        out.print(work(text));
    %>
</p>

</body>
</html>
