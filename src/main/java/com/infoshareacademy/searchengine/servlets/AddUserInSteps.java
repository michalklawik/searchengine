package com.infoshareacademy.searchengine.servlets;

import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.domain.Gender;
import com.infoshareacademy.searchengine.domain.User;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-user-in-step")
public class AddUserInSteps extends HttpServlet {

    @EJB
    UsersRepositoryDao usersRepositoryDao;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("step").equals("1")){
            req.getSession().setAttribute("id", req.getParameter("id"));
            req.getSession().setAttribute("login", req.getParameter("login"));
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/add-user-2.jsp");
            requestDispatcher.forward(req, resp);
        }else if (req.getParameter("step").equals("2")){
            req.getSession().setAttribute("name", req.getParameter("name"));
            req.getSession().setAttribute("surname", req.getParameter("surname"));
            req.getSession().setAttribute("age", req.getParameter("age"));
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/add-user-3.jsp");
            requestDispatcher.forward(req, resp);
        }else if (req.getParameter("step").equals("3")){
            req.getSession().setAttribute("gender", req.getParameter("gender"));
            User newUser = createNewUser(req);
            usersRepositoryDao.addUser(newUser);
            resp.sendRedirect("/search-statistics");
        }
    }

    protected User createNewUser(HttpServletRequest request) {
        User newUser = new User();
        newUser.setName(request.getSession().getAttribute("name").toString());
        newUser.setSurname(request.getSession().getAttribute("surname").toString());
        newUser.setLogin(request.getSession().getAttribute("login").toString());
        newUser.setId(Integer.parseInt(request.getSession().getAttribute("id").toString()));
        newUser.setAge(Integer.parseInt(request.getSession().getAttribute("age").toString()));
        if (request.getSession().getAttribute("gender").equals(Gender.MAN.toString())) {
            newUser.setGender(Gender.MAN);
        } else {
            newUser.setGender(Gender.WOMAN);
        }
        return newUser;
    }
}
