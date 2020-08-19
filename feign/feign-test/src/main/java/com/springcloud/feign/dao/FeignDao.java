package com.springcloud.feign.dao;

import com.springcloud.feign.server.FeignServer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "eureka-client",fallback = FeignServer.class)
public interface FeignDao {

    @GetMapping(value = "/h1")
    String HelloWorld1();

}
