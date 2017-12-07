package com.huateng.wxmgr.userbatch.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huateng.wxmgr.userbatch.service.AccessTokenService;

public class GetUsersInfoJob {

	private final static Logger logger = LoggerFactory.getLogger(GetUsersInfoJob.class);
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("config/UserBatch.xml");

		AccessTokenService accessTokenService = context.getBean(AccessTokenService.class);
		String accessToken = accessTokenService.getAccessToken();

		logger.info("GetUsersInfoJob>>>>>>>>> {} ",accessToken);		

		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("getUserInfoJob");
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		
		try {
			launcher.run(job, jobParametersBuilder.addString("nextOpenid", "begin").toJobParameters());
			
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException
				| JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
