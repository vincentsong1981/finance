package com.wolaidai.ws.jrocket2.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BankServiceTest
{
	BankService bankService = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{}

	@Before
	public void setUp() throws Exception
	{
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("config/jrocket2-mybatis-spring-context.xml"
					,"config/finance-mybatis-spring-context.xml");

		bankService = context.getBean(BankService.class);

	}

	@Test
	public void test()
	{
		System.out.println("bankcard number is :" + bankService.getBankCardNumber());
	}

	@After
	public void tearDown() throws Exception
	{}

}
