package com.factoryDesignPatterns;

public class WebDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	Employee creEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}

}
