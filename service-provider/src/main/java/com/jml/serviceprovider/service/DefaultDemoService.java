package com.jml.serviceprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jml.serviceapi.DemoService;
import com.jml.serviceapi.dto.User;

import java.util.List;

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

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
