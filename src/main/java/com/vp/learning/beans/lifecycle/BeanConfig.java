package com.vp.learning.beans.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.vp.learning.beans.lifecycle"})
public class BeanConfig {

//    @Bean(initMethod = "setUp", destroyMethod = "clear")
    @Bean
   public Student getStudent() {
        Student student = new Student();
//        student.setUp();
        return new Student();
    }

//    @Bean (initMethod = "init", destroyMethod = "cleanUp")
    @Bean
    public Subject getSubject() {
        return new Subject();
    }



}
