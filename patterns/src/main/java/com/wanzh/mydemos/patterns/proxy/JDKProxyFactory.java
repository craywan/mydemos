package com.wanzh.mydemos.patterns.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:    JDKProxyFactory
 * Package:    com.wanzh.mydemos.patterns.proxy
 * Description:
 * Datetime:    2021/2/1   17:51
 * Author:   wanzhongwen@clodwalk.com
 */

@Slf4j
public class JDKProxyFactory {

    private Object target;

    public  JDKProxyFactory(Object target){
        this.target = target;
    }

    public Object getTargetBean(){

        /**
         * newProxyInstance参数定义
         * 1、目标对象使用的类加载器, target.getClass().getClassLoader()
         * 2、目标对象实现接口类型,使用泛型方式类型,target.getClass().getInterfaces()
         * 3、当执行目标对象的方法时,会先调用InvocationHandler的invoke方法, 同时把当前执行目标对象的方法作为参数传入
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       log.info("动态代理前置增强开始");
                       Object returnValue =method.invoke(target,args);
                       log.info("动态代理后置增强");
                       return returnValue;
                    }
                }
        );

    }




}
