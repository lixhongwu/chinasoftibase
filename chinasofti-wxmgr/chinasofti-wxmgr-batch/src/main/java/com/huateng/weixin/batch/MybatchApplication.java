package com.huateng.weixin.batch;


import com.huateng.weixin.batch.job.KefuMessageJob;

//@SpringBootApplication
public class MybatchApplication {

    public static void main(String[] args) {
//    	MessageJob.sendMessage();
    	KefuMessageJob.sendKefuMessage();
    }
    
    
}
