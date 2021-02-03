package com.wanzh.logdemo.logdemo.component.common;

/**
 * ClassName:    LogEnum
 * Package:    com.wanzh.logdemo.logdemo.component.common
 * Description:
 * Datetime:    2021/1/24   19:20
 * Author:   wanzhongwen@clodwalk.com
 */
public enum LogEnum {
    SELECT_PERSONINFO("查询个人信息接口","SELECT","/person/select","查询个人详情信息的接口");

    private String name;//接口名称
    private String type;//接口累心
    private String url;//接口路径
    private String desc;//接口描述

    private LogEnum(String name, String type, String url, String desc) {
        this.name = name;
        this.type = type;
        this.url = url;
        this.desc = desc;
    }
}
