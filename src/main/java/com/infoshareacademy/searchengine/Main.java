package com.infoshareacademy.searchengine;

import com.infoshareacademy.searchengine.dao.UserRepositoryDao;
import com.infoshareacademy.searchengine.dao.UserRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.User;

public class Main {

    public static void main(String args[]) {
        UserRepositoryDao daoBean = new UserRepositoryDaoBean();
        for (User user : daoBean.getUserList()) {
            System.out.println(user.getName());
        }
    }
}
