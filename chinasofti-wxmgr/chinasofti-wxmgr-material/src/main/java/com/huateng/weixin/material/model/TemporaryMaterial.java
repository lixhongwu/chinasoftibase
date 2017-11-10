package com.huateng.weixin.material.model;

/**
 * 临时素材
 */
public class TemporaryMaterial {
    private String  access_token ;
    private String  type ;   //媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
    private String  media ; //	form-data中媒体文件标识，有filename、filelength、content-type等信息
    private String media_id;
    public String getAccess_token() {
        return access_token;
    }

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }
}
