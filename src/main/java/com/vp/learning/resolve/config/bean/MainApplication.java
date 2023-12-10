package com.vp.learning.resolve.config.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        OrderClient orderClient = context.getBean(OrderClient.class);
        orderClient.displayOrder();

    }
}
