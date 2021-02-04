package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/04 19:06
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients  //开启对openfiegn的支持
public class UsersApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class,args);
    }
}
