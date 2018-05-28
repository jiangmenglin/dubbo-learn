package com.jml.fixfunds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: jml
 * @Date: 18-5-28
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.jml.fixfunds.dao")
public class FixfundsDaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FixfundsDaoApplication.class, args);
    }
}
