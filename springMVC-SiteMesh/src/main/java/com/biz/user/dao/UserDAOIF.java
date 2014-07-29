package com.biz.user.dao;

import java.util.ArrayList;
import com.biz.user.vo.Users;

public interface UserDAOIF {
	public abstract int insertUser(Users user);
	public abstract int updateUser(Users user);
	public abstract int deleteUser(String userid);
	public abstract Users findUser(String userid);
	public abstract boolean login(String id, String password);
	public abstract ArrayList<Users> findUserList();

}
