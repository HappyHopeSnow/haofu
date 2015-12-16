package com.haofu.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderMain implements Serializable {
    private String tableName;

    private Long dbid;

    private String orderId;

    private String orgId;

    private String dcId;

    private String whId;

    private String ownerNo;

    private String ownerName;

    private Byte ownerType;

    private String consignee;

    private Date deliverTime;

    private String consigneeAddr;

    private String addrProvince;

    private String addrCity;

    private String addrCounty;

    private String addrTown;

    private String addrProvinceName;

    private String addrCityName;

    private String addrCountyName;

    private String addrTownName;

    private String consigneePostcode;

    private String consigneeMobile;

    private String consigneePhone;

    private String consigneeEmail;

    private String consigneeRemark;

    private String orderType;

    private String payment;

    private String payRemark;

    private Date paySuredate;

    private String sendpaySimple;

    private String sendpayWhole;

    private String printinfo;

    private String carrierNo;

    private String carrierName;

    private String di;

    private BigDecimal factPrice;

    private BigDecimal totalPrice;

    private String id;

    private String isJdship;

    private String jdship;

    private String jsonstr;

    private String printinfoFlag;

    private String printFlag;

    private String printx;

    private String remark;

    private String state;

    private String state2;

    private String status;

    private String channelsOutboundNo;

    private String orderNo;

    private String shopNo;

    private Date shoporderCreatetime;

    private String shoporderSource;

    private String orderMark;

    private String transportWay;

    private String picker;

    private String pickerCall;

    private String pickerId;

    private String outboundFlag;

    private String customFlag;

    private String packType;

    private String source;

    private String paintMarker;

    private Date productionTime;

    private BigDecimal weight;

    private BigDecimal volume;

    private Date createTime;

    private Date ts;

    private String createPin;

    private String updatePin;

    private Byte yn;
    

    private static final long serialVersionUID = 1L;


	public Long getDbid() {
        return dbid;
    }

    public void setDbid(Long dbid) {
        this.dbid = dbid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getDcId() {
        return dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId == null ? null : dcId.trim();
    }

    public String getWhId() {
        return whId;
    }

    public void setWhId(String whId) {
        this.whId = whId == null ? null : whId.trim();
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo == null ? null : ownerNo.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public Byte getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Byte ownerType) {
        this.ownerType = ownerType;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getConsigneeAddr() {
        return consigneeAddr;
    }

    public void setConsigneeAddr(String consigneeAddr) {
        this.consigneeAddr = consigneeAddr == null ? null : consigneeAddr.trim();
    }

    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince == null ? null : addrProvince.trim();
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity == null ? null : addrCity.trim();
    }

    public String getAddrCounty() {
        return addrCounty;
    }

    public void setAddrCounty(String addrCounty) {
        this.addrCounty = addrCounty == null ? null : addrCounty.trim();
    }

    public String getAddrTown() {
        return addrTown;
    }

    public void setAddrTown(String addrTown) {
        this.addrTown = addrTown == null ? null : addrTown.trim();
    }

    public String getAddrProvinceName() {
        return addrProvinceName;
    }

    public void setAddrProvinceName(String addrProvinceName) {
        this.addrProvinceName = addrProvinceName == null ? null : addrProvinceName.trim();
    }

    public String getAddrCityName() {
        return addrCityName;
    }

    public void setAddrCityName(String addrCityName) {
        this.addrCityName = addrCityName == null ? null : addrCityName.trim();
    }

    public String getAddrCountyName() {
        return addrCountyName;
    }

    public void setAddrCountyName(String addrCountyName) {
        this.addrCountyName = addrCountyName == null ? null : addrCountyName.trim();
    }

    public String getAddrTownName() {
        return addrTownName;
    }

    public void setAddrTownName(String addrTownName) {
        this.addrTownName = addrTownName == null ? null : addrTownName.trim();
    }

    public String getConsigneePostcode() {
        return consigneePostcode;
    }

    public void setConsigneePostcode(String consigneePostcode) {
        this.consigneePostcode = consigneePostcode == null ? null : consigneePostcode.trim();
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile == null ? null : consigneeMobile.trim();
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone == null ? null : consigneePhone.trim();
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail == null ? null : consigneeEmail.trim();
    }

    public String getConsigneeRemark() {
        return consigneeRemark;
    }

    public void setConsigneeRemark(String consigneeRemark) {
        this.consigneeRemark = consigneeRemark == null ? null : consigneeRemark.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark == null ? null : payRemark.trim();
    }

    public Date getPaySuredate() {
        return paySuredate;
    }

    public void setPaySuredate(Date paySuredate) {
        this.paySuredate = paySuredate;
    }

    public String getSendpaySimple() {
        return sendpaySimple;
    }

    public void setSendpaySimple(String sendpaySimple) {
        this.sendpaySimple = sendpaySimple == null ? null : sendpaySimple.trim();
    }

    public String getSendpayWhole() {
        return sendpayWhole;
    }

    public void setSendpayWhole(String sendpayWhole) {
        this.sendpayWhole = sendpayWhole == null ? null : sendpayWhole.trim();
    }

    public String getPrintinfo() {
        return printinfo;
    }

    public void setPrintinfo(String printinfo) {
        this.printinfo = printinfo == null ? null : printinfo.trim();
    }

    public String getCarrierNo() {
        return carrierNo;
    }

    public void setCarrierNo(String carrierNo) {
        this.carrierNo = carrierNo == null ? null : carrierNo.trim();
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName == null ? null : carrierName.trim();
    }

    public String getDi() {
        return di;
    }

    public void setDi(String di) {
        this.di = di == null ? null : di.trim();
    }

    public BigDecimal getFactPrice() {
        return factPrice;
    }

    public void setFactPrice(BigDecimal factPrice) {
        this.factPrice = factPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIsJdship() {
        return isJdship;
    }

    public void setIsJdship(String isJdship) {
        this.isJdship = isJdship == null ? null : isJdship.trim();
    }

    public String getJdship() {
        return jdship;
    }

    public void setJdship(String jdship) {
        this.jdship = jdship == null ? null : jdship.trim();
    }

    public String getJsonstr() {
        return jsonstr;
    }

    public void setJsonstr(String jsonstr) {
        this.jsonstr = jsonstr == null ? null : jsonstr.trim();
    }

    public String getPrintinfoFlag() {
        return printinfoFlag;
    }

    public void setPrintinfoFlag(String printinfoFlag) {
        this.printinfoFlag = printinfoFlag == null ? null : printinfoFlag.trim();
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag == null ? null : printFlag.trim();
    }

    public String getPrintx() {
        return printx;
    }

    public void setPrintx(String printx) {
        this.printx = printx == null ? null : printx.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2 == null ? null : state2.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getChannelsOutboundNo() {
        return channelsOutboundNo;
    }

    public void setChannelsOutboundNo(String channelsOutboundNo) {
        this.channelsOutboundNo = channelsOutboundNo == null ? null : channelsOutboundNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo == null ? null : shopNo.trim();
    }

    public Date getShoporderCreatetime() {
        return shoporderCreatetime;
    }

    public void setShoporderCreatetime(Date shoporderCreatetime) {
        this.shoporderCreatetime = shoporderCreatetime;
    }

    public String getShoporderSource() {
        return shoporderSource;
    }

    public void setShoporderSource(String shoporderSource) {
        this.shoporderSource = shoporderSource == null ? null : shoporderSource.trim();
    }

    public String getOrderMark() {
        return orderMark;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark == null ? null : orderMark.trim();
    }

    public String getTransportWay() {
        return transportWay;
    }

    public void setTransportWay(String transportWay) {
        this.transportWay = transportWay == null ? null : transportWay.trim();
    }

    public String getPicker() {
        return picker;
    }

    public void setPicker(String picker) {
        this.picker = picker == null ? null : picker.trim();
    }

    public String getPickerCall() {
        return pickerCall;
    }

    public void setPickerCall(String pickerCall) {
        this.pickerCall = pickerCall == null ? null : pickerCall.trim();
    }

    public String getPickerId() {
        return pickerId;
    }

    public void setPickerId(String pickerId) {
        this.pickerId = pickerId == null ? null : pickerId.trim();
    }

    public String getOutboundFlag() {
        return outboundFlag;
    }

    public void setOutboundFlag(String outboundFlag) {
        this.outboundFlag = outboundFlag == null ? null : outboundFlag.trim();
    }

    public String getCustomFlag() {
        return customFlag;
    }

    public void setCustomFlag(String customFlag) {
        this.customFlag = customFlag == null ? null : customFlag.trim();
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType == null ? null : packType.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getPaintMarker() {
        return paintMarker;
    }

    public void setPaintMarker(String paintMarker) {
        this.paintMarker = paintMarker == null ? null : paintMarker.trim();
    }

    public Date getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(Date productionTime) {
        this.productionTime = productionTime;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getCreatePin() {
        return createPin;
    }

    public void setCreatePin(String createPin) {
        this.createPin = createPin == null ? null : createPin.trim();
    }

    public String getUpdatePin() {
        return updatePin;
    }

    public void setUpdatePin(String updatePin) {
        this.updatePin = updatePin == null ? null : updatePin.trim();
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}