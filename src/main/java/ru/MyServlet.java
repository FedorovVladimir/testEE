package ru;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("input.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("input_text");
        if (text == null || text.equals("")) {
            req.setAttribute("message", "repeat input, please");
            req.getRequestDispatcher("input.jsp").forward(req, resp);
        } else {
            String answer = work(text);
            req.setAttribute("answer", answer);
            req.getRequestDispatcher("main.jsp").forward(req, resp);
        }
    }

    private String work(String text) {
        try {
            return String.valueOf(Integer.parseInt(text) + 1);
        } catch (NumberFormatException e) {
            return text + " " + text.split("[ \n\t.,:;()]").length;
        }
    }
}
