package com.my.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/04 21:01
 */
@RestController
@RefreshScope  //在JVM运行过程中检测配置变化立即生效
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @Value("${name}")
    private String name;

    @GetMapping("test")
    public String test(){
        log.info("test service invoke.....");
        return name;
    }

}
