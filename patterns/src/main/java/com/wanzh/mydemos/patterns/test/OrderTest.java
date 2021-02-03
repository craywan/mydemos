package com.wanzh.mydemos.patterns.test;

import com.google.common.collect.Lists;
import com.wanzh.mydemos.patterns.proxy.JDKDynamicProxy;
import com.wanzh.mydemos.patterns.proxy.JDKProxyFactory;
import com.wanzh.mydemos.patterns.service.OrderService;
import com.wanzh.mydemos.patterns.service.OrderServiceImpl;

import java.lang.reflect.Proxy;

/**
 * ClassName:    OrderTest
 * Package:    com.wanzh.mydemos.patterns.test
 * Description:
 * Datetime:    2021/2/2   17:03
 * Author:   wanzhongwen@clodwalk.com
 */
public class OrderTest {
    public static void main(String[] args) {
        //test1
        OrderService orderService = new OrderServiceImpl();
        OrderService orderServiceProxy = (OrderService) new JDKProxyFactory(orderService);
        orderServiceProxy.orderObjects(Lists.newArrayList("110"));

        //test2
        OrderService orderService1 = new OrderServiceImpl();
        OrderService orderServiceProxy1 = (OrderService) Proxy.newProxyInstance(orderService1.getClass().getClassLoader(),
                orderService1.getClass().getInterfaces(),
                new JDKDynamicProxy(orderService1));
        orderServiceProxy1.orderObjects(Lists.newArrayList("120"));
    }
}
