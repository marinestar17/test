package com.prac.chat;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prac.chat.DAO.ChatDAO;
import com.prac.chat.VO.Chat;
import com.prac.chat.VO.Room;
import com.prac.chat.VO.UserAccount;

@Controller
public class ChatController {
	
	@Autowired
	ChatDAO dao;
	
	@RequestMapping(value = "/goLogin", method = RequestMethod.GET)
	public String goLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/goJoin", method = RequestMethod.GET)
	public String goJoin() {
		return "join";
	}
	
	@RequestMapping(value = "/goRoomList", method = {RequestMethod.GET, RequestMethod.POST})
	public String goRoomList(Model mod) {
		ArrayList<Room> rList = null;
		try {
			rList = dao.showRoomList();
			mod.addAttribute("rList", rList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "roomList";
	}
	
	@RequestMapping(value = "/goMakeRoom", method = RequestMethod.GET)
	public String goMakeRoom() {
		return "makeRoom";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserAccount u, Model mod) {
		int result = 0;
		try {
			result = dao.join(u);
			mod.addAttribute("join", "∞°¿‘µ  §∑§∑");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping (value = "/logIn", method = RequestMethod.POST)
	public String login(UserAccount u, HttpSession h) {
		UserAccount user = null;
		try {
			user = dao.logIn(u);
			h.setAttribute("mem", user);
		} catch (Exception e) {
			e.printStackTrace();
			return "login";
		}
		return "home";
	}
	
	@RequestMapping(value = "/makeRoom", method = RequestMethod.POST)
	public String makeRoom(Room r, Model mod) {
		int result = 0;
		try {
			result = dao.makeRoom(r);
			mod.addAttribute("room", r);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/roomDetail";
	}
	
	@RequestMapping(value = "/roomDetail", method = {RequestMethod.GET, RequestMethod.POST})
	public String roomDetail(Room room, String roomseq, Model mod) {
		ArrayList<Chat> cList = null;
		Room r = null;
		try {
			r = dao.roomDetail(roomseq);
			mod.addAttribute("room", r);
			cList = dao.printChat(roomseq);
			mod.addAttribute("cList", cList);
		} catch (Exception e) {
			e.printStackTrace();
			return "roomList";
		}
		return "roomDetail";
	}
	
	@RequestMapping(value = "/insertChat", method = RequestMethod.POST)
	public String insertChat(Chat c, Model mod) {
		ArrayList<Chat> cList = null;
		int result = 0;
		try {
			result = dao.insertChat(c);
			cList = dao.printChat(c.getRoomseq()+"");
			Room r = dao.roomDetail(c.getRoomseq()+"");
			mod.addAttribute("cList", cList);
			mod.addAttribute("room", r);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "roomDetail";
	}
	
	@RequestMapping(value = "/returnList" , method = RequestMethod.GET)
	public String returnList() {
		return "redirect:/goRoomList";
	}
}
