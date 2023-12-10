package com.vp.learning.beans.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class Student /*implements InitializingBean, DisposableBean*/ {

    @Autowired
    private String[] favoriteColor;

    @Autowired
    private List<Subject> subjects;

    public void displayColors() {
        System.out.println(Arrays.toString(favoriteColor));
    }
    public void displaySubject() {
        System.out.println(subjects);
    }




//    @Autowired
//    @Lazy
//    private Subject subject;

//    @PostConstruct
    public void setUp(){
        System.out.println("Student was created");
    }

//    @PreDestroy
    public void clear(){
        System.out.println("Student was destroyed");
    }

    public void setFavoriteColor(String[] favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

//    public void display() {
//        System.out.println("---- In method display");
//        subject.setSubject();
//        System.out.println("Display from student");
//    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("After Student was created");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Student was destroyed");
//    }
}
