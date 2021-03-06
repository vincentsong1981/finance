package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AccountVersions generated by hbm2java
 */
public class AccountVersions implements java.io.Serializable
{

	private int id;
	private String itemType;
	private int itemId;
	private String event;
	private String whodunnit;
	private String object;
	private Date createdAt;
	private Boolean creditLineChanged;
	private String message;

	public AccountVersions()
	{}

	public AccountVersions(int id, String itemType, int itemId, String event)
	{
		this.id = id;
		this.itemType = itemType;
		this.itemId = itemId;
		this.event = event;
	}

	public AccountVersions(int id, String itemType, int itemId, String event, String whodunnit, String object,
			Date createdAt, Boolean creditLineChanged, String message)
	{
		this.id = id;
		this.itemType = itemType;
		this.itemId = itemId;
		this.event = event;
		this.whodunnit = whodunnit;
		this.object = object;
		this.createdAt = createdAt;
		this.creditLineChanged = creditLineChanged;
		this.message = message;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getItemType()
	{
		return this.itemType;
	}

	public void setItemType(String itemType)
	{
		this.itemType = itemType;
	}

	public int getItemId()
	{
		return this.itemId;
	}

	public void setItemId(int itemId)
	{
		this.itemId = itemId;
	}

	public String getEvent()
	{
		return this.event;
	}

	public void setEvent(String event)
	{
		this.event = event;
	}

	public String getWhodunnit()
	{
		return this.whodunnit;
	}

	public void setWhodunnit(String whodunnit)
	{
		this.whodunnit = whodunnit;
	}

	public String getObject()
	{
		return this.object;
	}

	public void setObject(String object)
	{
		this.object = object;
	}

	public Date getCreatedAt()
	{
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt)
	{
		this.createdAt = createdAt;
	}

	public Boolean getCreditLineChanged()
	{
		return this.creditLineChanged;
	}

	public void setCreditLineChanged(Boolean creditLineChanged)
	{
		this.creditLineChanged = creditLineChanged;
	}

	public String getMessage()
	{
		return this.message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

}
