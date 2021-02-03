package com.wanzh.logdemo.logdemo.component.common;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:    BaseLogDTO
 * Package:    com.wanzh.logdemo.logdemo.component.common
 * Description:
 * Datetime:    2021/1/24   19:42
 * Author:   wanzhongwen@clodwalk.com
 */
@Data
public class BaseLogDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String ip;
    private String time_stamp;
    private String state;
    private String service_interface_type;
    private String business_time;
    private String err_code;
    private String err_msg;
    private String remark;

}
