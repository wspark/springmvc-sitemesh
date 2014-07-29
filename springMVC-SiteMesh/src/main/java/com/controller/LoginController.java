package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.user.service.UserServiceIF;


@Controller
public class LoginController {
	
	@Autowired
	UserServiceIF service;
	
	@RequestMapping("/login.do")
	public String login(@RequestParam("id") String id, @RequestParam("password") String password,HttpServletRequest request,Model model) throws Exception {
				
		String nextPage=null;		
		boolean isExist = false;
	
			try {		
				isExist = (boolean)service.login(id, password);
			} catch (Exception e) {				
				e.printStackTrace();
			}
			System.out.println("isExist = "  + isExist);
	
		if(isExist){
			//session 생성
			HttpSession session=request.getSession();
			session.setAttribute("id",id);
			model.addAttribute("login", id);
			model.addAttribute("message",id+"님 반갑습니다.");
			//view select
			nextPage="result";
		}else{
			nextPage="login";
		}
		return nextPage;		
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession(false);
		if(session !=null && session.getAttribute("id") !=null){
			session.invalidate(); //session 소멸
		}		
		return "login";			
	}
	
	@RequestMapping("/home.do")
	public String home() throws Exception {
		return "login";	
	}

}
