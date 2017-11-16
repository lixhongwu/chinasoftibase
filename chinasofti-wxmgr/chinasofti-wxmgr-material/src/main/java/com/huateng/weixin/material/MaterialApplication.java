package com.huateng.weixin.material;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@SpringBootApplication
@MapperScan("com.huateng.weixin.material.mapper")
@EnableEurekaClient
public class MaterialApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
/*	@Bean
	public Gson gson() {
		return new Gson();
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(MaterialApplication.class, args);
	}
}
