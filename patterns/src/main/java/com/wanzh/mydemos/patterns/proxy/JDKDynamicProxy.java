package com.wanzh.mydemos.patterns.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName:    JDKDynamicProxy
 * Package:    com.wanzh.mydemos.patterns.proxy
 * Description:
 * Datetime:    2021/2/2   16:28
 * Author:   wanzhongwen@clodwalk.com
 */
@Slf4j
public class JDKDynamicProxy implements InvocationHandler {

    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("动态代理前置处理");
        Object value = method.invoke(target,args);
        log.info("动态代理后置处理");
        return value;
    }
}


