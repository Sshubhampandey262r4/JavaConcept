package com.designPatterns1.AbstractFactoryPatterns;

import com.designPatterns1.AndroidDeveloper;
import com.designPatterns1.Employee;
import com.designPatterns1.WebDeveloper;

public class WebFactory extends AbstractEmployeeFactory {

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}
}
