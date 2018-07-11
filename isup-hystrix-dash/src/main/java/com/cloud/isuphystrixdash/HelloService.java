package com.cloud.isuphystrixdash;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: isuper
 * Date: 2018/6/15
 * Time: 14:49
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name){
        return restTemplate.getForObject("http://isuper-hi/hi?name="+name, String.class);
    }

    public String error(String name){
        return "hi "+name+", sorry, error!";
    }
}
