package com.chinasofti.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.chinasofti.springcloud")
public class MicroserviceSimpleProviderUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
  }
}
