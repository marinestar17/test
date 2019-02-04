package com.prac.chat.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prac.chat.VO.Chat;
import com.prac.chat.VO.Room;
import com.prac.chat.VO.UserAccount;

@Repository
public class ChatDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int join(UserAccount u) {
		ChatMapper map = sqlSession.getMapper(ChatMapper.class);
		int result = 0;
		try {
			result = map.join(u);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public UserAccount logIn(UserAccount u) {
		UserAccount user = null;
		ChatMapper map = sqlSession.getMapper(ChatMapper.class);
		try {
			user = map.logIn(u);
		} catch (Exception e) {
			e.printStackTrace();
			return user;
		}
		return user;
	}
	
	public int makeRoom(Room r) {
		int result = 0;
		ChatMapper map = sqlSession.getMapper(ChatMapper.class);
		try {
			result = map.makeRoom(r);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public ArrayList<Room> showRoomList() {
		ArrayList<Room> rList = null;
		ChatMapper map = sqlSession.getMapper(ChatMapper.class);
		try {
			rList = map.showRoomList();
		} catch (Exception e) {
			e.printStackTrace();
			return rList;
		}
		return rList;
	}
	
	public Room roomDetail(String roomseq) {
		Room r = null;
		ChatMapper map = sqlSession.getMapper(ChatMapper.class);
		try {
			r = map.roomDetail(roomseq);
		} catch (Exception e) {
			e.printStackTrace();
			return r;
		}
		return r;
	}
	
	public int insertChat(Chat c) {
		int result = 0;
		ChatMapper map = sqlSession.getMapper(ChatMapper.class);
		try {
			result = map.insertChat(c);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public ArrayList<Chat> printChat(String roomseq) {
		ArrayList<Chat> cList = null;
		ChatMapper map = sqlSession.getMapper(ChatMapper.class);
		try {
			cList = map.printChat(roomseq);
		} catch (Exception e) {
			e.printStackTrace();
			return cList;
		}
		return cList;
	}
	
}
