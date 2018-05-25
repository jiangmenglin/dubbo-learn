package com.jml.serviceconsummer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jml.serviceapi.dto.Clientdetails;
import com.jml.serviceapi.service.ClientdetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-24
 * @Description:
 */
@RestController
public class ClientdetailsController {
    @Reference(version = "1.0.0")
    private ClientdetailsService clientdetailsService;

    @PostMapping("Clientdetails/addOne")
    public int addOne(Clientdetails record) {
        return clientdetailsService.insert(record);
    }

    @GetMapping("Clientdetails/deleteOne")
    public int deleteByPrimaryKey(String appid) {
        return clientdetailsService.deleteByPrimaryKey(appid);
    }

    @GetMapping("Clientdetails/findAll")
    public List<Clientdetails> findAll() {
        return clientdetailsService.selectAll();
    }
}
