package com.chinasofti.common.sp.entity;

public class SpParameterManage {
    private Integer ids;

    private String num;

    private String seq;

    private String paramterName;

    private String valuees;

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq == null ? null : seq.trim();
    }

    public String getParamterName() {
        return paramterName;
    }

    public void setParamterName(String paramterName) {
        this.paramterName = paramterName == null ? null : paramterName.trim();
    }

    public String getValuees() {
        return valuees;
    }

    public void setValuees(String valuees) {
        this.valuees = valuees == null ? null : valuees.trim();
    }
}