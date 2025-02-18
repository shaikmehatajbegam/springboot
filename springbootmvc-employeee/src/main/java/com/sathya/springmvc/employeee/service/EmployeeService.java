package com.sathya.springmvc.employeee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.springmvc.employeee.entity.EmployeeEntity;
import com.sathya.springmvc.employeee.model.EmployeeModel;
import com.sathya.springmvc.employeee.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public void saveEmployeeDetails(EmployeeModel employeeModel) {
int overTime = 10;
		
		double otPay = 2000;
		
		double otAmt ;
		otAmt = overTime * otPay;
		
		double grossSal;
		grossSal = employeeModel.getSal() + otAmt;
		
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		employeeEntity.setName(employeeModel.getName());
		employeeEntity.setSal(employeeModel.getSal());
		employeeEntity.setAge(employeeModel.getAge());
		employeeEntity.setCompany(employeeModel.getCompany());
		employeeEntity.setOverTime(overTime);
		employeeEntity.setOtPay(otPay);
		employeeEntity.setOtAmt(otAmt);
		employeeEntity.setGrossSal(grossSal);
		
		employeeRepository.save(employeeEntity);
		
	}

	public List<EmployeeEntity> getAllEmployee()
	{
		List<EmployeeEntity> employee = employeeRepository.findAll();
		return employee;
	}


	public  EmployeeEntity searchById(Long id) {
		Optional<EmployeeEntity>optionalData=employeeRepository.findById(id);
		
		if(optionalData.isPresent())
		{
			EmployeeEntity employee = optionalData.get();
			return employee;
		}
		else {
			return null;
		}
		
	}
	
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		
		
	}

	
}
