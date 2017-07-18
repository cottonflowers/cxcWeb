package com.huawei.domain;

public class User {
	private int userId;
	private String userPassword;
	private String userName;
	private String userTel;
	private String userEmail;
	
	public User(){}
	public User(User user) {
		this.userId = user.userId;
		this.userPassword = user.userPassword;
		this.userName = user.userName;
		this.userTel = user.userTel;
		this.userEmail = user.userEmail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public String toString(){
		return String.valueOf(userId) + "," + userName + "," + userPassword + ","
				+  userTel + "," +userEmail;
	}
}
