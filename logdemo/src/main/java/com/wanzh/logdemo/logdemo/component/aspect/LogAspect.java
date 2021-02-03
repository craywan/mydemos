package com.wanzh.logdemo.logdemo.component.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ClassName:   构造统一的切面
 * Package:    com.wanzh.logdemo.logdemo.component.aspect
 * Description:
 * Datetime:    2021/1/24   14:24
 * Author:   wanzhongwen@clodwalk.com
 */
@Component
@Aspect
public class LogAspect {


    /**
     * 环绕处理业务层方法的 日志信息，
     * @param point
     * @return
     */


    @Around("@annotation(com.wanzh.logdemo.logdemo.component.aspect.LogAnno)")
    public Object logAroundAdvice(ProceedingJoinPoint point){


        return null;

    }

}
