package com.sathya.springmvc.employeee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathya.springmvc.employeee.entity.EmployeeEntity;
import com.sathya.springmvc.employeee.model.EmployeeModel;
import com.sathya.springmvc.employeee.service.EmployeeService;


@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
@GetMapping("/employeeform")
	public String getEmployeeForm()
	{
	
		
		return "Employee";
}
@PostMapping("/save employee")
public String saveEmployee(EmployeeModel employeeModel) {
	employeeService.saveEmployeeDetails(employeeModel);
	
	return "Sucess";
}


@GetMapping("/getallemployee")
public String showEmployees(Model model) {
    List<EmployeeEntity> employees = employeeService.getAllEmployee();
    model.addAttribute("employees", employees);
    return "Employeelist";
}


@GetMapping("/getsearchform")
public String getsearchform() {
	return"searchemployee";
	}
@PostMapping("/searchbyid")
public String Searchbyid(@RequestParam Long id,Model model) {
	EmployeeEntity employee=employeeService.searchById(id);
	model.addAttribute("employee",employee);
	return"searchemployee";
}
@GetMapping("/delete/{id}")
public String deleteEmployeeById(@PathVariable("id") Long id) {
	employeeService.deleteEmployeeById(id);
	return "redirect:/getallemployee";
	
}

}
