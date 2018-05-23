package com.jml.dao;

import com.jml.BaseTest;
import com.jml.serviceprovider.dao.CityMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
public class CityMapperTest extends BaseTest {

    @Autowired
    private CityMapper cityMapper;

    @Test
    public void testSelectById() {
        System.out.println(cityMapper.findById(1l).toString());
    }
}
