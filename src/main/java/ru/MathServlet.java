package ru;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MathServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text_1 = req.getParameter("input_text_1");
        String text_2 = req.getParameter("input_text_2");
        if (text_1 == null || text_1.equals("")) {
            req.setAttribute("message_1", "input first number");
            req.getRequestDispatcher("input.jsp").forward(req, resp);
            return;
        }
        if (text_2 == null || text_2.equals("")) {
            req.setAttribute("message_1", "input second number");
            req.setAttribute("input_text_1", text_1);
            req.getRequestDispatcher("input.jsp").forward(req, resp);
            return;
        }
        req.setAttribute("input_text_1", text_1);
        req.setAttribute("input_text_2", text_2);
        try {
            int a = Integer.parseInt(text_1);
            int b = Integer.parseInt(text_2);
            req.setAttribute("sum", a + b);
        } catch (Exception ignore) {
            req.setAttribute("message_1", "parse number error, check your inputs");
        }
        req.getRequestDispatcher("input.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text_1 = req.getParameter("input_text_3");
        String text_2 = req.getParameter("input_text_4");
        if (text_1 == null || text_1.equals("")) {
            req.setAttribute("message_2", "input first number");
            req.getRequestDispatcher("input.jsp").forward(req, resp);
            return;
        }
        if (text_2 == null || text_2.equals("")) {
            req.setAttribute("message_2", "input second number");
            req.setAttribute("input_text_3", text_1);
            req.getRequestDispatcher("input.jsp").forward(req, resp);
            return;
        }
        req.setAttribute("input_text_3", text_1);
        req.setAttribute("input_text_4", text_2);
        try {
            int a = Integer.parseInt(text_1);
            int b = Integer.parseInt(text_2);
            req.setAttribute("mul", a * b);
        } catch (Exception ignore) {
            req.setAttribute("message_2", "parse number error, check your inputs");
        }
        req.getRequestDispatcher("input.jsp").forward(req, resp);
    }
}
