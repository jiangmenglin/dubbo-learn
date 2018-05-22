package com.jml;

import com.jml.serviceprovider.DubboProviderDemo;
import com.jml.serviceprovider.dao.CityMapper;
import com.jml.serviceprovider.domain.City;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboProviderDemo.class)
public class ProviderTest {

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
