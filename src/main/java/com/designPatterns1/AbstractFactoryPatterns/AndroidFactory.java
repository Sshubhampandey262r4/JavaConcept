package com.designPatterns1.AbstractFactoryPatterns;

import com.designPatterns1.AndroidDeveloper;
import com.designPatterns1.Employee;

public class AndroidFactory extends AbstractEmployeeFactory {

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
