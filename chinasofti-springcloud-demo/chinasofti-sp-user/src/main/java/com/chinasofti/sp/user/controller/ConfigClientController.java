package com.chinasofti.sp.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

  @Value("${spring.datasource.url}")
  private String url;

  @GetMapping("/url")
  public String getProfile() {
    return this.url;
  }
}
