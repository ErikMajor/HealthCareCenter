package com.neu.hcc.model;

import java.util.Date;

public class NursingContent {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private Integer delFlag;

    private Integer serialNumber;

    private String nursingName;

    private Float servicePrice;

    private String contentDescribe;

    private String incrementFlag;

    private String contentStatus;

    private Integer levelId;

    private NursingLevel nursingLevel;

    public NursingLevel getNursingLevel() {
        return nursingLevel;
    }

    public void setNursingLevel(NursingLevel nursingLevel) {
        this.nursingLevel = nursingLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNursingName() {
        return nursingName;
    }

    public void setNursingName(String nursingName) {
        this.nursingName = nursingName == null ? null : nursingName.trim();
    }

    public Float getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getContentDescribe() {
        return contentDescribe;
    }

    public void setContentDescribe(String contentDescribe) {
        this.contentDescribe = contentDescribe == null ? null : contentDescribe.trim();
    }

    public String getIncrementFlag() {
        return incrementFlag;
    }

    public void setIncrementFlag(String incrementFlag) {
        this.incrementFlag = incrementFlag == null ? null : incrementFlag.trim();
    }

    public String getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(String contentStatus) {
        this.contentStatus = contentStatus == null ? null : contentStatus.trim();
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }
}