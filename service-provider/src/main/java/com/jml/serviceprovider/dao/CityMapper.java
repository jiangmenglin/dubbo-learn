package com.jml.serviceprovider.dao;

import com.jml.serviceprovider.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where id = #{id}")
    City findById(Long id);

    @Select("select * from city where state = #{state}")
    City findByState(String state);
}
