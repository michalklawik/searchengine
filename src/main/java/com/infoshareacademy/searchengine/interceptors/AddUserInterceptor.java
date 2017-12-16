package com.infoshareacademy.searchengine.interceptors;

import com.infoshareacademy.searchengine.domain.Gender;
import com.infoshareacademy.searchengine.domain.User;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class AddUserInterceptor {

    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        User user = (User) context.getParameters()[0];
        if (user.getGender() == null){
            String name = user.getName();
            if (name.endsWith("a")) {
                user.setGender(Gender.WOMAN);
            } else {
                user.setGender(Gender.MAN);
            }
        }

        return context.proceed();
    }
}
