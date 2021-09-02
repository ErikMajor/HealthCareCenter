package com.neu.hcc.model;

import java.util.Date;

public class Checkout {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private Integer delFlag;

    private Integer customerId;

    private Date retreatTime;

    private String retreatType;

    private String retreatReason;

    private String checkoutStatus;

    private Integer buildingId;

    private Date askTime;

    private String auditOpinion;

    private String auditPerson;

    private String auditTime;

    private Date contactTel;

    private String accommodationStatus;

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

    public String getaccommodationstatus() {
        return accommodationStatus;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getRetreatTime() {
        return retreatTime;
    }

    public void setRetreatTime(Date retreatTime) {
        this.retreatTime = retreatTime;
    }

    public String getRetreatType() {
        return retreatType;
    }

    public void setRetreatType(String retreatType) {
        this.retreatType = retreatType == null ? null : retreatType.trim();
    }

    public String getRetreatReason() {
        return retreatReason;
    }

    public void setRetreatReason(String retreatReason) {
        this.retreatReason = retreatReason == null ? null : retreatReason.trim();
    }

    public String getCheckoutStatus() {
        return checkoutStatus;
    }

    public void setCheckoutStatus(String checkoutStatus) {
        this.checkoutStatus = checkoutStatus == null ? null : checkoutStatus.trim();
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public Date getAskTime() {
        return askTime;
    }

    public void setAskTime(Date askTime) {
        this.askTime = askTime;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson == null ? null : auditPerson.trim();
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    public Date getContactTel() {
        return contactTel;
    }

    public void setContactTel(Date contactTel) {
        this.contactTel = contactTel;
    }

    public String getAccommodationStatus() {
        return accommodationStatus;
    }

    public void setAccommodationStatus(String accommodationStatus) {
        this.accommodationStatus = accommodationStatus == null ? null : accommodationStatus.trim();
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "id=" + id +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", delFlag=" + delFlag +
                ", customerId=" + customerId +
                ", retreatTime=" + retreatTime +
                ", retreatType='" + retreatType + '\'' +
                ", retreatReason='" + retreatReason + '\'' +
                ", checkoutStatus='" + checkoutStatus + '\'' +
                ", buildingId=" + buildingId +
                ", askTime=" + askTime +
                ", auditOpinion='" + auditOpinion + '\'' +
                ", auditPerson='" + auditPerson + '\'' +
                ", auditTime='" + auditTime + '\'' +
                ", contactTel=" + contactTel +
                ", accommodationStatus='" + accommodationStatus + '\'' +
                '}';
    }
}