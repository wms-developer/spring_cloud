package com.wms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/2/25 11:06
 * @Created by ZF-JS
 */
@RestController
public class Test {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "wms") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
