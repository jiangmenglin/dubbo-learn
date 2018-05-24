package com.jml.serviceapi.dao;

import com.jml.serviceapi.domain.OauthClientDetails;
import java.util.List;

public interface OauthClientDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String clientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated
     */
    int insert(OauthClientDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated
     */
    OauthClientDetails selectByPrimaryKey(String clientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated
     */
    List<OauthClientDetails> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_client_details
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OauthClientDetails record);
}