package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * InternetAccounts generated by hbm2java
 */
public class InternetAccounts implements java.io.Serializable
{

	private int id;
	private String username;
	private String encryptedPassword;
	private String type;
	private Integer borrowerId;
	private Date createdAt;
	private Date updatedAt;

	public InternetAccounts()
	{}

	public InternetAccounts(int id, String username, String encryptedPassword, String type)
	{
		this.id = id;
		this.username = username;
		this.encryptedPassword = encryptedPassword;
		this.type = type;
	}

	public InternetAccounts(int id, String username, String encryptedPassword, String type, Integer borrowerId,
			Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.username = username;
		this.encryptedPassword = encryptedPassword;
		this.type = type;
		this.borrowerId = borrowerId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getEncryptedPassword()
	{
		return this.encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword)
	{
		this.encryptedPassword = encryptedPassword;
	}

	public String getType()
	{
		return this.type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Integer getBorrowerId()
	{
		return this.borrowerId;
	}

	public void setBorrowerId(Integer borrowerId)
	{
		this.borrowerId = borrowerId;
	}

	public Date getCreatedAt()
	{
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt)
	{
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt()
	{
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt)
	{
		this.updatedAt = updatedAt;
	}

}
