package com.wms.configure;

import com.wms.inter.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Classname SchedualServiceHiHystric
 * @Description TODO
 * @Date 2020/2/26 17:50
 * @Created by ZF-JS
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFormClientOne(String name) {
        return "sorry "+name;
    }
}
