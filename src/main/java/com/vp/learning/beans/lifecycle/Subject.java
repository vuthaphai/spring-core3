package com.vp.learning.beans.lifecycle;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Lazy
//@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
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
