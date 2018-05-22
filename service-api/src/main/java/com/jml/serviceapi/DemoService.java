package com.jml.serviceapi;

import com.jml.serviceapi.dto.User;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
public interface DemoService {
    String sayHello(String name);

    List<User> findAllUsers();

    void updateUser(User user);

    void deleteUser(String id);
}
