package com.jml.serviceprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jml.serviceapi.dto.City;
import com.jml.serviceapi.service.CityService;
import com.jml.serviceprovider.dao.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
@Transactional
@Service(version = "1.0.0")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;


    @Override
    public void addCity(City city) {
        cityMapper.insertOne(city);
    }

    @Override
    public void batchAdd(List<City> cities) {
        for (City city : cities)
            cityMapper.insertOne(city);
    }

    @Override
    public City selectById(Long id) {
        return cityMapper.findById(id);
    }

    @Override
    public List<City> findAll() {
        return cityMapper.findAll();
    }

    @Override
    public void updateCity(City city) {
        cityMapper.updateCity(city);
    }
}
