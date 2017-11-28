package com.huateng.weixin.kefu.model;

public class WxKefu {
    private String kfAccount;

    private String kfId;

    private String kfNick;

    private String password;

    public String getKfAccount() {
        return kfAccount;
    }

    public void setKfAccount(String kfAccount) {
        this.kfAccount = kfAccount == null ? null : kfAccount.trim();
    }

    public String getKfId() {
        return kfId;
    }

    public void setKfId(String kfId) {
        this.kfId = kfId == null ? null : kfId.trim();
    }

    public String getKfNick() {
        return kfNick;
    }

    public void setKfNick(String kfNick) {
        this.kfNick = kfNick == null ? null : kfNick.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}