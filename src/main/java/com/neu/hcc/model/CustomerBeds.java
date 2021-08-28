package com.neu.hcc.model;

import java.util.Date;

public class CustomerBeds {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private Integer delFlag;

    private Integer customerId;

    private Integer contentId;

    private Date nursingTime;

    private String nursingContent;

    private Integer nursingCount;

    private Integer staffnfoId;

    private Integer nursingId;

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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Date getNursingTime() {
        return nursingTime;
    }

    public void setNursingTime(Date nursingTime) {
        this.nursingTime = nursingTime;
    }

    public String getNursingContent() {
        return nursingContent;
    }

    public void setNursingContent(String nursingContent) {
        this.nursingContent = nursingContent == null ? null : nursingContent.trim();
    }

    public Integer getNursingCount() {
        return nursingCount;
    }

    public void setNursingCount(Integer nursingCount) {
        this.nursingCount = nursingCount;
    }

    public Integer getStaffnfoId() {
        return staffnfoId;
    }

    public void setStaffnfoId(Integer staffnfoId) {
        this.staffnfoId = staffnfoId;
    }

    public Integer getNursingId() {
        return nursingId;
    }

    public void setNursingId(Integer nursingId) {
        this.nursingId = nursingId;
    }
}