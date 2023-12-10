package com.vp.learning.resolve.config.bean;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.vp.learning.resolve.config.bean"})
public class BeanConfig {

//    @Bean
//    OrderService orderService(){
//        return new OrderServiceB();
//    }
//
//    @Bean(autowire = Autowire.BY_TYPE)
//    OrderClient orderClient(){
//        return new OrderClient();
//    }

}
