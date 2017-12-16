package com.infoshareacademy.searchengine.dao;

import com.infoshareacademy.searchengine.domain.User;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface UserRepositoryDaoRemote {
    List<String> getUserNames();
}
