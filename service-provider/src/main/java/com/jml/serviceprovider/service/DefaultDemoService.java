package com.jml.serviceprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jml.serviceapi.service.DemoService;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@Service(version = "1.0.0")
public class DefaultDemoService implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + " how are you?";
    }
}
