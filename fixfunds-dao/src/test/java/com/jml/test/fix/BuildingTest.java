package com.jml.test.fix;

import com.jml.fixfunds.dao.FfBaseBuildingMapper;
import com.jml.fixfunds.domain.FfBaseBuilding;
import com.jml.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

/**
 * @Author: jml
 * @Date: 18-5-28
 * @Description:
 */
public class BuildingTest extends BaseTest {

    @Autowired
    private FfBaseBuildingMapper mapper;

    @Test
    public void testInsert() {
        for (int i = 0;i < 10;i++) {
            FfBaseBuilding ff = new FfBaseBuilding();
            ff.setId(UUID.randomUUID().toString());
            ff.setBuildingAddress("bei jing");
            ff.setManualBuildingNo(UUID.randomUUID().toString());
            mapper.insert(ff);
        }
    }

    @Test
    public void test() {
        List<FfBaseBuilding> list = mapper.selectAll();
        if (list != null && list.size() > 0) {
            FfBaseBuilding f = list.get(0);
            f.setBuildingAddress("cheng du");
            mapper.updateByPrimaryKey(f);
        }
    }

    @Test
    public void testSelectAll() {
        System.out.println(mapper.selectAll());
    }

    @Test
    public void testDeleteByPK() {
        List<FfBaseBuilding> list = mapper.selectAll();
        for (FfBaseBuilding f : list)
            System.out.println(mapper.deleteByPrimaryKey(f.getId()));
    }
}
