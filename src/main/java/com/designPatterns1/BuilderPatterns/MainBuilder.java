package com.designPatterns1.BuilderPatterns;

import com.designPatterns1.BuilderPatterns.User.UserBuilderNew;

public class MainBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User us=  new User.UserBuilderNew().setUserId(1).setUserName("shubham123").setPassword("123").build();
        
        System.out.println(us);
	}

}
