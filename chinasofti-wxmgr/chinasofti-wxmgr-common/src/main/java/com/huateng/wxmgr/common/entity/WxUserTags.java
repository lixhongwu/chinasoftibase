package com.huateng.wxmgr.common.entity;

import com.huateng.wxmgr.common.utils.PageBean;

public class WxUserTags extends PageBean {
    private Integer ids;

    private String name;

    private Integer fansnum;

    private String description;

    private Integer synchro;
    
    private String sort;

    public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFansnum() {
        return fansnum;
    }

    public void setFansnum(Integer fansnum) {
        this.fansnum = fansnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSynchro() {
        return synchro;
    }

    public void setSynchro(Integer synchro) {
        this.synchro = synchro;
    }
}