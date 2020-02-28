package com.wms.inter;

import com.wms.configure.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname SchedualServiceHi
 * @Description TODO
 * @Date 2020/2/26 15:01
 * @Created by ZF-JS
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping(value = "/hi")
    String sayHiFormClientOne(@RequestParam(value = "name") String name);
}
