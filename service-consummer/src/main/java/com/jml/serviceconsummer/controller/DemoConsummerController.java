package com.jml.serviceconsummer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jml.serviceapi.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@RestController
public class DemoConsummerController {
    @Reference(
            version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880"
    )
    private DemoService demoService;

    @RequestMapping(value = "/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return demoService.sayHello(name);
    }
}
