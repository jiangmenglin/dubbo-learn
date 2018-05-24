package com.jml.serviceapi.dao;

import com.jml.serviceapi.domain.OauthAccessToken;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthAccessTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_access_token
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("userName") String userName, @Param("clientId") String clientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_access_token
     *
     * @mbggenerated
     */
    int insert(OauthAccessToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_access_token
     *
     * @mbggenerated
     */
    OauthAccessToken selectByPrimaryKey(@Param("userName") String userName, @Param("clientId") String clientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_access_token
     *
     * @mbggenerated
     */
    List<OauthAccessToken> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_access_token
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OauthAccessToken record);
}