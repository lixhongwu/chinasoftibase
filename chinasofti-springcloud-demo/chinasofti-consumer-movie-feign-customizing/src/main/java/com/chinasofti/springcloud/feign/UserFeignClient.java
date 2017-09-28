package com.chinasofti.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.chinasofti.springcloud.entity.User;
import com.chinasofti.springcloud.config.Configuration1;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "chinasofti-provider-user", configuration = Configuration1.class)
public interface UserFeignClient {
  @RequestLine("GET /simple/{id}")
  public User findById(@Param("id") Long id);
}
