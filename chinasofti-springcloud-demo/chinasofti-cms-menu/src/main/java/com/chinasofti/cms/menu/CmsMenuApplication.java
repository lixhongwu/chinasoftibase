package com.chinasofti.cms.menu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication//入口
@EnableDiscoveryClient//注册中心
@MapperScan("com.chinasofti.cms.menu.mapper") //添加菜单mapper扫描注解 
public class CmsMenuApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(CmsMenuApplication.class, args);
	}

}
