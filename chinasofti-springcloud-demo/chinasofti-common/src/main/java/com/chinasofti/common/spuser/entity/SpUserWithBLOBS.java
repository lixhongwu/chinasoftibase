package com.chinasofti.common.spuser.entity;

public class SpUserWithBLOBS extends SpUser{
	private String contents;

    private String params;

    private String files;

    private String inventorys;
    
   
     

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files == null ? null : files.trim();
    }

    public String getInventorys() {
        return inventorys;
    }

    public void setInventorys(String inventorys) {
        this.inventorys = inventorys == null ? null : inventorys.trim();
    }
}
