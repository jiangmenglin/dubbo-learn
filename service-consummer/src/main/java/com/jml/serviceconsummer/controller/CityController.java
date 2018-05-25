package com.jml.serviceconsummer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jml.serviceapi.dto.City;
import com.jml.serviceapi.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
@RestController
public class CityController {

    @Reference(version = "1.0.0")
    private CityService cityService;

    @GetMapping(value = "/city/findById/{id}")
    public City findById(@PathVariable Long id) {
        City city = cityService.selectById(id);
        return city;
    }

    @GetMapping("/city/findAll")
    public List<City> findAll() {
        List<City> list = cityService.findAll();
        return list;
    }

    @PostMapping("/city/addOne")
    public String addCity(City city) {
        cityService.addCity(city);
        return "SUCCESS";
    }
}
