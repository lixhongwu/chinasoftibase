package com.huateng.weixin.batch.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class GetUserJob {
	
	private static Logger logger = LoggerFactory.getLogger(GetUserJob.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("job/GetUsersJob.xml");
		
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("getUserJob");
		try {
			JobExecution result = launcher.run(job, new JobParametersBuilder().toJobParameters());
			 //处理结束，控制台打印处理结果 
			logger.info(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			((ConfigurableApplicationContext)context).close();
		}
	}
}
