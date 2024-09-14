package com.builderdesignpattern;

public class MyUsersw {
	
	private String username;
	private String password;
	
	
	public MyUsersw(Builder bs) {
		this.username = bs.username;
		this.password = bs.password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	static class Builder{
		private String username;
		private String password;
		
		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}
	
		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}
		
		MyUsersw build() {
			MyUsersw rrs=new MyUsersw(this);
		   return rrs;
		}
		
		
	}
	

}
