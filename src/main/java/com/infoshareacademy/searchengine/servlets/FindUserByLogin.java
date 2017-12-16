package com.infoshareacademy.searchengine.servlets;

import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;

import javax.ejb.EJB;
import javax.servlet.Servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("find-user-by-login")
public class FindUserByLogin extends HttpServlet {
    @EJB
    private UsersRepositoryDao daoBean;

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) {

    }
}
