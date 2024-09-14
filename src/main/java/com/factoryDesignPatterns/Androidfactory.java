package com.factoryDesignPatterns;

public class Androidfactory extends EmployeeAbstractFactory {

	@Override
	Employee creEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
