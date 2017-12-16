package com.infoshareacademy.searchengine.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome-user")
public class WelcomeUserServlet extends HttpServlet {
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("name") == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        req.setAttribute("name", req.getParameter("name"));
        req.setAttribute("salary", req.getAttribute("salary"));
//        req.getSession().setAttribute("name", req.getParameter("name"));
//        req.getSession().setAttribute("salary", req.getAttribute("salary"));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome-user.jsp");
        requestDispatcher.forward(req, resp);

//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<!DOCTYPE html><html><body>Hello " + req.getParameter("name") + "</body></html>");
    }
}
