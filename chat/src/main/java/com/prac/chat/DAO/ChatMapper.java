package com.prac.chat.DAO;

import java.util.ArrayList;

import com.prac.chat.VO.Chat;
import com.prac.chat.VO.Room;
import com.prac.chat.VO.UserAccount;

public interface ChatMapper {
	
	public int join(UserAccount u);
	
	public UserAccount logIn(UserAccount u);
	
	public int makeRoom(Room r);
	
	public ArrayList<Room> showRoomList();
	
	public Room roomDetail(String roomseq);
	
	public int insertChat(Chat c);
	
	public ArrayList<Chat> printChat(String roomseq);
}
