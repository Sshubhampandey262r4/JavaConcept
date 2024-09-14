package com.builderdesignpattern;

import com.builderdesignpattern.MyUser.builderClass;
import com.builderdesignpattern.User.UserBuilder;

public class Main {

	public static void main(String[] args) {
		
		// Builder Pattern Create an Object Step by Step
		
		
		// TODO Auto-generated method stub
		
//		User user=new User.UserBuilder()
//				.setUserId("1234")
//				.setEmaiId("shubham@gmail.com")
//				.setUserName("shubham123").Build();
   User user=User.UserBuilder.builder()
                        .setEmaiId("shubham@gmail.com")
                        .setUserId("12344")
                        .setUserName("shubham123").Build();
   System.out.println(user);
   
   
  MyUser my=new MyUser.builderClass().setUsername("shubham123").setPassword("123").build();
  System.out.println(my);
  
  MyUsersw mys= new MyUsersw.Builder().setUsername(null).setPassword(null).build();

	}

}
