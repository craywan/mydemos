package com.wanzh.mydemos.patterns.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:    OrderServiceImpl
 * Package:    com.wanzh.mydemos.patterns.service
 * Description:
 * Datetime:    2021/2/2   17:02
 * Author:   wanzhongwen@clodwalk.com
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService{
    public String orderObjects(List<String> objectIds) {
        return "110";
    }
}
