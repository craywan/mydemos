package com.wanzh.logdemo.logdemo.component.common;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * ClassName:    UserLogDTO
 * Package:    com.wanzh.logdemo.logdemo.component.common
 * Description:
 * Datetime:    2021/1/25   11:04
 * Author:   wanzhongwen@clodwalk.com
 */
@Data
@Component
public class UserLogDTO extends BaseLogDTO implements Serializable {
    private static final ThreadLocal<UserLogDTO> USER_LOG_THREAD_LOCAL = new ThreadLocal<>();

    public static void initPlatformLog(UserLogDTO p) {
        setPlatformLog(p);
    }

    public static UserLogDTO getPlatformLog() {
        return USER_LOG_THREAD_LOCAL.get();
    }

    public static void setPlatformLog(UserLogDTO platformLog) {
        USER_LOG_THREAD_LOCAL.set(platformLog);
    }

    public static void removePlatformLog() {
        USER_LOG_THREAD_LOCAL.remove();
    }

//    public static void setFailLog(cn.cloudwalk.ocean.library.common.dict.ResultCode type) {
//        UserLogDTO.getPlatformLog().setErr_code(type.getKey());
//        UserLogDTO.getPlatformLog().setErr_msg(type.getValue());
//    }

    public static void setFailLog(String code, String msg) {
        UserLogDTO.getPlatformLog().setErr_code(code);
        UserLogDTO.getPlatformLog().setErr_msg(msg);
    }

}
