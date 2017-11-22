package com.huateng.wxmgr.common.entity;

import com.huateng.wxmgr.common.utils.PageBean;

public class WxUserTags extends PageBean{
    private Integer ids;

    private String name;

    private Integer fansnum;

    private String description;

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

	@Override
	public String toString() {
		return "WxUserTags [ids=" + ids + ", name=" + name + ", fansnum=" + fansnum + ", description=" + description
				+ "]";
	}
    
}