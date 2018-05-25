package com.jml.domain;

import java.io.Serializable;

public class Clientdetails implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.appId
     *
     * @mbggenerated
     */
    private String appid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.resourceIds
     *
     * @mbggenerated
     */
    private String resourceids;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.appSecret
     *
     * @mbggenerated
     */
    private String appsecret;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.scope
     *
     * @mbggenerated
     */
    private String scope;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.grantTypes
     *
     * @mbggenerated
     */
    private String granttypes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.redirectUrl
     *
     * @mbggenerated
     */
    private String redirecturl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.authorities
     *
     * @mbggenerated
     */
    private String authorities;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.access_token_validity
     *
     * @mbggenerated
     */
    private Integer accessTokenValidity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.refresh_token_validity
     *
     * @mbggenerated
     */
    private Integer refreshTokenValidity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.additionalInformation
     *
     * @mbggenerated
     */
    private String additionalinformation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientDetails.autoApproveScopes
     *
     * @mbggenerated
     */
    private String autoapprovescopes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ClientDetails
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.appId
     *
     * @return the value of ClientDetails.appId
     *
     * @mbggenerated
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.appId
     *
     * @param appid the value for ClientDetails.appId
     *
     * @mbggenerated
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.resourceIds
     *
     * @return the value of ClientDetails.resourceIds
     *
     * @mbggenerated
     */
    public String getResourceids() {
        return resourceids;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.resourceIds
     *
     * @param resourceids the value for ClientDetails.resourceIds
     *
     * @mbggenerated
     */
    public void setResourceids(String resourceids) {
        this.resourceids = resourceids == null ? null : resourceids.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.appSecret
     *
     * @return the value of ClientDetails.appSecret
     *
     * @mbggenerated
     */
    public String getAppsecret() {
        return appsecret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.appSecret
     *
     * @param appsecret the value for ClientDetails.appSecret
     *
     * @mbggenerated
     */
    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.scope
     *
     * @return the value of ClientDetails.scope
     *
     * @mbggenerated
     */
    public String getScope() {
        return scope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.scope
     *
     * @param scope the value for ClientDetails.scope
     *
     * @mbggenerated
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.grantTypes
     *
     * @return the value of ClientDetails.grantTypes
     *
     * @mbggenerated
     */
    public String getGranttypes() {
        return granttypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.grantTypes
     *
     * @param granttypes the value for ClientDetails.grantTypes
     *
     * @mbggenerated
     */
    public void setGranttypes(String granttypes) {
        this.granttypes = granttypes == null ? null : granttypes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.redirectUrl
     *
     * @return the value of ClientDetails.redirectUrl
     *
     * @mbggenerated
     */
    public String getRedirecturl() {
        return redirecturl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.redirectUrl
     *
     * @param redirecturl the value for ClientDetails.redirectUrl
     *
     * @mbggenerated
     */
    public void setRedirecturl(String redirecturl) {
        this.redirecturl = redirecturl == null ? null : redirecturl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.authorities
     *
     * @return the value of ClientDetails.authorities
     *
     * @mbggenerated
     */
    public String getAuthorities() {
        return authorities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.authorities
     *
     * @param authorities the value for ClientDetails.authorities
     *
     * @mbggenerated
     */
    public void setAuthorities(String authorities) {
        this.authorities = authorities == null ? null : authorities.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.access_token_validity
     *
     * @return the value of ClientDetails.access_token_validity
     *
     * @mbggenerated
     */
    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.access_token_validity
     *
     * @param accessTokenValidity the value for ClientDetails.access_token_validity
     *
     * @mbggenerated
     */
    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.refresh_token_validity
     *
     * @return the value of ClientDetails.refresh_token_validity
     *
     * @mbggenerated
     */
    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.refresh_token_validity
     *
     * @param refreshTokenValidity the value for ClientDetails.refresh_token_validity
     *
     * @mbggenerated
     */
    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.additionalInformation
     *
     * @return the value of ClientDetails.additionalInformation
     *
     * @mbggenerated
     */
    public String getAdditionalinformation() {
        return additionalinformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.additionalInformation
     *
     * @param additionalinformation the value for ClientDetails.additionalInformation
     *
     * @mbggenerated
     */
    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation == null ? null : additionalinformation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientDetails.autoApproveScopes
     *
     * @return the value of ClientDetails.autoApproveScopes
     *
     * @mbggenerated
     */
    public String getAutoapprovescopes() {
        return autoapprovescopes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientDetails.autoApproveScopes
     *
     * @param autoapprovescopes the value for ClientDetails.autoApproveScopes
     *
     * @mbggenerated
     */
    public void setAutoapprovescopes(String autoapprovescopes) {
        this.autoapprovescopes = autoapprovescopes == null ? null : autoapprovescopes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ClientDetails
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appid=").append(appid);
        sb.append(", resourceids=").append(resourceids);
        sb.append(", appsecret=").append(appsecret);
        sb.append(", scope=").append(scope);
        sb.append(", granttypes=").append(granttypes);
        sb.append(", redirecturl=").append(redirecturl);
        sb.append(", authorities=").append(authorities);
        sb.append(", accessTokenValidity=").append(accessTokenValidity);
        sb.append(", refreshTokenValidity=").append(refreshTokenValidity);
        sb.append(", additionalinformation=").append(additionalinformation);
        sb.append(", autoapprovescopes=").append(autoapprovescopes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}