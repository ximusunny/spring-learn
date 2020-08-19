package com.springcloud.feign.server;

import com.springcloud.feign.dao.FeignDao;
import org.springframework.stereotype.Component;

@Component
public class FeignServer implements FeignDao {

    @Override
    public String HelloWorld1() {
        return "降级处理 error";
    }

}
