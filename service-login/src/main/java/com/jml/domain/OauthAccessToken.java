package com.jml.domain;

import java.io.Serializable;

public class OauthAccessToken implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_access_token.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_access_token.client_id
     *
     * @mbggenerated
     */
    private String clientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_access_token.token_id
     *
     * @mbggenerated
     */
    private String tokenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_access_token.authentication_id
     *
     * @mbggenerated
     */
    private String authenticationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_access_token.refresh_token
     *
     * @mbggenerated
     */
    private String refreshToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_access_token.token
     *
     * @mbggenerated
     */
    private byte[] token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_access_token.authentication
     *
     * @mbggenerated
     */
    private byte[] authentication;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauth_access_token
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_access_token.user_name
     *
     * @return the value of oauth_access_token.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_access_token.user_name
     *
     * @param userName the value for oauth_access_token.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_access_token.client_id
     *
     * @return the value of oauth_access_token.client_id
     *
     * @mbggenerated
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_access_token.client_id
     *
     * @param clientId the value for oauth_access_token.client_id
     *
     * @mbggenerated
     */
    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_access_token.token_id
     *
     * @return the value of oauth_access_token.token_id
     *
     * @mbggenerated
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_access_token.token_id
     *
     * @param tokenId the value for oauth_access_token.token_id
     *
     * @mbggenerated
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_access_token.authentication_id
     *
     * @return the value of oauth_access_token.authentication_id
     *
     * @mbggenerated
     */
    public String getAuthenticationId() {
        return authenticationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_access_token.authentication_id
     *
     * @param authenticationId the value for oauth_access_token.authentication_id
     *
     * @mbggenerated
     */
    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId == null ? null : authenticationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_access_token.refresh_token
     *
     * @return the value of oauth_access_token.refresh_token
     *
     * @mbggenerated
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_access_token.refresh_token
     *
     * @param refreshToken the value for oauth_access_token.refresh_token
     *
     * @mbggenerated
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_access_token.token
     *
     * @return the value of oauth_access_token.token
     *
     * @mbggenerated
     */
    public byte[] getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_access_token.token
     *
     * @param token the value for oauth_access_token.token
     *
     * @mbggenerated
     */
    public void setToken(byte[] token) {
        this.token = token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_access_token.authentication
     *
     * @return the value of oauth_access_token.authentication
     *
     * @mbggenerated
     */
    public byte[] getAuthentication() {
        return authentication;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_access_token.authentication
     *
     * @param authentication the value for oauth_access_token.authentication
     *
     * @mbggenerated
     */
    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_access_token
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userName=").append(userName);
        sb.append(", clientId=").append(clientId);
        sb.append(", tokenId=").append(tokenId);
        sb.append(", authenticationId=").append(authenticationId);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", token=").append(token);
        sb.append(", authentication=").append(authentication);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}