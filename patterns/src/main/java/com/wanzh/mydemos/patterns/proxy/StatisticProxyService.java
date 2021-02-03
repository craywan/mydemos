package com.wanzh.mydemos.patterns.proxy;

import com.google.common.collect.Lists;
import com.wanzh.mydemos.patterns.service.OrderService;
import com.wanzh.mydemos.patterns.service.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName:    StatisticProxyService
 * Package:    com.wanzh.mydemos.patterns.proxy
 * Description: 静态代理代理类
 * Datetime:    2021/2/3   14:45
 * Author:   wanzhongwen@clodwalk.com
 */
@Slf4j
@Component
public class StatisticProxyService implements OrderService {

    @Autowired
    private OrderServiceImpl orderService;

    private void before() {
        log.info("statistic代理之前");
    }

    private void after() {
        log.info("statistic代理之后");
    }

    public String orderObjects(List<String> objectIds) {
        before();
        String result = orderService.orderObjects(Lists.newArrayList("110"));
        after();
        return result;
    }
}
