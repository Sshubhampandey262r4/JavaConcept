package com.designPatterns1.AbstractFactoryPatterns;

import com.designPatterns1.Employee;

public class EmployeeFactoryA1 {
     
	static Employee getEmployee(AbstractEmployeeFactory emp) {
		return emp.createEmployee();
	}
}
