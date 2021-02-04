package com.my.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/04 19:37
 */
@Configuration
public class BeansConfig {

    @Bean
    @LoadBalanced //创建一个带有负载均衡客户端调用对象
    public RestTemplate getresttemplate(){
        return new RestTemplate();
    }

}


