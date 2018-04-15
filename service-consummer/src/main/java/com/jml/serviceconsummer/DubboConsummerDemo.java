package com.jml.serviceconsummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.jml.serviceconsummer.controller")
public class DubboConsummerDemo {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsummerDemo.class, args);
    }
}
