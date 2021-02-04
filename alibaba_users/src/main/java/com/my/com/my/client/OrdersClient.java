package com.my.com.my.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/04 19:46
 */
@FeignClient("orders")
public interface OrdersClient {

    @GetMapping("/order")
    String order();
}
