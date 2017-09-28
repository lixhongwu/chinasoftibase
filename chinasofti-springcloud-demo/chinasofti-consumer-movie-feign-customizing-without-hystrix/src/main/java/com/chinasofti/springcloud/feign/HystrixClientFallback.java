package com.chinasofti.springcloud.feign;

import org.springframework.stereotype.Component;

import com.chinasofti.springcloud.entity.User;

@Component
public class HystrixClientFallback implements UserFeignClient {

  @Override
  public User findById(Long id) {
    User user = new User();
    user.setId(0L);
    return user;
  }
}