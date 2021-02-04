package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/04 18:41
 */
@SpringBootApplication
@EnableDiscoveryClient  //发现服务注册发现
public class NacosclientApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosclientApplication.class,args);
    }
}
