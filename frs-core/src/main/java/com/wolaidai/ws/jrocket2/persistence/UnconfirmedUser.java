package com.wolaidai.ws.jrocket2.persistence;

// Generated Jan 3, 2015 2:18:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UnconfirmedUsers generated by hbm2java
 */
public class UnconfirmedUser implements java.io.Serializable
{
	private static final long serialVersionUID = -4109485242903682008L;
	private Integer id;
	private String mobile;
	private String remoteIp;
	private Date createdAt;
	private Date updatedAt;

	public UnconfirmedUser()
	{}

	public UnconfirmedUser(Integer id)
	{
		this.id = id;
	}

	public UnconfirmedUser(Integer id, String mobile, String remoteIp, Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.mobile = mobile;
		this.remoteIp = remoteIp;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getMobile()
	{
		return this.mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getRemoteIp()
	{
		return this.remoteIp;
	}

	public void setRemoteIp(String remoteIp)
	{
		this.remoteIp = remoteIp;
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
