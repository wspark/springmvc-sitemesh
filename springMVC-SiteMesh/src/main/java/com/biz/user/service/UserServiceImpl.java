package com.biz.user.service;

import java.util.ArrayList;

import com.biz.user.dao.UserDAOIF;
import com.biz.user.vo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceIF {

	@Autowired
	private UserDAOIF userDAO;

	@Override
	public void addUser(Users user) throws Exception {
		int row = userDAO.insertUser(user);
		if( row < 0) throw new Exception("등록실패"+user.getId());	
	}

	@Override
	public void updateUser(Users user) throws Exception {
		int row = userDAO.updateUser(user);
		if( row < 0 ) throw new Exception("수정실패:"+user.getId());
	}

	@Override
	public void deleteUser(String id)  throws Exception{
		int row = userDAO.deleteUser(id);
		if( row < 0 ) throw new Exception("삭제실패 :"+id);		
	}

	@Override
	public Users findUser(String id) throws Exception {
		Users user = userDAO.findUser(id);
		if(user ==null) throw new Exception("검색실패:"+id);		
		return user;
	}

	@Override
	public ArrayList<Users> findUsers() {
		ArrayList<Users> userList = userDAO.findUserList();
		return userList;
	}

	@Override
	public boolean login(String id, String password) throws Exception {
		return userDAO.login(id, password);
	}

}
