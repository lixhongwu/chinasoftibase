package com.huateng.weixin.message;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@MapperScan("com.huateng.weixin.message.mapper")
@EnableEurekaClient
public class MessageApplication {

	//ribbon负载均衡
	@Bean //注入bean
	@LoadBalanced //开启负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

	
	public static void main(String[] args) {
		SpringApplication.run(MessageApplication.class, args);
	}
}
