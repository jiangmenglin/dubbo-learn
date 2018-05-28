package com.fixfunds.api.building;

import com.jml.fixfunds.domain.FfBaseBuilding;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-28
 * @Description:
 */
public interface BuildingService {

    int add(List<FfBaseBuilding> list);

    int delete(List<FfBaseBuilding> list);

    FfBaseBuilding findById(String id);

    int update(FfBaseBuilding record);
}
