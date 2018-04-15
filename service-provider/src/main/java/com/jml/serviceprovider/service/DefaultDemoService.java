package com.jml.serviceprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jml.serviceapi.DemoService;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + " how are you?";
    }
}
