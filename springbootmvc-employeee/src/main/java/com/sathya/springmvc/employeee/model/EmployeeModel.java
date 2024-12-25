package com.sathya.springmvc.employeee.model;

import com.sathya.springmvc.employeee.model.EmployeeModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {
	private int id;
	private String name;
	private double sal;
	private int age;
	private String company;


}
