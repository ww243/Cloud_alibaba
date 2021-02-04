package com.my.controller;

import com.my.com.my.client.OrdersClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;


/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/04 19:13
 */
@RestController
public class UsersController {

    private static final Logger log = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrdersClient ordersClient;

    @GetMapping("feign")
    public String feign(){
        String order = ordersClient.order();
        log.info("order:{}",order);
        return order;
    }

    @GetMapping("invoke")
    public String invoke(){
        //第一种方式  RestTemplate   缺点:无法实现负载均衡  无法实现高可用
        /*String forObject = new RestTemplate().getForObject("http://localhost:8084/order", String.class);
        log.info("订单服务的结果:{}",forObject);*/

        //第二种方式  discoveryClient  服务发现客户端 日后根据服务名去服务注册中细腻获取服务名对应服务列表
       /* List<ServiceInstance> orders = discoveryClient.getInstances("orders");
        ServiceInstance serviceInstance = orders.get(0);
        URI uri = serviceInstance.getUri();
        log.info("uri:{}",uri);
        String forObject1 = new RestTemplate().getForObject(uri + "/order", String.class);*/

       //第三种方式
        /*ServiceInstance order = loadBalancerClient.choose("orders");
        URI uri = order.getUri();
        log.info("uri:{}",uri);
        String forObject2 = new RestTemplate().getForObject(uri + "/order", String.class);
        return forObject2;*/

        //第四种
        String forObject4 = restTemplate.getForObject("http://orders/order", String.class);
        log.info("result:{}",restTemplate);
        return forObject4;
    }

}
