package com.vp.learning.beans.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        String[] beans = context.getBeanDefinitionNames();
        Arrays.stream(beans)
                .filter(n->!n.contains("springframework"))
                .forEach(System.out::println);

//        for (String bean: beans){
//            System.out.println(bean);
//        }


    }

    void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);

        context.registerShutdownHook();

        System.out.println("Application started");
        Student student = context.getBean(Student.class);
        Student student2 = context2.getBean(Student.class);
//        student.display();
//        Subject subject = context.getBean(Subject.class);
//        System.out.println("Finished Application");

//        context.close();

        System.out.println(System.identityHashCode(student));
        System.out.println(System.identityHashCode(student2));
    }

}
