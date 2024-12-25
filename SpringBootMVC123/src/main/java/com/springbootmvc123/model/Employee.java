package com.springbootmvc123.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {
	 int empId;
	 String empName;
	 double empSal;
       public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=Employee.builder()
                                   .empId(100)
                                   .empName("Meher")
                                   .empSal(11000.00)
                                   .build();
		System.out.println(employee);
                                   
		
			

	}

}
