package com.biz.user.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.biz.user.vo.Users;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAOIF {
	
	@Autowired
	SqlSession session;
	
	@Override
	public int insertUser(Users user) {							
		return session.insert("insertUser",user);	
	}

	@Override
	public int updateUser(Users user) {		
			return session.update("updateUser", user);
	}
	
	@Override
	public int deleteUser(String id) {		
		return session.delete("deleteUser", id);
	}

	@Override
	public Users findUser(String id) {		
		return (Users)session.selectOne("findUsers",id);		
	}

	@Override
	public boolean login(String id, String password) {
		boolean isExist=false;		
		
		HashMap<String, String> loginInfo = new HashMap<String, String>();
		loginInfo.put("id", id);
		loginInfo.put("password",password);		
		
			Object result = session.selectOne("login", loginInfo);
			if(result != null ) isExist=true;
		
		return isExist;	
	}

	@Override
	public ArrayList<Users> findUserList() {
		ArrayList<Users> userList=new ArrayList<Users>();			
		List<Users> result = session.selectList("findUserList");
		for(Users user : result){
			userList.add(user);
		}		 	
		return userList;
	}
}
