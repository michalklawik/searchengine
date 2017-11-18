package com.infoshareacademy.searchengine.servlets;

import com.infoshareacademy.searchengine.dao.UserRepositoryDao;
import com.infoshareacademy.searchengine.dao.UserRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/find-user-by-id")
public class FindUserByIdServlet extends HttpServlet {
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserRepositoryDao daoBean = new UserRepositoryDaoBean();
        PrintWriter writer = resp.getWriter();
        if (req.getParameter("id") == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        int id = Integer.valueOf(req.getParameter("id"));
        User user = daoBean.getUserById(id);
        if (user == null) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        } else {
            writer.println("<!DOCTYPE html><html><body>Hello " + user.getName() + "</body></html>");
        }
    }
}
