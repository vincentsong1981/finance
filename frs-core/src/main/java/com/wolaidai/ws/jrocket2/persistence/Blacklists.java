package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Blacklists generated by hbm2java
 */
public class Blacklists implements java.io.Serializable
{

	private int id;
	private String name;
	private String mobile;
	private String gender;
	private String email;
	private String cnid;
	private String cnidAddress;
	private String address;
	private Integer siteId;
	private Date createdAt;
	private Date updatedAt;

	public Blacklists()
	{}

	public Blacklists(int id)
	{
		this.id = id;
	}

	public Blacklists(int id, String name, String mobile, String gender, String email, String cnid, String cnidAddress,
			String address, Integer siteId, Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.email = email;
		this.cnid = cnid;
		this.cnidAddress = cnidAddress;
		this.address = address;
		this.siteId = siteId;
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

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMobile()
	{
		return this.mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getGender()
	{
		return this.gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getCnid()
	{
		return this.cnid;
	}

	public void setCnid(String cnid)
	{
		this.cnid = cnid;
	}

	public String getCnidAddress()
	{
		return this.cnidAddress;
	}

	public void setCnidAddress(String cnidAddress)
	{
		this.cnidAddress = cnidAddress;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Integer getSiteId()
	{
		return this.siteId;
	}

	public void setSiteId(Integer siteId)
	{
		this.siteId = siteId;
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
