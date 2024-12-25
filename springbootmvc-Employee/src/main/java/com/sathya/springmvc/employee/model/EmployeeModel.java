package com.sathya.springmvc.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
	private int id;
	private String name;
	private double sal;
	private int age;
	private String company;

}
