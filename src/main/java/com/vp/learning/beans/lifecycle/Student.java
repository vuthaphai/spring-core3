package com.vp.learning.beans.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Student implements InitializingBean, DisposableBean {

    @Autowired
    private Subject subject;

//    @PostConstruct
    public void setUp(){
        System.out.println("Student was created");
    }

//    @PreDestroy
    public void clear(){
        System.out.println("Student was destroyed");
    }

    public void display() {
        subject.setSubject();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Student was created");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Student was destroyed");
    }
}
