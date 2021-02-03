package com.wanzh.logdemo.logdemo.component.aspect;

import com.wanzh.logdemo.logdemo.component.common.LogEnum;

import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:    LogAnno
 * Package:    com.wanzh.logdemo.logdemo.component.aspect
 * Description:
 * Datetime:    2021/1/24   19:22
 * Author:   wanzhongwen@clodwalk.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnno {

    LogEnum operateType();
}
