package com.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class ErukaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErukaRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced //表示开启负载均衡
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
