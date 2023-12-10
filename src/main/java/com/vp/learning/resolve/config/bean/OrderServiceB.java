package com.vp.learning.resolve.config.bean;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OrderServiceB implements OrderService {
    @Override
    public String order() {
        return "Order from Service B";
    }
}
