package com.vp.learning.beans.lifecycle;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
//@Lazy
//@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class Subject {

    private String title ;

    public Subject(){}

    public Subject(String title) {
        this.title = title;
    }

    public String toString(){
        return this.title;
    }

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
