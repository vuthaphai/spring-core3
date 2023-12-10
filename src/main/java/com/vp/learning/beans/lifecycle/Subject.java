package com.vp.learning.beans.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Subject {

    private String title;

//    @PostConstruct
    public void init() {
        System.out.println("Subject was created");
    }

//    @PreDestroy
    public void cleanUp(){
        System.out.println("Subject was destroyed");
    }


    public void setSubject() {
        System.out.println("Set subject method is called");
    }

}
