package com.cloud.isuperfeign;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: isuper
 * Date: 2018/6/14
 * Time: 17:38
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name){
        return "sorry "+name;
    }
}
