package com.AbstractFactoryDesignpattern;

public class WebDevFactory extends EmployeeAbstractFactory {

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}

}
