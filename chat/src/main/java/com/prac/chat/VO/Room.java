package com.prac.chat.VO;

public class Room {
	private int roomseq;
	private String userID;
	private String name;
	private String indate;
	
	public Room(int roomseq, String userID, String name, String indate) {
		super();
		this.roomseq = roomseq;
		this.userID = userID;
		this.name = name;
		this.indate = indate;
	}

	public Room() {
		super();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "Room [roomseq=" + roomseq + ", userID=" + userID + ", name=" + name + ", indate=" + indate + "]";
	}
	
}
