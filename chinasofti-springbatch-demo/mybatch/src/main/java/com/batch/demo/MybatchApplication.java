package com.batch.demo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 配置文件五个  一个是公共的 在每个类别的配置文件中都进行导入了
 * 如：读取文件--处理文件--写入文件  对应配置文件batch_FTF.xml 对应的包是FTF 启动方法名称 run（）
 * inputFile.csv是输入文件，product.sql 是数据库建表语句，在数据库到数据库的demo中，新旧库都是相同表
 * @author chen
 *
 */
//@SpringBootApplication
public class MybatchApplication {

	public static void main(String[] args) {
		System.out.println("hello world！");
//		MybatchApplication.RunFTD();
//		MybatchApplication.RunDTD();
//		MybatchApplication.RunDTF();
		MybatchApplication.RunFTF();
	}
	
	/**
	 * 启动 数据库--》数据库
	 * 注意新旧两个数据库的配置和使用jdbctemplate 装载的不同
	 */
	public static void RunDTD(){
		ApplicationContext context = new ClassPathXmlApplicationContext("batch_DTD.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("DTDJOB");
		//构建参数
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		//sql 是配置文件中的<property name="sql" value="#{jobParameters['sql']}"/>  已经测试使用select * 也可以，不需要字段
		JobParameters jobParameters = jobParametersBuilder.addString("sql", "select id,name,description,quantity from product where id <4000").toJobParameters();
		long start = System.currentTimeMillis();
		try {
			launcher.run(job, jobParameters);
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
		System.out.println("--耗时:" + (end - start)/1000 + "秒");
	}
	/**
	 * 启动 文件--》数据库
	 * 注意：此处读取的文件是绝对路径 
	 * 数据库信息在配置文件里面 建标语句在Resources里
	 */
	public static void RunFTD(){
		ApplicationContext context= new ClassPathXmlApplicationContext("batch_FTD.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("FTDJOB");
		//构建参数
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		//inputFile是配置文件中的value="file:#{jobParameters['inputFile']}"
		JobParameters jobParameters = jobParametersBuilder.addString("inputFile", "C:\\code\\springboot\\mybatch\\src\\main\\resources\\inputFile.csv").toJobParameters();
		long start = System.currentTimeMillis();
		try {
			launcher.run(job, jobParameters);
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
		System.out.println("--耗时:" + (end - start)/1000 + "秒");
	}
	
	/**
	 * 启动 数据库到文件
	 */
	public static void RunDTF(){
		ApplicationContext context = new ClassPathXmlApplicationContext("batch_DTF.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("DTFJOB");
		//构建参数
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		//sql是配置文件中的<property name="sql" value="#{jobParameters['sql']}"/>  已经测试使用select * 也可以，不需要字段
		JobParameters jobParameters = jobParametersBuilder.addString("sql",  "select id,name,description,quantity from product where id <4000").toJobParameters();
		long start = System.currentTimeMillis();
		try {
			launcher.run(job, jobParameters);
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
		System.out.println("--耗时：" + (end - start)/1000 + "秒");
	}
	/**
	 * 启动 文件--》文件
	 */
	public static void RunFTF(){
		ApplicationContext context = new ClassPathXmlApplicationContext("batch_FTF.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("FTFJOB");
		//构建参数
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		JobParameters jobParameters = jobParametersBuilder.addString("inputFile", "C:\\code\\springboot\\mybatch\\src\\main\\resources\\inputFile.csv").toJobParameters();
		long start = System.currentTimeMillis();
		try {
			launcher.run(job, jobParameters);
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
		System.out.println("--耗时：" + (end - start)/1000 + "秒");
	}
}
