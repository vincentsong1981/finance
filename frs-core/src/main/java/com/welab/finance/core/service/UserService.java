package com.welab.finance.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.welab.finance.core.model.User;
import com.welab.finance.core.model.mapper.FinanceUserMapper;

@Service
@Transactional
public class UserService
{

	@Autowired
	FinanceUserMapper userMapper;

	public UserService()
	{
		// TODO Auto-generated constructor stub
	}

	public void insertUser(User user)
	{
		userMapper.insertUser(user);
	}

	public List<User> getAllUsers()
	{
		List<User> userList = (List<User>) userMapper.getAllUsers();
		return userList;
	}
	
	public User getUserById(Integer id)
	{
		User user = (User)userMapper.getUserById(id);
		
		return user;
	}
	
	
	public void updateUserById(User user)
	{
		userMapper.updateUserById(user);
	}
	
	public void removeUserById(Integer id)
	{
		userMapper.removeUserById(id);
	}

}
