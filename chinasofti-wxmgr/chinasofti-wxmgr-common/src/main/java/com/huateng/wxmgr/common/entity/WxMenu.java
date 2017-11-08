package com.huateng.wxmgr.common.entity;

public class WxMenu {
    private String ids;

    private String urltoken;

    private String appid;

    private Long level;

    private String pid;

    private String title;

    private String keyword;

    private String url;

    private Long isShow;

    private Long sort;

    private String gid;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public String getUrltoken() {
        return urltoken;
    }

    public void setUrltoken(String urltoken) {
        this.urltoken = urltoken == null ? null : urltoken.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getIsShow() {
        return isShow;
    }

    public void setIsShow(Long isShow) {
        this.isShow = isShow;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }
}