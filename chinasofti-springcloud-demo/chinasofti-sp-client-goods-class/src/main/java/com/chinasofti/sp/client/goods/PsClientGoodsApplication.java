package com.chinasofti.sp.client.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
@MapperScan("com.chinasofti.sp.client.goods.mapper")
public class PsClientGoodsApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(PsClientGoodsApplication.class, args);
	}

}
