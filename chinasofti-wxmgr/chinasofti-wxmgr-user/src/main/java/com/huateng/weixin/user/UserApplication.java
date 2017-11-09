package com.huateng.weixin.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@SpringBootApplication
public class UserApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public Gson gson() {
		return new Gson();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
