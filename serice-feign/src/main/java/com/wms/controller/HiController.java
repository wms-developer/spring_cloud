package com.wms.controller;

import com.wms.inter.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HiController
 * @Description TODO
 * @Date 2020/2/26 15:04
 * @Created by ZF-JS
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return "from feign"+schedualServiceHi.sayHiFormClientOne(name);
    }
}
