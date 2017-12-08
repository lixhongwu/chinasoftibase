package com.huateng.weixin.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageJob {

	 /**
     * 发送模板消息
     */
    public static void sendMessage(){
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("template_message.xml");
    	JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
    	Job job = (Job) applicationContext.getBean("messageJob");
    	JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
    	JobParameters jobParameters = jobParametersBuilder.addString("sql", "select *from wx_user_fans").toJobParameters();
    	 long start = System.currentTimeMillis();
         try {
        	 jobLauncher.run(job, jobParameters);
         } catch (JobExecutionAlreadyRunningException e) {
             e.printStackTrace();
         } catch (JobRestartException e) {
             e.printStackTrace();
         } catch (JobInstanceAlreadyCompleteException e) {
             e.printStackTrace();
         } catch (JobParametersInvalidException e) {
             e.printStackTrace();
         }
         long end = System.currentTimeMillis();
         System.out.println("---耗时：" + (end - start) / 1000 + "秒");
    }
}
