package com.wolaidai.ws.jrocket2.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.welab.finance.core.model.Users;
import com.welab.finance.core.service.UserService;

public class UserServiceTest
{
	ClassPathXmlApplicationContext context = null;
	
	UserService userService = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{}

	@Before
	public void setUp() throws Exception
	{
		context = new ClassPathXmlApplicationContext("config/finance-mybatis-spring-context.xml","config/jrocket2-mybatis-spring-context.xml");

		userService = context.getBean(UserService.class);

	}

	@After
	public void tearDown() throws Exception
	{}
	
	@Test
	public void insertUserTest()
	{
		String name = "Peter nameForTest";
		String roleId = "1";
		String email = "vincent.song@wolaidai.com";
		String password = "encryptedpassword";
		Date createAt = new Date();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2014, 6, 6);
		Date updateAt = calendar.getTime();
		
		int signIncount = 10;
		Date currentSignAt = new Date();
		String ip= "192.168.0.1";
		Boolean locked = false;
		int failedAttempts = 3;
		Date lockedAtDate = null;
		
		
		Users users = new Users();
		users.setName(name);
		users.setRoleId(roleId);
		users.setEmail(email);
		users.setEncryptedPassword(password);
		users.setCreatedAt(createAt);
		users.setUpdatedAt(updateAt);
		users.setSignInCount(0);
		users.setCurrentSignInAt(currentSignAt);
		users.setCurrentSignInIp(ip);
		users.setLocked(locked);
		users.setFailedAttempts(failedAttempts);
		users.setLockedAt(lockedAtDate);
		
		try
		{
			userService.insertUser(users);
		}
		catch (Throwable e)
		{	
			e.printStackTrace();
			Assert.fail("Error happen when insert data to users table");
			
		}
		
	}
	



}
