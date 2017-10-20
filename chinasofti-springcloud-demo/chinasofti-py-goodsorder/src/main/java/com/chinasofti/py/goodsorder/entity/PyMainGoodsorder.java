package com.chinasofti.py.goodsorder.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyMainGoodsorder {

    private String ids;	

    private String bigorderId;		//大订单id

    private String vendorIds;		//商户id

    private String userIds;			//用户id

    private String contIdentityno;	//收件人证件号

    private String contPostcode;	//邮箱

    private String contAddress;		//详细地址

    private String contMobile;		//座机

    private String contPhone;		//手机

    private String contProvince;	//省

    private String contCity;		//市

    private String contDistrict;	//区

    private String contStreet;		//街道

    private String deliveryTime;	//派送时间

    private String deliveryWay;		//配送方式

    private String buyersMessage;	//留言

    private String orderTime;		//下单时间

    private String settleTime;		//放款成功时间

    private String isevaluate;		

    private BigDecimal discount;

    private BigDecimal orderTotalAmt;	//商品总价

    private BigDecimal orderAmt;		//实付现金

    private BigDecimal settleAmt;

    private String settleStatues;		//清算状态  0-未处理  1-成功 2-失败 3 清算中

    private String payStatus;			//0 未支付 1 已支付  2 取消

    private String status;				//订单状态：0001-待付款 0002-待发货 0003-已发货 0004-交易成功 0005-售后处理中 0006-订单关闭
    									//0007-交易关闭 0008-交易完成  0009-退款中

    private String approveStatus;		//售后状态0101-待商家确认0102-待买家寄回0103-待确认质检0104-退款中0105-退款成功
    									//0106-退款关闭0107-换货成功0108-换货关闭

    private String payway;

    private String transactionid;

    private String contName;

    private String settleBatchNo;

    private BigDecimal wxFee;

    private String settleStatusFee;

    private String settleTimeFee;

    private String settleBatchNoFee;

    private String payTime;

    private String signTime;

    private String isTicket;

    private String logisticsCompanyId;

    private String logisticsCompanyName;

    private String expressNo;

    private String isInvoice;

    private String invoice;

    private String invoiceContent;

    private String deleteStatus;

    private String brandInfoIds;

    private String customerphone;

    private String isSend;

    private String isMakeloan;

    private String customerName;

    private String refundstatus;

    private String refunduser;

    private String stockstatus;

    private String islock;

    private Date createTime;

    private String creater;

    private Date modifyTime;

    private String modifier;

    private String mark;

    private String refundTime;

    private String settlementTime;

    private String settlementIds;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public String getBigorderId() {
        return bigorderId;
    }

    public void setBigorderId(String bigorderId) {
        this.bigorderId = bigorderId == null ? null : bigorderId.trim();
    }

    public String getVendorIds() {
        return vendorIds;
    }

    public void setVendorIds(String vendorIds) {
        this.vendorIds = vendorIds == null ? null : vendorIds.trim();
    }

    public String getUserIds() {
        return userIds;
    }

    public void setUserIds(String userIds) {
        this.userIds = userIds == null ? null : userIds.trim();
    }

    public String getContIdentityno() {
        return contIdentityno;
    }

    public void setContIdentityno(String contIdentityno) {
        this.contIdentityno = contIdentityno == null ? null : contIdentityno.trim();
    }

    public String getContPostcode() {
        return contPostcode;
    }

    public void setContPostcode(String contPostcode) {
        this.contPostcode = contPostcode == null ? null : contPostcode.trim();
    }

    public String getContAddress() {
        return contAddress;
    }

    public void setContAddress(String contAddress) {
        this.contAddress = contAddress == null ? null : contAddress.trim();
    }

    public String getContMobile() {
        return contMobile;
    }

    public void setContMobile(String contMobile) {
        this.contMobile = contMobile == null ? null : contMobile.trim();
    }

    public String getContPhone() {
        return contPhone;
    }

    public void setContPhone(String contPhone) {
        this.contPhone = contPhone == null ? null : contPhone.trim();
    }

    public String getContProvince() {
        return contProvince;
    }

    public void setContProvince(String contProvince) {
        this.contProvince = contProvince == null ? null : contProvince.trim();
    }

    public String getContCity() {
        return contCity;
    }

    public void setContCity(String contCity) {
        this.contCity = contCity == null ? null : contCity.trim();
    }

    public String getContDistrict() {
        return contDistrict;
    }

    public void setContDistrict(String contDistrict) {
        this.contDistrict = contDistrict == null ? null : contDistrict.trim();
    }

    public String getContStreet() {
        return contStreet;
    }

    public void setContStreet(String contStreet) {
        this.contStreet = contStreet == null ? null : contStreet.trim();
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime == null ? null : deliveryTime.trim();
    }

    public String getDeliveryWay() {
        return deliveryWay;
    }

    public void setDeliveryWay(String deliveryWay) {
        this.deliveryWay = deliveryWay == null ? null : deliveryWay.trim();
    }

    public String getBuyersMessage() {
        return buyersMessage;
    }

    public void setBuyersMessage(String buyersMessage) {
        this.buyersMessage = buyersMessage == null ? null : buyersMessage.trim();
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime == null ? null : settleTime.trim();
    }

    public String getIsevaluate() {
        return isevaluate;
    }

    public void setIsevaluate(String isevaluate) {
        this.isevaluate = isevaluate == null ? null : isevaluate.trim();
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getOrderTotalAmt() {
        return orderTotalAmt;
    }

    public void setOrderTotalAmt(BigDecimal orderTotalAmt) {
        this.orderTotalAmt = orderTotalAmt;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public String getSettleStatues() {
        return settleStatues;
    }

    public void setSettleStatues(String settleStatues) {
        this.settleStatues = settleStatues == null ? null : settleStatues.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus == null ? null : approveStatus.trim();
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName == null ? null : contName.trim();
    }

    public String getSettleBatchNo() {
        return settleBatchNo;
    }

    public void setSettleBatchNo(String settleBatchNo) {
        this.settleBatchNo = settleBatchNo == null ? null : settleBatchNo.trim();
    }

    public BigDecimal getWxFee() {
        return wxFee;
    }

    public void setWxFee(BigDecimal wxFee) {
        this.wxFee = wxFee;
    }

    public String getSettleStatusFee() {
        return settleStatusFee;
    }

    public void setSettleStatusFee(String settleStatusFee) {
        this.settleStatusFee = settleStatusFee == null ? null : settleStatusFee.trim();
    }

    public String getSettleTimeFee() {
        return settleTimeFee;
    }

    public void setSettleTimeFee(String settleTimeFee) {
        this.settleTimeFee = settleTimeFee == null ? null : settleTimeFee.trim();
    }

    public String getSettleBatchNoFee() {
        return settleBatchNoFee;
    }

    public void setSettleBatchNoFee(String settleBatchNoFee) {
        this.settleBatchNoFee = settleBatchNoFee == null ? null : settleBatchNoFee.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime == null ? null : signTime.trim();
    }

    public String getIsTicket() {
        return isTicket;
    }

    public void setIsTicket(String isTicket) {
        this.isTicket = isTicket == null ? null : isTicket.trim();
    }

    public String getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    public void setLogisticsCompanyId(String logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId == null ? null : logisticsCompanyId.trim();
    }

    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName == null ? null : logisticsCompanyName.trim();
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public String getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice == null ? null : isInvoice.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus == null ? null : deleteStatus.trim();
    }

    public String getBrandInfoIds() {
        return brandInfoIds;
    }

    public void setBrandInfoIds(String brandInfoIds) {
        this.brandInfoIds = brandInfoIds == null ? null : brandInfoIds.trim();
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend == null ? null : isSend.trim();
    }

    public String getIsMakeloan() {
        return isMakeloan;
    }

    public void setIsMakeloan(String isMakeloan) {
        this.isMakeloan = isMakeloan == null ? null : isMakeloan.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getRefundstatus() {
        return refundstatus;
    }

    public void setRefundstatus(String refundstatus) {
        this.refundstatus = refundstatus == null ? null : refundstatus.trim();
    }

    public String getRefunduser() {
        return refunduser;
    }

    public void setRefunduser(String refunduser) {
        this.refunduser = refunduser == null ? null : refunduser.trim();
    }

    public String getStockstatus() {
        return stockstatus;
    }

    public void setStockstatus(String stockstatus) {
        this.stockstatus = stockstatus == null ? null : stockstatus.trim();
    }

    public String getIslock() {
        return islock;
    }

    public void setIslock(String islock) {
        this.islock = islock == null ? null : islock.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime == null ? null : refundTime.trim();
    }

    public String getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(String settlementTime) {
        this.settlementTime = settlementTime == null ? null : settlementTime.trim();
    }

    public String getSettlementIds() {
        return settlementIds;
    }

    public void setSettlementIds(String settlementIds) {
        this.settlementIds = settlementIds == null ? null : settlementIds.trim();
    }
}