package com.designPatterns1;

public class EmployeeFactory {
     
	static Employee getEmployee(String input) {
		if(input.trim().equalsIgnoreCase("Android")) {
			return new AndroidDeveloper();
		}
		else if(input.trim().equalsIgnoreCase("Web")) {
			return new WebDeveloper();
		}
		return null;
	}
}
