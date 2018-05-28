package com.jml.fixfunds.dao;

import com.jml.fixfunds.domain.FfBaseBuilding;
import java.util.List;

public interface FfBaseBuildingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_BUILDING
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_BUILDING
     *
     * @mbggenerated
     */
    int insert(FfBaseBuilding record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_BUILDING
     *
     * @mbggenerated
     */
    FfBaseBuilding selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_BUILDING
     *
     * @mbggenerated
     */
    List<FfBaseBuilding> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_BUILDING
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FfBaseBuilding record);
}