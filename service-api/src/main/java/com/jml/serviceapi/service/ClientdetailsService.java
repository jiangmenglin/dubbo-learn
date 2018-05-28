package com.jml.serviceapi.service;

import com.jml.serviceapi.dto.Clientdetails;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-24
 * @Description:
 */
public interface ClientdetailsService {

    int deleteByPrimaryKey(String appid);

    int insert(Clientdetails record);

    Clientdetails selectByPrimaryKey(String appid);

    List<Clientdetails> selectAll();

    int updateByPrimaryKey(Clientdetails record);
}
