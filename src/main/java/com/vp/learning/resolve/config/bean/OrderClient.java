package com.vp.learning.resolve.config.bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
//@Setter
//@AllArgsConstructor
@RequiredArgsConstructor
public class OrderClient {

//    @Autowired
//    @Qualifier("orderServiceA")
//    @Qualifier("orderServiceB")
//    @Qualifier("serviceA")
//    @Qualifier("serviceA123")
//    @Resource(name = "orderServiceA")

    private final OrderService orderService;
    private int age;

//    User Constructor
//    @Autowired // Spring 4 up is no need
//    public OrderClient(OrderService orderService) {
//        this.orderService = orderService;
//    }

//    User Setter
//    @Autowired
//    public void setOrderService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void displayOrder() {
        System.out.println(orderService.order());
    }
}
