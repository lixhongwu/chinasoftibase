package com.chinasofti.springcloud.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PtUser {
    private String ids;

    private BigDecimal version;

    private BigDecimal errorcount;

    private BigDecimal orderids;

    private String password;

    private String orginalpw;

    private String status;

    private Date stopdate;

    private String username;

    private String departmentids;

    private String userinfoids;

    private String stationids;

    private String deptids;

    private String userids;

    private String groupids;

    private String departmentnames;

    private String stationnames;

    private String deptnames;

    private String usernames;

    private String groupnames;

    private String ismerchantuser;

    private String createtime;

    private Integer logincount;

    private byte[] salt;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public BigDecimal getErrorcount() {
        return errorcount;
    }

    public void setErrorcount(BigDecimal errorcount) {
        this.errorcount = errorcount;
    }

    public BigDecimal getOrderids() {
        return orderids;
    }

    public void setOrderids(BigDecimal orderids) {
        this.orderids = orderids;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getOrginalpw() {
        return orginalpw;
    }

    public void setOrginalpw(String orginalpw) {
        this.orginalpw = orginalpw == null ? null : orginalpw.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStopdate() {
        return stopdate;
    }

    public void setStopdate(Date stopdate) {
        this.stopdate = stopdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getDepartmentids() {
        return departmentids;
    }

    public void setDepartmentids(String departmentids) {
        this.departmentids = departmentids == null ? null : departmentids.trim();
    }

    public String getUserinfoids() {
        return userinfoids;
    }

    public void setUserinfoids(String userinfoids) {
        this.userinfoids = userinfoids == null ? null : userinfoids.trim();
    }

    public String getStationids() {
        return stationids;
    }

    public void setStationids(String stationids) {
        this.stationids = stationids == null ? null : stationids.trim();
    }

    public String getDeptids() {
        return deptids;
    }

    public void setDeptids(String deptids) {
        this.deptids = deptids == null ? null : deptids.trim();
    }

    public String getUserids() {
        return userids;
    }

    public void setUserids(String userids) {
        this.userids = userids == null ? null : userids.trim();
    }

    public String getGroupids() {
        return groupids;
    }

    public void setGroupids(String groupids) {
        this.groupids = groupids == null ? null : groupids.trim();
    }

    public String getDepartmentnames() {
        return departmentnames;
    }

    public void setDepartmentnames(String departmentnames) {
        this.departmentnames = departmentnames == null ? null : departmentnames.trim();
    }

    public String getStationnames() {
        return stationnames;
    }

    public void setStationnames(String stationnames) {
        this.stationnames = stationnames == null ? null : stationnames.trim();
    }

    public String getDeptnames() {
        return deptnames;
    }

    public void setDeptnames(String deptnames) {
        this.deptnames = deptnames == null ? null : deptnames.trim();
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames == null ? null : usernames.trim();
    }

    public String getGroupnames() {
        return groupnames;
    }

    public void setGroupnames(String groupnames) {
        this.groupnames = groupnames == null ? null : groupnames.trim();
    }

    public String getIsmerchantuser() {
        return ismerchantuser;
    }

    public void setIsmerchantuser(String ismerchantuser) {
        this.ismerchantuser = ismerchantuser == null ? null : ismerchantuser.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }
}