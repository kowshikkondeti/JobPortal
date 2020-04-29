package com.job.service;

import java.util.List;

import com.job.model.Jobdetails;

public interface JobServiceInterface {

	public List<Jobdetails> getAllJobdetails();
	public void saveJob(Jobdetails jobdetails);
	public boolean updatejobdetails(Jobdetails jobdetails);
	public void deletejob(Integer Jobid);

}
