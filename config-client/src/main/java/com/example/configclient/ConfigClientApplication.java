package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@RestController
	class test {
		@Value("${foo}")
		private String foo;

		@RequestMapping(value = "/hi")
		public String hi() {
			return foo;
		}
	}
}

@RefreshScope
@RestController
class MessageRestController{

    @Value("${foo:Hello default}")
    private String foo;

    @RequestMapping("/foo")
    String getMessage(){
        return this.foo;
    }
}