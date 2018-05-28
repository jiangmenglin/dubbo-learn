package com.jml.fixfunds.dao;

import com.jml.fixfunds.domain.FfBaseCommitteeMember;
import java.util.List;

public interface FfBaseCommitteeMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_COMMITTEE_MEMBER
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_COMMITTEE_MEMBER
     *
     * @mbggenerated
     */
    int insert(FfBaseCommitteeMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_COMMITTEE_MEMBER
     *
     * @mbggenerated
     */
    FfBaseCommitteeMember selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_COMMITTEE_MEMBER
     *
     * @mbggenerated
     */
    List<FfBaseCommitteeMember> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_COMMITTEE_MEMBER
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FfBaseCommitteeMember record);
}