package com.welab.finance.core.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolaidai.ws.jrocket2.service.BankService;

public class IgnoreMeTest
{

	

	public static void main(String[] args) throws IOException
	{
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BankService service = context.getBean(BankService.class);
		
		
		System.out.println("bankcard number is :" + service.getBankCardNumber());
		context.close();
	
//		
//		String driver = Configurations.getString("datasource.driver");
//		String username = Configurations.getString("datasource.username");
//		String url = Configurations.getString("datasource.url");
//		String password = Configurations.getString("datasource.password");
//		
//		System.out.println(driver);
//		System.out.println(username);
//		System.out.println(url);
//		System.out.println(password);

	/*	InputStream is = Resources.getResourceAsStream("config/mybatis.xml");

		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sessionFactory.openSession();
		*/
		
		
		
		
/*		BankCard bankCard = sqlSession.selectOne("getBankCardsByUser", 6);
		
		System.out.println(bankCard.getAccount_number());
		System.out.println(bankCard.getProvince());
		sqlSession.close();*/
		
		
		
		
	}

}
