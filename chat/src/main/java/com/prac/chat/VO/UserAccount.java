package com.prac.chat.VO;

public class UserAccount {
	private String userID;
	private String userPW;
	
	public UserAccount(String userID, String userPW) {
		super();
		this.userID = userID;
		this.userPW = userPW;
	}

	public UserAccount() {
		super();
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	@Override
	public String toString() {
		return "UserAccount [userID=" + userID + ", userPW=" + userPW + "]";
	}
	
	
}
