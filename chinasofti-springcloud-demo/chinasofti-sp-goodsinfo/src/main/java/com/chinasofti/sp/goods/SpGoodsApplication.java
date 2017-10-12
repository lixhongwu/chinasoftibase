package com.chinasofti.sp.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
@MapperScan("com.chinasofti.sp.goods.mapper")
public class SpGoodsApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpGoodsApplication.class, args);
	}

}
