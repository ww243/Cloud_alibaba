package com.my.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ljn
 * @Description:
 * @Date:2021/02/09 19:28
 */
@RestController
public class HelleConfroller {

    private static final Logger log = LoggerFactory.getLogger(HelleConfroller.class);

    @GetMapping("hello")
    public String hello(){
        log.info("Hello !");
        return "Hello ?";
    }
}
