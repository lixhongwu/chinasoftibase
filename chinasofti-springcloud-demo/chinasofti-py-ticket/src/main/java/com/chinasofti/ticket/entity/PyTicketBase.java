package com.chinasofti.ticket.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyTicketBase {
    private String ids;

    private String ticketCode;

    private String ticketName;

    private String ticketType;

    private BigDecimal ticketValue;

    private String ticketDesc;

    private String deliveryType;

    private Integer deliveryTotalCount;

    private String channelNo;

    private Integer deliverySingleCount;

    private Date deliveryBeginTime;

    private Date deliveryEndTime;

    private Date validBeginDate;

    private Date validEndDate;

    private String payway;

    private BigDecimal orderAmount;

    private Integer validDays;

    private String grantGroup;

    private String limitUsedType;

    private String approvalStatus;

    private String deleteStatus;

    private String creator;

    private Date createDate;

    private String modifier;

    private Date modifyDate;

    private String version;

    private String remark;

    private String remark1;

    private String remark2;

    private String remark3;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode == null ? null : ticketCode.trim();
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName == null ? null : ticketName.trim();
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType == null ? null : ticketType.trim();
    }

    public BigDecimal getTicketValue() {
        return ticketValue;
    }

    public void setTicketValue(BigDecimal ticketValue) {
        this.ticketValue = ticketValue;
    }

    public String getTicketDesc() {
        return ticketDesc;
    }

    public void setTicketDesc(String ticketDesc) {
        this.ticketDesc = ticketDesc == null ? null : ticketDesc.trim();
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType == null ? null : deliveryType.trim();
    }

    public Integer getDeliveryTotalCount() {
        return deliveryTotalCount;
    }

    public void setDeliveryTotalCount(Integer deliveryTotalCount) {
        this.deliveryTotalCount = deliveryTotalCount;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo == null ? null : channelNo.trim();
    }

    public Integer getDeliverySingleCount() {
        return deliverySingleCount;
    }

    public void setDeliverySingleCount(Integer deliverySingleCount) {
        this.deliverySingleCount = deliverySingleCount;
    }

    public Date getDeliveryBeginTime() {
        return deliveryBeginTime;
    }

    public void setDeliveryBeginTime(Date deliveryBeginTime) {
        this.deliveryBeginTime = deliveryBeginTime;
    }

    public Date getDeliveryEndTime() {
        return deliveryEndTime;
    }

    public void setDeliveryEndTime(Date deliveryEndTime) {
        this.deliveryEndTime = deliveryEndTime;
    }

    public Date getValidBeginDate() {
        return validBeginDate;
    }

    public void setValidBeginDate(Date validBeginDate) {
        this.validBeginDate = validBeginDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    public String getGrantGroup() {
        return grantGroup;
    }

    public void setGrantGroup(String grantGroup) {
        this.grantGroup = grantGroup == null ? null : grantGroup.trim();
    }

    public String getLimitUsedType() {
        return limitUsedType;
    }

    public void setLimitUsedType(String limitUsedType) {
        this.limitUsedType = limitUsedType == null ? null : limitUsedType.trim();
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus == null ? null : approvalStatus.trim();
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus == null ? null : deleteStatus.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }
}