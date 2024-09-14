package com.AbstractFactoryDesignpattern;

public class EmployeeFactory {

	static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}
}
