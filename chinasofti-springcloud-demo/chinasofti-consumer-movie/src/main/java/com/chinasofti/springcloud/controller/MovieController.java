package com.chinasofti.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chinasofti.springcloud.entity.User;

@RestController
public class MovieController {
  @Autowired
  private RestTemplate restTemplate;

  @Value("${user.userServicePath}")
  private String userServicePath;

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Integer id) {
    return this.restTemplate.getForObject(this.userServicePath + "simple/" + id, User.class);
  }
 
}
