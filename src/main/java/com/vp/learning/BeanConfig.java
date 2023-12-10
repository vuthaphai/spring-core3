package com.vp.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

//    @Bean(name = "myCalculator")
    @Bean
    Calculator getCalculator(){

        return new Calculator();
    }
}
