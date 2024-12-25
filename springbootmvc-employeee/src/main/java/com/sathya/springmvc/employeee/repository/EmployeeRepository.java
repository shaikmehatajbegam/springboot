package com.sathya.springmvc.employeee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.springmvc.employeee.entity.EmployeeEntity;



	public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{
		

}
