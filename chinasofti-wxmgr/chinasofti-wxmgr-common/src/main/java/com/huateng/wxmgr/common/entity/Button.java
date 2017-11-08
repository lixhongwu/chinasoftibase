
package com.huateng.wxmgr.common.entity;
import java.util.List;


public class Button {

    private String name;
    private List<Sub_button> sub_button;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setSub_button(List<Sub_button> sub_button) {
         this.sub_button = sub_button;
     }
     public List<Sub_button> getSub_button() {
         return sub_button;
     }

}