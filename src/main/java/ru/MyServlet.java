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
        String login = req.getParameter("input_login");
        String psw = req.getParameter("input_psw");

        String BEAN_SESSION_KEY = "key";
        EJBDemo ejb = (EJBDemo) req.getSession().getAttribute(BEAN_SESSION_KEY);
        if (ejb == null) {
            ejb = new EJBDemoStateful();
            req.getSession().setAttribute(BEAN_SESSION_KEY, ejb);
        }

        if (psw != null) {
            req.setAttribute("login", ejb.login(login, psw) ? "login" : "error");
        } else {
            req.setAttribute("message", ejb.getMessage(login));
        }
        req.setAttribute("input_login", login);
        req.setAttribute("input_psw", psw);
        req.getRequestDispatcher("input.jsp").forward(req, resp);
    }
}
