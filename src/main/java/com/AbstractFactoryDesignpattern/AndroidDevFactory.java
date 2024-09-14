package com.AbstractFactoryDesignpattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
