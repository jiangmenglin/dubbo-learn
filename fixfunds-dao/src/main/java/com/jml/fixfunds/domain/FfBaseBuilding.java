package com.jml.fixfunds.domain;

import java.io.Serializable;
import java.util.Date;

public class FfBaseBuilding implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.LOGIC_BUILDING_CODE
     *
     * @mbggenerated
     */
    private String logicBuildingCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.LOGIC_BUILDING_NO
     *
     * @mbggenerated
     */
    private String logicBuildingNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.BUILDING_NO
     *
     * @mbggenerated
     */
    private String buildingNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.MANUAL_BUILDING_NO
     *
     * @mbggenerated
     */
    private String manualBuildingNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.PK_PROPERTY_AREA_ID
     *
     * @mbggenerated
     */
    private String pkPropertyAreaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.PK_REGION_ID
     *
     * @mbggenerated
     */
    private String pkRegionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.REGION_DES
     *
     * @mbggenerated
     */
    private String regionDes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.PROJECT_NAME
     *
     * @mbggenerated
     */
    private String projectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.ALIAS
     *
     * @mbggenerated
     */
    private String alias;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.PROJECT_CODE
     *
     * @mbggenerated
     */
    private String projectCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.PK_BUILD_UNIT_ID
     *
     * @mbggenerated
     */
    private String pkBuildUnitId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.BUILDING_ADDRESS
     *
     * @mbggenerated
     */
    private String buildingAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.STREET
     *
     * @mbggenerated
     */
    private String street;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SNO
     *
     * @mbggenerated
     */
    private String sno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SADDNO
     *
     * @mbggenerated
     */
    private String saddno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.BUILD_YEAR
     *
     * @mbggenerated
     */
    private Float buildYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.DATA_SOURCE
     *
     * @mbggenerated
     */
    private String dataSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.TRANSFER_TYPE
     *
     * @mbggenerated
     */
    private String transferType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.CAST_PRICE
     *
     * @mbggenerated
     */
    private Float castPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.BUILD_UNIT_NEED_PAY
     *
     * @mbggenerated
     */
    private String buildUnitNeedPay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.IS_DELETED
     *
     * @mbggenerated
     */
    private Float isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.VERSION
     *
     * @mbggenerated
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SYS_CREATE_TIME
     *
     * @mbggenerated
     */
    private Date sysCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SYS_UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date sysUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SYS_DELETE_TIME
     *
     * @mbggenerated
     */
    private Date sysDeleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SYS_CREATE_ID
     *
     * @mbggenerated
     */
    private String sysCreateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SYS_UPDATE_ID
     *
     * @mbggenerated
     */
    private String sysUpdateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FF_BASE_BUILDING.SYS_DELETE_ID
     *
     * @mbggenerated
     */
    private String sysDeleteId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FF_BASE_BUILDING
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.ID
     *
     * @return the value of FF_BASE_BUILDING.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.ID
     *
     * @param id the value for FF_BASE_BUILDING.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.LOGIC_BUILDING_CODE
     *
     * @return the value of FF_BASE_BUILDING.LOGIC_BUILDING_CODE
     *
     * @mbggenerated
     */
    public String getLogicBuildingCode() {
        return logicBuildingCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.LOGIC_BUILDING_CODE
     *
     * @param logicBuildingCode the value for FF_BASE_BUILDING.LOGIC_BUILDING_CODE
     *
     * @mbggenerated
     */
    public void setLogicBuildingCode(String logicBuildingCode) {
        this.logicBuildingCode = logicBuildingCode == null ? null : logicBuildingCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.LOGIC_BUILDING_NO
     *
     * @return the value of FF_BASE_BUILDING.LOGIC_BUILDING_NO
     *
     * @mbggenerated
     */
    public String getLogicBuildingNo() {
        return logicBuildingNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.LOGIC_BUILDING_NO
     *
     * @param logicBuildingNo the value for FF_BASE_BUILDING.LOGIC_BUILDING_NO
     *
     * @mbggenerated
     */
    public void setLogicBuildingNo(String logicBuildingNo) {
        this.logicBuildingNo = logicBuildingNo == null ? null : logicBuildingNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.BUILDING_NO
     *
     * @return the value of FF_BASE_BUILDING.BUILDING_NO
     *
     * @mbggenerated
     */
    public String getBuildingNo() {
        return buildingNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.BUILDING_NO
     *
     * @param buildingNo the value for FF_BASE_BUILDING.BUILDING_NO
     *
     * @mbggenerated
     */
    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.MANUAL_BUILDING_NO
     *
     * @return the value of FF_BASE_BUILDING.MANUAL_BUILDING_NO
     *
     * @mbggenerated
     */
    public String getManualBuildingNo() {
        return manualBuildingNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.MANUAL_BUILDING_NO
     *
     * @param manualBuildingNo the value for FF_BASE_BUILDING.MANUAL_BUILDING_NO
     *
     * @mbggenerated
     */
    public void setManualBuildingNo(String manualBuildingNo) {
        this.manualBuildingNo = manualBuildingNo == null ? null : manualBuildingNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.PK_PROPERTY_AREA_ID
     *
     * @return the value of FF_BASE_BUILDING.PK_PROPERTY_AREA_ID
     *
     * @mbggenerated
     */
    public String getPkPropertyAreaId() {
        return pkPropertyAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.PK_PROPERTY_AREA_ID
     *
     * @param pkPropertyAreaId the value for FF_BASE_BUILDING.PK_PROPERTY_AREA_ID
     *
     * @mbggenerated
     */
    public void setPkPropertyAreaId(String pkPropertyAreaId) {
        this.pkPropertyAreaId = pkPropertyAreaId == null ? null : pkPropertyAreaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.PK_REGION_ID
     *
     * @return the value of FF_BASE_BUILDING.PK_REGION_ID
     *
     * @mbggenerated
     */
    public String getPkRegionId() {
        return pkRegionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.PK_REGION_ID
     *
     * @param pkRegionId the value for FF_BASE_BUILDING.PK_REGION_ID
     *
     * @mbggenerated
     */
    public void setPkRegionId(String pkRegionId) {
        this.pkRegionId = pkRegionId == null ? null : pkRegionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.REGION_DES
     *
     * @return the value of FF_BASE_BUILDING.REGION_DES
     *
     * @mbggenerated
     */
    public String getRegionDes() {
        return regionDes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.REGION_DES
     *
     * @param regionDes the value for FF_BASE_BUILDING.REGION_DES
     *
     * @mbggenerated
     */
    public void setRegionDes(String regionDes) {
        this.regionDes = regionDes == null ? null : regionDes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.PROJECT_NAME
     *
     * @return the value of FF_BASE_BUILDING.PROJECT_NAME
     *
     * @mbggenerated
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.PROJECT_NAME
     *
     * @param projectName the value for FF_BASE_BUILDING.PROJECT_NAME
     *
     * @mbggenerated
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.ALIAS
     *
     * @return the value of FF_BASE_BUILDING.ALIAS
     *
     * @mbggenerated
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.ALIAS
     *
     * @param alias the value for FF_BASE_BUILDING.ALIAS
     *
     * @mbggenerated
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.PROJECT_CODE
     *
     * @return the value of FF_BASE_BUILDING.PROJECT_CODE
     *
     * @mbggenerated
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.PROJECT_CODE
     *
     * @param projectCode the value for FF_BASE_BUILDING.PROJECT_CODE
     *
     * @mbggenerated
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.PK_BUILD_UNIT_ID
     *
     * @return the value of FF_BASE_BUILDING.PK_BUILD_UNIT_ID
     *
     * @mbggenerated
     */
    public String getPkBuildUnitId() {
        return pkBuildUnitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.PK_BUILD_UNIT_ID
     *
     * @param pkBuildUnitId the value for FF_BASE_BUILDING.PK_BUILD_UNIT_ID
     *
     * @mbggenerated
     */
    public void setPkBuildUnitId(String pkBuildUnitId) {
        this.pkBuildUnitId = pkBuildUnitId == null ? null : pkBuildUnitId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.BUILDING_ADDRESS
     *
     * @return the value of FF_BASE_BUILDING.BUILDING_ADDRESS
     *
     * @mbggenerated
     */
    public String getBuildingAddress() {
        return buildingAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.BUILDING_ADDRESS
     *
     * @param buildingAddress the value for FF_BASE_BUILDING.BUILDING_ADDRESS
     *
     * @mbggenerated
     */
    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress == null ? null : buildingAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.STREET
     *
     * @return the value of FF_BASE_BUILDING.STREET
     *
     * @mbggenerated
     */
    public String getStreet() {
        return street;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.STREET
     *
     * @param street the value for FF_BASE_BUILDING.STREET
     *
     * @mbggenerated
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SNO
     *
     * @return the value of FF_BASE_BUILDING.SNO
     *
     * @mbggenerated
     */
    public String getSno() {
        return sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SNO
     *
     * @param sno the value for FF_BASE_BUILDING.SNO
     *
     * @mbggenerated
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SADDNO
     *
     * @return the value of FF_BASE_BUILDING.SADDNO
     *
     * @mbggenerated
     */
    public String getSaddno() {
        return saddno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SADDNO
     *
     * @param saddno the value for FF_BASE_BUILDING.SADDNO
     *
     * @mbggenerated
     */
    public void setSaddno(String saddno) {
        this.saddno = saddno == null ? null : saddno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.BUILD_YEAR
     *
     * @return the value of FF_BASE_BUILDING.BUILD_YEAR
     *
     * @mbggenerated
     */
    public Float getBuildYear() {
        return buildYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.BUILD_YEAR
     *
     * @param buildYear the value for FF_BASE_BUILDING.BUILD_YEAR
     *
     * @mbggenerated
     */
    public void setBuildYear(Float buildYear) {
        this.buildYear = buildYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.DATA_SOURCE
     *
     * @return the value of FF_BASE_BUILDING.DATA_SOURCE
     *
     * @mbggenerated
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.DATA_SOURCE
     *
     * @param dataSource the value for FF_BASE_BUILDING.DATA_SOURCE
     *
     * @mbggenerated
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.TRANSFER_TYPE
     *
     * @return the value of FF_BASE_BUILDING.TRANSFER_TYPE
     *
     * @mbggenerated
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.TRANSFER_TYPE
     *
     * @param transferType the value for FF_BASE_BUILDING.TRANSFER_TYPE
     *
     * @mbggenerated
     */
    public void setTransferType(String transferType) {
        this.transferType = transferType == null ? null : transferType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.CAST_PRICE
     *
     * @return the value of FF_BASE_BUILDING.CAST_PRICE
     *
     * @mbggenerated
     */
    public Float getCastPrice() {
        return castPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.CAST_PRICE
     *
     * @param castPrice the value for FF_BASE_BUILDING.CAST_PRICE
     *
     * @mbggenerated
     */
    public void setCastPrice(Float castPrice) {
        this.castPrice = castPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.BUILD_UNIT_NEED_PAY
     *
     * @return the value of FF_BASE_BUILDING.BUILD_UNIT_NEED_PAY
     *
     * @mbggenerated
     */
    public String getBuildUnitNeedPay() {
        return buildUnitNeedPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.BUILD_UNIT_NEED_PAY
     *
     * @param buildUnitNeedPay the value for FF_BASE_BUILDING.BUILD_UNIT_NEED_PAY
     *
     * @mbggenerated
     */
    public void setBuildUnitNeedPay(String buildUnitNeedPay) {
        this.buildUnitNeedPay = buildUnitNeedPay == null ? null : buildUnitNeedPay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.IS_DELETED
     *
     * @return the value of FF_BASE_BUILDING.IS_DELETED
     *
     * @mbggenerated
     */
    public Float getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.IS_DELETED
     *
     * @param isDeleted the value for FF_BASE_BUILDING.IS_DELETED
     *
     * @mbggenerated
     */
    public void setIsDeleted(Float isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.VERSION
     *
     * @return the value of FF_BASE_BUILDING.VERSION
     *
     * @mbggenerated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.VERSION
     *
     * @param version the value for FF_BASE_BUILDING.VERSION
     *
     * @mbggenerated
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SYS_CREATE_TIME
     *
     * @return the value of FF_BASE_BUILDING.SYS_CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SYS_CREATE_TIME
     *
     * @param sysCreateTime the value for FF_BASE_BUILDING.SYS_CREATE_TIME
     *
     * @mbggenerated
     */
    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SYS_UPDATE_TIME
     *
     * @return the value of FF_BASE_BUILDING.SYS_UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getSysUpdateTime() {
        return sysUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SYS_UPDATE_TIME
     *
     * @param sysUpdateTime the value for FF_BASE_BUILDING.SYS_UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setSysUpdateTime(Date sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SYS_DELETE_TIME
     *
     * @return the value of FF_BASE_BUILDING.SYS_DELETE_TIME
     *
     * @mbggenerated
     */
    public Date getSysDeleteTime() {
        return sysDeleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SYS_DELETE_TIME
     *
     * @param sysDeleteTime the value for FF_BASE_BUILDING.SYS_DELETE_TIME
     *
     * @mbggenerated
     */
    public void setSysDeleteTime(Date sysDeleteTime) {
        this.sysDeleteTime = sysDeleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SYS_CREATE_ID
     *
     * @return the value of FF_BASE_BUILDING.SYS_CREATE_ID
     *
     * @mbggenerated
     */
    public String getSysCreateId() {
        return sysCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SYS_CREATE_ID
     *
     * @param sysCreateId the value for FF_BASE_BUILDING.SYS_CREATE_ID
     *
     * @mbggenerated
     */
    public void setSysCreateId(String sysCreateId) {
        this.sysCreateId = sysCreateId == null ? null : sysCreateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SYS_UPDATE_ID
     *
     * @return the value of FF_BASE_BUILDING.SYS_UPDATE_ID
     *
     * @mbggenerated
     */
    public String getSysUpdateId() {
        return sysUpdateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SYS_UPDATE_ID
     *
     * @param sysUpdateId the value for FF_BASE_BUILDING.SYS_UPDATE_ID
     *
     * @mbggenerated
     */
    public void setSysUpdateId(String sysUpdateId) {
        this.sysUpdateId = sysUpdateId == null ? null : sysUpdateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FF_BASE_BUILDING.SYS_DELETE_ID
     *
     * @return the value of FF_BASE_BUILDING.SYS_DELETE_ID
     *
     * @mbggenerated
     */
    public String getSysDeleteId() {
        return sysDeleteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FF_BASE_BUILDING.SYS_DELETE_ID
     *
     * @param sysDeleteId the value for FF_BASE_BUILDING.SYS_DELETE_ID
     *
     * @mbggenerated
     */
    public void setSysDeleteId(String sysDeleteId) {
        this.sysDeleteId = sysDeleteId == null ? null : sysDeleteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FF_BASE_BUILDING
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logicBuildingCode=").append(logicBuildingCode);
        sb.append(", logicBuildingNo=").append(logicBuildingNo);
        sb.append(", buildingNo=").append(buildingNo);
        sb.append(", manualBuildingNo=").append(manualBuildingNo);
        sb.append(", pkPropertyAreaId=").append(pkPropertyAreaId);
        sb.append(", pkRegionId=").append(pkRegionId);
        sb.append(", regionDes=").append(regionDes);
        sb.append(", projectName=").append(projectName);
        sb.append(", alias=").append(alias);
        sb.append(", projectCode=").append(projectCode);
        sb.append(", pkBuildUnitId=").append(pkBuildUnitId);
        sb.append(", buildingAddress=").append(buildingAddress);
        sb.append(", street=").append(street);
        sb.append(", sno=").append(sno);
        sb.append(", saddno=").append(saddno);
        sb.append(", buildYear=").append(buildYear);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", transferType=").append(transferType);
        sb.append(", castPrice=").append(castPrice);
        sb.append(", buildUnitNeedPay=").append(buildUnitNeedPay);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", version=").append(version);
        sb.append(", sysCreateTime=").append(sysCreateTime);
        sb.append(", sysUpdateTime=").append(sysUpdateTime);
        sb.append(", sysDeleteTime=").append(sysDeleteTime);
        sb.append(", sysCreateId=").append(sysCreateId);
        sb.append(", sysUpdateId=").append(sysUpdateId);
        sb.append(", sysDeleteId=").append(sysDeleteId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}