package com.infoshareacademy.searchengine.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String surname;
    private String login;
    private int age;
    private int timesCalled;
    private Gender gender;
    private List<Group> group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getTimesCalled() {
        return timesCalled;
    }

    public void setTimesCalled(int timesCalled) {
        this.timesCalled = timesCalled;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }
}
