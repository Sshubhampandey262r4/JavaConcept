package com.designPatterns1.BuilderPatterns;

public class User {
	
	private final int userId;
	private final String userName;
	private final String password;
	
	private User(UserBuilderNew bl) {
		// TODO Auto-generated constructor stub
		this.userId=bl.userId;
		this.userName=bl.userName;
		this.password=bl.password;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}



	static class UserBuilderNew{
		private int userId;
		private String userName;
		private String password;
		
		public UserBuilderNew setUserId(int userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilderNew setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilderNew setPassword(String password) {
			this.password = password;
			return this;
		}
		
	public User build() {
			User users=new User(this);
			return users;
		}
	}

}
