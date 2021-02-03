package com.wanzh.mydemos.patterns.service;

import java.util.List;

/**
 * ClassName:    OrderService
 * Package:    com.wanzh.mydemos.patterns.service
 * Description:
 * Datetime:    2021/2/2   17:00
 * Author:   wanzhongwen@clodwalk.com
 */
public interface OrderService {
    /**
     * 支付逻辑
     * @param objectIds
     * @return
     */
    String orderObjects(List<String> objectIds);

}
