package com.jml.service;

import com.jml.BaseTest;
import com.jml.serviceapi.dto.City;
import com.jml.serviceprovider.dao.CityMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
public class ProviderTest extends BaseTest {

    @Autowired
    private CityMapper cityMapper;

    @Test
    public void testSelectById() {
        City city = cityMapper.findById(1l);
        System.out.println(city.toString());
    }

    @Test
    public void testSelectByState() {
        City city = cityMapper.findByState("CA");
        System.out.println(city.toString());
    }
}
