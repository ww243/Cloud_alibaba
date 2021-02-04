package com.my.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/04 19:09
 */
@RestController
public class OrdersController {

    private static final Logger log = LoggerFactory.getLogger(OrdersController.class);

    @GetMapping("order")
    public String order(){
        log.info("订单服务已被调用！！！");
        return "订单服务调用成功。";
    }

}
