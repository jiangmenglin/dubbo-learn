package com.jml.serviceprovider.dao;

import com.jml.serviceapi.domain.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

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

    @Insert("insert into citty(name, state, country) values(#{name}, #{state}, #{country})")
    void insertOne(City city);

    @Update("update city set name = #{name}, state = #{state}, country = #{country}")
    void updateCity(City city);

    @Select("select * from city")
    List<City> findAll();
}
