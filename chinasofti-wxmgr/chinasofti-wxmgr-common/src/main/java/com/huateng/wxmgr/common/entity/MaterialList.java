package com.huateng.wxmgr.common.entity;

/**
 * 素材列表
 */
public class MaterialList {
    private String type  ;//素材的类型，图片（image）、视频（video）、语音 （voice）、图文（news）
    private String offset  ;//从全部素材的该偏移位置开始返回，0表示从第一个素材 返回
    private String count  ;//返回素材的数量，取值在1到20之间

    public String getType() {
        return type;
    }

    public String getOffset() {
        return offset;
    }

    public String getCount() {
        return count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
