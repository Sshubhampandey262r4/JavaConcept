package com.builderdesignpattern;

import com.builderdesignpattern.MyUser.builderClass;

public class User {
	
	private final String userId;
	private final String userName;
	private final String emaiId;
	
	User(UserBuilder builderClass) {
		// TODO Auto-generated constructor stub
		this.userId=builderClass.userId;
		this.emaiId=builderClass.emaiId;
		this.userName=builderClass.userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmaiId() {
		return emaiId;
	}
	
	// Inner class to create an object
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emaiId=" + emaiId + "]";
	}

	 static class UserBuilder{
		
		private String userId;
		private String userName;
		private String emaiId;
		
		private UserBuilder() {
			// TODO Auto-generated constructor stub
		}
		
		public static UserBuilder builder() {
			return new UserBuilder();
		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmaiId(String emaiId) {
			this.emaiId = emaiId;
			return this;
		}
		
		public User Build() {
			User user=new User(this);
			return user;
		}
		
	}

}
