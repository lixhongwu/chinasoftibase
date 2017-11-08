package com.chinasofti.wxmgr.menu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chinasofti.wxmgr.menu.mapper")
public class WXMenuApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WXMenuApplication.class, args);
	}

}
