package com.jml.serviceconsummer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fixfunds.api.building.BuildingService;
import com.jml.fixfunds.domain.FfBaseBuilding;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-28
 * @Description:
 */
@RestController
public class BuildingController {

    @Reference(version = "1.0.1")
    private BuildingService buildingService;

    @PostMapping(value = "/building/add")
    public int add(List<FfBaseBuilding> buildings) {
        return buildingService.add(buildings);
    }

    @GetMapping(value = "/building/findById/{id}")
    public FfBaseBuilding findById(@PathVariable String id) {
        return buildingService.findById(id);
    }
}
