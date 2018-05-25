package com.jml.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jml.dao.ClientdetailsMapper;
import com.jml.serviceapi.dto.Clientdetails;
import com.jml.serviceapi.service.ClientdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-24
 * @Description:
 */
@Transactional
@Service(version = "1.0.0")
public class ClientdetailsServiceImpl implements ClientdetailsService {
    @Autowired
    private ClientdetailsMapper mapper;
    @Override
    public int deleteByPrimaryKey(String appid) {
        return mapper.deleteByPrimaryKey(appid);
    }

    @Override
    public int insert(Clientdetails record) {

//        return mapper.insert(record);
        return 0;
    }

    @Override
    public Clientdetails selectByPrimaryKey(String appid) {

//        return mapper.selectByPrimaryKey(appid);
        return null;
    }

    @Override
    public List<Clientdetails> selectAll() {

//        return mapper.selectAll();
        return null;
    }

    @Override
    public int updateByPrimaryKey(Clientdetails record) {
         return 0;
//        return mapper.updateByPrimaryKey(record);
    }
}
