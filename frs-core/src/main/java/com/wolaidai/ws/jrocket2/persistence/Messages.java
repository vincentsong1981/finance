package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Messages generated by hbm2java
 */
public class Messages implements java.io.Serializable
{

	private int id;
	private Integer messagableId;
	private String messagableType;
	private String format;
	private String otp;
	private Date expiredAt;
	private Date createdAt;
	private Date updatedAt;
	private Boolean isValid;
	private String mobile;

	public Messages()
	{}

	public Messages(int id, Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Messages(int id, Integer messagableId, String messagableType, String format, String otp, Date expiredAt,
			Date createdAt, Date updatedAt, Boolean isValid, String mobile)
	{
		this.id = id;
		this.messagableId = messagableId;
		this.messagableType = messagableType;
		this.format = format;
		this.otp = otp;
		this.expiredAt = expiredAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isValid = isValid;
		this.mobile = mobile;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Integer getMessagableId()
	{
		return this.messagableId;
	}

	public void setMessagableId(Integer messagableId)
	{
		this.messagableId = messagableId;
	}

	public String getMessagableType()
	{
		return this.messagableType;
	}

	public void setMessagableType(String messagableType)
	{
		this.messagableType = messagableType;
	}

	public String getFormat()
	{
		return this.format;
	}

	public void setFormat(String format)
	{
		this.format = format;
	}

	public String getOtp()
	{
		return this.otp;
	}

	public void setOtp(String otp)
	{
		this.otp = otp;
	}

	public Date getExpiredAt()
	{
		return this.expiredAt;
	}

	public void setExpiredAt(Date expiredAt)
	{
		this.expiredAt = expiredAt;
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

	public Boolean getIsValid()
	{
		return this.isValid;
	}

	public void setIsValid(Boolean isValid)
	{
		this.isValid = isValid;
	}

	public String getMobile()
	{
		return this.mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

}