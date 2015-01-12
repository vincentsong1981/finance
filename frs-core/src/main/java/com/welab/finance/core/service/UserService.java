package com.welab.finance.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welab.finance.core.model.Users;
import com.welab.finance.core.model.mapper.FinanceUserMapper;

@Service
public class UserService
{

	@Autowired
	FinanceUserMapper userMapper;

	public UserService()
	{
		// TODO Auto-generated constructor stub
	}

	public void insertUser(Users user)
	{
//		userMapper.insertUser(user.getName(), user.getRoleId(), user.getEmail(), user.getEncryptedPassword(),
//				user.getCreatedAt(), user.getUpdatedAt(),user.getSignInCount(), user.getCurrentSignInAt(), user.getCurrentSignInIp(),
//				user.getLocked(), user.getFailedAttempts(), user.getLockedAt());
		
		userMapper.insertUser(user);
	}

}
