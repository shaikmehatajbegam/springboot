package com.sathya.springmvc.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.springmvc.employee.model.EmployeeModel;
import com.sathya.springmvc.employee.service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
@GetMapping("/employeeform")
	public String getEmployeeForm()
	{
	
		
		return "employee";
}
@PostMapping("/saveemployee")
public String saveEmployee(EmployeeModel employeeModel) {
	employeeService.saveEmployeeDetails(employeeModel);
	
	return "success";
}
	
	
}
	
