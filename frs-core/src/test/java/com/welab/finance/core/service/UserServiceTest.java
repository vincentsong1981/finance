package com.welab.finance.core.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.welab.finance.core.model.User;
import com.welab.finance.core.model.mapper.FinanceUserMapper;
import com.welab.finance.core.service.UserService;

public class UserServiceTest
{
	FinanceUserMapper m_userMapper = null;

	ClassPathXmlApplicationContext m_context = null;

	UserService m_userService = null;

	User m_user = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{}

	@Before
	public void setUp() throws Exception
	{
		// context = new
		// ClassPathXmlApplicationContext("config/finance-mybatis-spring-context.xml","config/jrocket2-mybatis-spring-context.xml");
		m_context = new ClassPathXmlApplicationContext("applicationContext.xml");

		m_userService = m_context.getBean(UserService.class);

		m_userMapper = m_context.getBean(FinanceUserMapper.class);

		m_user = mockUser();

	}

	@After
	public void tearDown() throws Exception
	{}

	@Test
	public void insertUserTest()
	{
		try
		{
			m_userService.insertUser(m_user);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
			Assert.fail("Error happen when insert data to users table");

		}

	}

	@Test
	public void getAllUsersTest()
	{

		List<User> userList = (List<User>) m_userMapper.getAllUsers();

		Assert.assertNotNull(userList);

	}

	@Test
	public void getSingleUserTest()
	{
		List<User> userList = (List<User>) m_userMapper.getAllUsers();

		Integer expectedId = userList.get(0).getId();
		User user = m_userMapper.getUserById(expectedId);

		Assert.assertNotNull(user);
		Assert.assertNotNull(user.getId());
		Assert.assertEquals(expectedId, user.getId());

		System.out.print("--------------------------------------------" + user.getEmail());
	}

	@Test
	public void updateUserByIdTest()
	{
		List<User> userList = (List<User>) m_userMapper.getAllUsers();

		Integer expectedId = userList.get(0).getId();
		String expectedIp = "0.0.0.0";
		User user = m_userMapper.getUserById(expectedId);

		user.setCurrentsigninip(expectedIp);
		m_userMapper.updateUserById(user);

		User actualUser = m_userMapper.getUserById(expectedId);

		Assert.assertEquals(expectedIp, actualUser.getCurrentsigninip());

	}

	@Test
	public void removeUserByIdTest()
	{
		Integer expectedId = 3;

		m_userMapper.removeUserById(expectedId);
		User user = m_userMapper.getUserById(expectedId);

		Assert.assertNull(user);

	}

	public User mockUser()
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
		String ip = "192.168.0.1";
		Boolean locked = false;
		int failedAttempts = 3;
		Date lockedAtDate = null;

		User user = new User();
		user.setName(name);
		user.setRoleid(roleId);
		user.setEmail(email);
		user.setEncryptedpassword(password);
		user.setCreatedat(createAt);
		user.setUpdatedat(updateAt);
		user.setSignincount(signIncount);
		user.setCurrentsigninat(currentSignAt);
		user.setCurrentsigninip(ip);
		user.setLocked(locked);
		user.setFailedattempts(failedAttempts);
		user.setLockedat(lockedAtDate);

		return user;
	}

}
