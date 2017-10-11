package com.chinasofti.py.goodsorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chinasofti.py.goodsorder.mapper")
public class PyGoodsOrderApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(PyGoodsOrderApplication.class, args);
	}

}
