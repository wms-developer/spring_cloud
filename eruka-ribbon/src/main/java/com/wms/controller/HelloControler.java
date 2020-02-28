package com.wms.controller;

import com.wms.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloControler
 * @Description TODO
 * @Date 2020/2/26 11:16
 * @Created by ZF-JS
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return "from ribbon "+helloService.hiService(name);
    }
}
