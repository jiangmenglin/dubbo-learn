package com.jml.serviceapi.service;

import com.jml.serviceapi.domain.City;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
public interface CityService {

    void addCity(City city);

    void batchAdd(List<City> cities);

    City selectById(Long id);

    List<City> findAll();

    void updateCity(City city);
}
