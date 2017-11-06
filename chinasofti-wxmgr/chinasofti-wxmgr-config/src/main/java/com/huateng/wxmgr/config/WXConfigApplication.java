package com.huateng.wxmgr.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//配置中心的注解
@EnableConfigServer
@EnableDiscoveryClient
public class WXConfigApplication {
  public static void main(String[] args) {
    SpringApplication.run(WXConfigApplication.class, args);
  }
}
