package com.vp.learning;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

//    @Bean(name = "myCalculator")
//    @Bean(autowire = Autowire.BY_TYPE)
    @Bean
    Calculator getCalculator(){

        return new Calculator();
    }
}
