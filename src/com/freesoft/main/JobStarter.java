package com.freesoft.main;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobStarter {

	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		String[] contextConfig = { "/resources/job-config.xml" };

		@SuppressWarnings("resource")
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfig);
		System.out.println(
				"### The applicationContext was initialised whit the hash-code: " + applicationContext.toString());
		/*JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
		Job job = (Job) applicationContext.getBean("mysql2mysqlJob");
		JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
		System.out.println("### Exit with status: " + jobExecution.getStatus());*/

	}

}
