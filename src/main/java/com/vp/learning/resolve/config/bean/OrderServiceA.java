package com.vp.learning.resolve.config.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service("serviceA")
//@Qualifier("serviceA123")
public class OrderServiceA implements OrderService {
    @Override
    public String order() {
        return "Order from Service A";
    }
}
