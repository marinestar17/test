package com.prac.chat.VO;

public class Chat {
	private int chatseq;
	private int roomseq;
	private String userID;
	private String message;
	private String indate;
	
	public Chat(int chatseq, int roomseq, String userID, String message, String indate) {
		super();
		this.chatseq = chatseq;
		this.roomseq = roomseq;
		this.userID = userID;
		this.message = message;
		this.indate = indate;
	}

	public Chat() {
		super();
	}

	public int getChatseq() {
		return chatseq;
	}

	public void setChatseq(int chatseq) {
		this.chatseq = chatseq;
	}

	public int getRoomseq() {
		return roomseq;
	}

	public void setRoomseq(int roomseq) {
		this.roomseq = roomseq;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "Chat [chatseq=" + chatseq + ", roomseq=" + roomseq + ", userID=" + userID + ", message=" + message
				+ ", indate=" + indate + "]";
	}
	
	
}
