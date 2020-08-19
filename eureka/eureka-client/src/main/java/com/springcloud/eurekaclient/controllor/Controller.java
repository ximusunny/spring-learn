package com.springcloud.eurekaclient.controllor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping(value = "/h1")
    public String HelloWorld1() {
        return "来自eureka返回，调用成功！";
    }


}
