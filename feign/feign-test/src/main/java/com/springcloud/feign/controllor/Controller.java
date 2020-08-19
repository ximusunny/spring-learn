package com.springcloud.feign.controllor;


import com.springcloud.feign.dao.FeignDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @Autowired
    private FeignDao dao;

    @GetMapping(value = "/feign")
    public String HelloWorld1() {
        log.info("开始调用dao");
        return dao.HelloWorld1();
    }


}
