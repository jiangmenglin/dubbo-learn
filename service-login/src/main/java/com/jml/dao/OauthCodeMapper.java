package com.jml.dao;

import com.jml.domain.OauthCode;

import java.util.List;

public interface OauthCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_code
     *
     * @mbggenerated
     */
    int insert(OauthCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_code
     *
     * @mbggenerated
     */
    List<OauthCode> selectAll();
}