package com.chinasofti.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//入口

//@MapperScan("com.chinasofti.cms.menu.mapper") //添加菜单mapper扫描注解 
public class CommonApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(CommonApplication.class, args);
	}

}
