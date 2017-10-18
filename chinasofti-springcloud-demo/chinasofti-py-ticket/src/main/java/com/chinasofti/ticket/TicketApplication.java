package com.chinasofti.ticket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chinasofti.ticket.mapper")
public class TicketApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(TicketApplication.class, args);
	}

}
