package com.vp.learning.beans.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        context.registerShutdownHook();

        System.out.println("Application started");
        Student student = context.getBean(Student.class);
        student.display();
        System.out.println("Finished Application");

//        context.close();

    }
}
