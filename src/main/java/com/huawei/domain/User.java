package com.huawei.domain;

public class User {
	private int userId;
	private char[] userPassword;
	private char[] userName;
	private char[] userTel;
	private char[] userEmail;
	
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
	public char[] getuserPassword() {
		return userPassword;
	}
	public void setuserPassword(char[] userPassword) {
		this.userPassword = userPassword;
	}
	public char[] getUserName() {
		return userName;
	}
	public void setUserName(char[] userName) {
		this.userName = userName;
	}
	public char[] getUserTel() {
		return userTel;
	}
	public void setUserTel(char[] userTel) {
		this.userTel = userTel;
	}
	public char[] getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(char[] userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString(){
		return String.valueOf(userId) + "," + userName.toString() + "," + userPassword.toString() + ","
				+  userTel.toString() + "," +userEmail.toString();
	}
}
