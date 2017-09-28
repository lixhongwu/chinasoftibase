package com.chinasofti.springcloud.feign;

public class FeignClient2Fallback implements FeignClient2 {

  @Override
  public String findServiceInfoFromEurekaByServiceName(String serviceName) {
    return "haha";
  }

}
