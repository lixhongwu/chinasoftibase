package com.huateng.weixin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.huateng.weixin.util.RedisTokenHelper;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.huateng.weixin.mapper")
public class WXInterfaceApplication
{
    public static void main( String[] args )
    {
    	SpringApplication.run(WXInterfaceApplication.class,args);
    }
    @Bean //注入bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
    @Bean //注入bean
	public RedisTokenHelper redisTokenHelper() {
		return new RedisTokenHelper();
	}
}
