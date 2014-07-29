package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.user.service.UserServiceIF;
import com.biz.user.vo.Users;

@Controller
public class UserController{
	
	@Autowired
	UserServiceIF service;
	
	@RequestMapping("/delete.do")
	public String delete(@RequestParam("id") String id, Model model) throws Exception {
			
		try{			
			service.deleteUser(id);
			model.addAttribute("message", "삭제성공");			
			
		}catch(Exception e){
			model.addAttribute("message",e.getMessage());
		
		}		
		return "result";
	}
	
	@RequestMapping("/input.do")
	public String input() throws Exception {		
		return "input";	
	}
	
	@RequestMapping("/list.do")
	public String list(Model model) throws Exception {	
		ArrayList<Users> userList = service.findUsers();
		model.addAttribute("userList", userList);			
		return "list";		
	}
	
	@RequestMapping("/save.do")
	public String save(@RequestParam("id") String id,@RequestParam("password") String password,
					         @RequestParam("name") String name,@RequestParam("role") String role, Model model) throws Exception {
		String nextPage=null;		
		try{
			service.addUser(new Users(id,password,name,role));
			model.addAttribute("message", "등록되었습니다");
			
			nextPage="result";
		}catch(Exception e){
			model.addAttribute("message",e.getMessage());
		}	
		nextPage="result";
		return nextPage;
	}
	
	@RequestMapping("/update.do")
	public String update(@RequestParam("id") String id,@RequestParam("password") String password,
	         @RequestParam("name") String name,@RequestParam("role") String role, Model model)  throws Exception {	        		
					
		try{
			service.updateUser(new Users(id,password,name,role));
			model.addAttribute("message","수정성공");
			
		}catch(Exception e){
			model.addAttribute("message",e.getMessage());
		}		
		return "result";		
	}
	
	@RequestMapping("/view.do")
	public String view(@RequestParam("id") String id, Model model) throws Exception {
		String nextPage=null;
		try{
			Users user = service.findUser(id);			
			model.addAttribute("user", user);
			nextPage="view";
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
			nextPage="result";
		}				
		return nextPage;
	}	
	
}
