package com.huateng.wxmgr.common.entity;

import java.util.Date;

public class WxMaterial {
    private Integer id;

    private String fileName;

    private String filePath;

    private String mediaId;

    private Date createTime;

    private Integer flag;//0代表临时素材 1代表永久素材

    private String url;
    
   /* private String flagStr;
    

    public String getFlagStr() {
    	if(flag == 1){
			this.flagStr = "永久素材";
		}
    	this.flagStr = "临时素材";
    	return flagStr;
	}

	public void setFlagStr(String flagStr) {
		this.flagStr = flagStr;
	}*/

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}