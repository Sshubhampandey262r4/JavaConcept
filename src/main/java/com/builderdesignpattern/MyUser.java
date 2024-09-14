package com.builderdesignpattern;

import com.builderdesignpattern.User.UserBuilder;

public class MyUser {
     private final String username;
     private final String password;
     
	public MyUser(builderClass bs) {
		this.username = bs.username;
		this.password = bs.password;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	
	
	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + "]";
	}



	static class builderClass{
		 private  String username;
	     private  String password;
		 public builderClass() {
			// TODO Auto-generated constructor stub
		 }
		
		public builderClass setUsername(String username) {
			this.username = username;
			return this;
		}
		public builderClass setPassword(String password) {
			this.password = password;
			return this;
		}
		MyUser build() {
			MyUser us=new MyUser(this);
			 return us;
		 } 
		
	}
     
     
}
