package com.job.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobdetails")
public class Jobdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Jobid;
	private String jobname;
	private String jobskills;
	private String companyname;
	private String salary;
	public int getJobid() {
		return Jobid;
	}
	public void setJobid(int jobid) {
		Jobid = jobid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getJobskills() {
		return jobskills;
	}
	public void setJobskills(String jobskills) {
		this.jobskills = jobskills;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
