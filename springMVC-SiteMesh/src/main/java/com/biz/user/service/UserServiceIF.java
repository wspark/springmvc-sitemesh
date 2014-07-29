package com.biz.user.service;

import java.util.ArrayList;

import com.biz.user.vo.Users;

public interface UserServiceIF {
	public abstract void addUser(Users user) throws Exception;
	public abstract void updateUser(Users user) throws Exception;
	public abstract void deleteUser(String id) throws Exception;
	public abstract Users findUser(String id) throws Exception;
	public abstract ArrayList<Users> findUsers() throws Exception;	
	public abstract boolean login(String id, String password) throws Exception;		
}
