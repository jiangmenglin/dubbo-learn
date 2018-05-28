package com.jml.service.building;

import com.alibaba.dubbo.config.annotation.Service;
import com.fixfunds.api.building.BuildingService;
import com.jml.fixfunds.dao.FfBaseBuildingMapper;
import com.jml.fixfunds.domain.FfBaseBuilding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-28
 * @Description:
 */
@Transactional
@Service(version = "1.0.1")
public class DubboBuildingService implements BuildingService {

    @Autowired
    private FfBaseBuildingMapper buildingMapper;

    @Override
    public int add(List<FfBaseBuilding> list) {
        int count = 0;
        for (FfBaseBuilding f : list) {
            count += buildingMapper.insert(f);
        }
        return count;
    }

    @Override
    public int delete(List<FfBaseBuilding> list) {
        int count = 0;
        for (FfBaseBuilding f : list) {
            count += buildingMapper.deleteByPrimaryKey(f.getId());
        }
        return count;
    }

    @Override
    public FfBaseBuilding findById(String id) {
        return buildingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(FfBaseBuilding record) {
        return buildingMapper.updateByPrimaryKey(record);
    }
}
