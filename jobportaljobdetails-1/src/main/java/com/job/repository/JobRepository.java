package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.model.Jobdetails;

public interface JobRepository extends JpaRepository<Jobdetails,Integer> {

}
